package com.lilin.java.design.imooc.principle.compositionaggregation;

/**
 * @author lilin
 * @Title: PostgreSQLConnection
 * @date 2019/3/9下午9:57
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
