package com.lilin.java.design.guava.retry;

import com.github.rholder.retry.AttemptTimeLimiters;
import com.github.rholder.retry.RetryException;
import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.google.common.util.concurrent.UncheckedTimeoutException;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author lilin
 * @Title: RetryApp
 * @date 2019/5/27上午12:18
 */
public class RetryApp {

    Retryer<Void> r = RetryerBuilder.<Void>newBuilder()
            .withAttemptTimeLimiter(AttemptTimeLimiters.<Void>fixedTimeLimit(1, TimeUnit.SECONDS))
            .build();

    @Test
    public void testAttemptTimeLimit() throws ExecutionException, RetryException {
        try {
            r.call(new SleepyOut(0L));
        } catch (ExecutionException e) {
            Assert.fail("Should not timeout");
        }

        try {
            r.call(new SleepyOut(10 * 1000L));
            Assert.fail("Expected timeout exception");
        } catch (ExecutionException e) {
            // expected
            Assert.assertEquals(UncheckedTimeoutException.class, e.getCause().getClass());
        }
    }

    static class SleepyOut implements Callable<Void> {

        final long sleepMs;

        SleepyOut(long sleepMs) {
            this.sleepMs = sleepMs;
        }

        @Override
        public Void call() throws Exception {
            Thread.sleep(sleepMs);
            System.out.println("I'm awake now");
            return null;
        }
    }
}
