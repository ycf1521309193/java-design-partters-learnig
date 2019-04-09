package com.lilin.java.design.xml.project;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: Body
 * @date 2019/3/17下午11:25
 */
@Data
public class Student {


    private String studentName;

    private List<Note> list = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public List<Note> addNote(Note note) {
        list.add(note);
        return list;
    }
}
