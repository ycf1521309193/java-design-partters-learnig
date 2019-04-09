package com.lilin.java.design.xml.xstream;

import lombok.Data;

/**
 * @author lilin
 * @Title: Author
 * @date 2019/3/17上午11:25
 */
@Data
public class Author {

    private String name;

    public Author(String name) {
        this.name = name;
    }
}
