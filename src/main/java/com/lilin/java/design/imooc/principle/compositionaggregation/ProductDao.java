package com.lilin.java.design.imooc.principle.compositionaggregation;

/**
 * @author lilin
 * @Title: ProductDao
 * @date 2019/3/9下午10:00
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "增加产品");
    }
}
