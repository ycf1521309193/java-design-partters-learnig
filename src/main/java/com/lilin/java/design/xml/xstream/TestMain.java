package com.lilin.java.design.xml.xstream;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/17上午11:27
 */
public class TestMain {


    @Test
    public void test1() throws Exception {
        Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
        teamBlog.add(new Entry("attribute", "first", "My first blog entry."));
        teamBlog.add(new Entry("attribute", "tutorial",
                "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));
        XStream xstream = new XStream();
        xstream.alias("body", Blog.class);
        xstream.aliasField("author", Blog.class, "writer");

//        xstream.addImplicitCollection(Entry.class, "attribute");
        xstream.autodetectAnnotations(true);
        xstream.alias("coll", Entry.class);
//        xstream.registerConverter(new BlogConverter());
//        xstream.addImplicitCollection(Blog.class, "list");
        System.out.println(xstream.toXML(teamBlog));
    }
}
