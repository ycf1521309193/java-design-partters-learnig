package com.lilin.java.design.xml.project;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.xml.sax.InputSource;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author lilin
 * @Title: Tes
 * @date 2019/3/17下午11:30
 */
public class TestXml {


    public static String formatXml(String xml) {
        try {
            Transformer serializer = SAXTransformerFactory.newInstance().newTransformer();
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            Source xmlSource = new SAXSource(new InputSource(new ByteArrayInputStream(xml.getBytes())));
            StreamResult res = new StreamResult(new ByteArrayOutputStream());
            serializer.transform(xmlSource, res);
            return new String(((ByteArrayOutputStream) res.getOutputStream()).toByteArray());
        } catch (Exception e) {
            return xml;
        }
    }

    private Student getStudent() {
        Student student = new Student("netpayReq");
        student.addNote(new Note("first", "My first assignment."));
        student.addNote(new Note("second", "My Second assignment."));
        return student;
    }


    @Test
    public void test1() throws Exception {
        XStream xStream = new XStream();
        xStream.alias("body", Student.class);
        xStream.alias("coll", Note.class);
        String xml = xStream.toXML(getStudent());
        System.out.println(xml);
        System.out.println("--------------------------\n");
        System.out.println(formatXml(xml));
        System.out.println("--------------------------\n");
        System.out.println(addAttribute(xml));


    }

    private String addAttribute(String xml) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        Element element = document.getRootElement();
        Element listElement = element.element("list");
        listElement.addAttribute("name", "netpayReq");
        OutputFormat format = OutputFormat.createCompactFormat();
        format.setEncoding("UTF-8");
        ByteOutputStream byteOutputStream = new ByteOutputStream();
        XMLWriter writer = new XMLWriter(byteOutputStream, format);
        writer.write(document);
        writer.close();
        return new String(byteOutputStream.toByteArray(), "UTF-8");
    }
}
