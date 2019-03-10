package com.lilin.java.design.imooc.principle.demeter;

/**
 * @author lilin
 * @Title: Boss
 * @date 2019/3/9下午8:27
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
