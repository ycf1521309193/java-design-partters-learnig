package com.lilin.java.design.imooc.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: TeamLeader
 * @date 2019/3/9下午8:28
 */
public class TeamLeader {

    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程数量=" + courseList.size());
    }
}
