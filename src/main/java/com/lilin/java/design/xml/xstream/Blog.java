package com.lilin.java.design.xml.xstream;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: Blog
 * @date 2019/3/17上午11:25
 */
@Data
public class Blog {

    private Author writer;


    private List<Entry> list = new ArrayList();


    public Blog(Author writer) {
        this.writer = writer;
    }

    public void add(Entry entry) {
        list.add(entry);
    }

    public Author getWriter() {
        return writer;
    }

    public void setWriter(Author writer) {
        this.writer = writer;
    }

    public List<Entry> getList() {
        return list;
    }

    public void setList(List<Entry> list) {
        this.list = list;
    }
}
