package com.lilin.java.design.imooc.principle.pattern.structural.proxy.db;

/**
 * @author lilin
 * @Title: DataSourceContextHolder
 * @date 2019/4/14下午6:18
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static String getDBType() {
        return CONTEXT_HOLDER.get();

    }

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }
}
