package com.lilin.java.design.guava.retry;

import com.github.rholder.retry.*;
import com.google.common.base.Predicates;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author lilin
 * @Title: RetryerBuilderTest
 * @date 2019/5/27上午12:41
 */
public class RetryerBuilderTest {

    @Test
    public void testWithWaitStrategy() throws ExecutionException, RetryException {
        Callable<Boolean> callable = notNullAfter5Attempts();
        Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
                .withWaitStrategy(WaitStrategies.fixedWait(50L, TimeUnit.MILLISECONDS))
                .retryIfResult(Predicates.isNull())
                .build();
        long start = System.currentTimeMillis();
        boolean result = retryer.call(callable);
        long cost = System.currentTimeMillis() - start;
        System.out.println("耗时" + cost + " MS");
        assertTrue(cost >= 250L);
        assertTrue(result);
    }

    @Test
    public void testWithStopStrategy() throws ExecutionException {
        Callable<Boolean> callable = notNullAfter5Attempts();
        Retryer<Boolean> retryer = RetryerBuilder.<Boolean>newBuilder()
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))
                .retryIfResult(Predicates.isNull())
                .build();
        try {
            retryer.call(callable);
            fail("RetryException expected");
        } catch (RetryException e) {
            assertEquals(3, e.getNumberOfFailedAttempts());
        }
    }

    /**
     * 重试5次后不返回null
     *
     * @return
     */
    private Callable<Boolean> notNullAfter5Attempts() {
        return new Callable<Boolean>() {
            int counter = 0;

            @Override
            public Boolean call() throws Exception {
                if (counter < 5) {
                    counter++;
                    return null;
                }
                return true;
            }
        };
    }
}
