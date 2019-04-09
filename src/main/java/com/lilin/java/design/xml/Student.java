package com.lilin.java.design.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lilin
 * @Title: Student
 * @date 2019/3/15下午10:09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("coll")
public class Student {

    private String id;
    private String userName;
    private String idType;
    private String acctType;
}
