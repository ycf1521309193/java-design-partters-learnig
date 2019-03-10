package com.lilin.java.design.imooc.principle.demeter;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午8:30
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
