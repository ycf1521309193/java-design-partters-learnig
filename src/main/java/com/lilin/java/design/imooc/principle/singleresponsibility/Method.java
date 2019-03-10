package com.lilin.java.design.imooc.principle.singleresponsibility;

/**
 * @author lilin
 * @Title: Method
 * @date 2019/3/9下午7:40
 */
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "rock";
        address = "shenzhen";
    }

    private void updateUserName(String userName) {
        userName = "rockli";
    }

    private void updateUserAddress(String address) {
        address = "shenzhen";
    }
}
