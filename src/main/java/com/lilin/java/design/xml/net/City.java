package com.lilin.java.design.xml.net;

/**
 * @author lilin
 * @Title: City
 * @date 2019/3/17上午12:21
 */
public class City {

    private String name;
    private String description;

    public City(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
