package com.lilin.java.design.imooc.principle.compositionaggregation;

/**
 * @author lilin
 * @Title: MysqConnection
 * @date 2019/3/9下午9:58
 */
public class MysqlConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "Mysql数据库连接";
    }
}
