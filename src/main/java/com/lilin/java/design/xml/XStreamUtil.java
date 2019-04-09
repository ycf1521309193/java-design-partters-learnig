package com.lilin.java.design.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.OutputStreamWriter;

/**
 * @author lilin
 * @Title: XStreamUtil
 * @date 2019/3/15下午10:14
 */
public class XStreamUtil {


    public static <T> T xml2Bean(String xmlStr, Class<T> tClass) {
        XStream xStream = new XStream(new DomDriver());
        xStream.processAnnotations(tClass);
        return (T) xStream.fromXML(xmlStr);

    }
}
