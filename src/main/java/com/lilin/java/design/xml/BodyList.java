package com.lilin.java.design.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: BodyList
 * @date 2019/3/15下午10:06
 */
@Data
@XStreamAlias("body")
public class BodyList {


    private List<Student> list = new ArrayList<>();

}
