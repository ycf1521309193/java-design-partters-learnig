package com.lilin.java.design.xml.net;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilin
 * @Title: TestXStream
 * @date 2019/3/17上午12:25
 */
public class TestXStream {

    public List<Province> getProvinceList() {
        List<Province> provinceList = new ArrayList<Province>();
        Province p1 = new Province("北京");
        p1.addCity(new City("东城区", "东城区"));
        p1.addCity(new City("西城区", "西城区"));

        Province p2 = new Province("上海");
        p2.addCity(new City("徐汇区", "徐汇区"));
        p2.addCity(new City("浦东新区", "浦东新区"));
        provinceList.add(p1);
        provinceList.add(p2);
        return provinceList;
    }

    @Test
    public void testFun() throws Exception {
        List<Province> proList = getProvinceList();
        XStream xStream = new XStream();
        String xml = xStream.toXML(proList);
        System.out.println(xml);
    }


    @Test
    public void testFun1() throws Exception {
        List<Province> proList = getProvinceList();
        XStream xStream = new XStream(new DomDriver());

        xStream.alias("coll", Province.class);

        String xml = xStream.toXML(proList);
        System.out.println(xml);
    }
}
