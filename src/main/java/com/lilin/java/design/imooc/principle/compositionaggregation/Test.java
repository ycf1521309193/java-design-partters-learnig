package com.lilin.java.design.imooc.principle.compositionaggregation;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午10:02
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();

        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
