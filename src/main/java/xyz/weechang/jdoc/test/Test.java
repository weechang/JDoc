package xyz.weechang.jdoc.test;

import com.alibaba.fastjson.JSON;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import xyz.weechang.jdoc.doc.ExtClassDoc;
import xyz.weechang.jdoc.doc.FileReader;
import xyz.weechang.jdoc.doc.JavadocReader;
import xyz.weechang.jdoc.spring.SpringClassReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 调试类
 *
 * @author zhangwei
 * date 2019/7/18
 * time 22:58
 */
public class Test {

    public static void main(String[] args) throws IOException {
//        beetlTest();
//        jsonTest();
        javaDocTest();
//        fileReaderTest();
    }

    /**
     * beetl 测试
     *
     * @throws IOException
     */
    public static void beetlTest() throws IOException {
        System.out.println("____开始beetl测试____");
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("xyz/weechang/jdoc/tpl/", "utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template template = gt.getTemplate("beetl.html.vm");
        List<String> controllers = new ArrayList<String>();
        controllers.add("info");
        template.binding("controllers", controllers);
        String str = template.render();
        System.out.println(str);
        System.out.println("____结束beetl测试____");
    }

    /**
     * json 测试
     */
    public static void jsonTest() {
        System.out.println("____开始json测试____");
        String str = "{\"playerID\":1234,\"name\":\"Test\",\"itemList\":[{\"itemID\":1,\"name\":\"Axe\",\"atk\":12,\"def\":0},{\"itemID\":2,\"name\":\"Sword\",\"atk\":5,\"def\":5},{\"itemID\":3,\"name\":\"Shield\",\"atk\":0,\"def\":10}]}\n";
        JSON json = JSON.parseObject(str);
        System.out.println(JSON.toJSONString(json, true));;
        System.out.println("____结束json测试____");
    }

    /**
     * javadoc 测试
     */
    public static void javaDocTest() {
        System.out.println("____开始javadoc测试____");
//        ExtClassDoc doc = JavadocReader.read("E:\\code\\self\\JDoc\\src\\main\\java\\xyz\\weechang\\jdoc\\spring\\SpringMethodReader.java");
        ExtClassDoc doc = JavadocReader.read(FileReader.getFilePath(SpringClassReader.class.getName()));
        String javadoc = doc.output();
        System.out.println(javadoc);
        System.out.println("____结束javadoc测试____");
    }

    /**
     * fileReader 测试
     */
    public static void fileReaderTest() {
        System.out.println("____开始fileReader测试____");
        String str = FileReader.getFilePath(SpringClassReader.class.getName());
        System.out.println(str);
        System.out.println("____结束fileReader测试____");
    }

}
