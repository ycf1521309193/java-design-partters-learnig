package com.lilin.java.design.xml.xstream;

import lombok.Data;

/**
 * @author lilin
 * @Title: Entry
 * @date 2019/3/17上午11:25
 */
@Data
public class Entry {

    private String attribute;
    private String title;
    private String description;

    public Entry(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Entry(String attribute, String title, String description) {
        this.attribute = attribute;
        this.title = title;
        this.description = description;
    }

    public Entry(String attribute) {
        this.attribute = attribute;
    }
}
