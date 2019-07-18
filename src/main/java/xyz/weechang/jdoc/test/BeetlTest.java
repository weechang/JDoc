package xyz.weechang.jdoc.test;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwei
 * date 2019/7/18
 * time 22:58
 */
public class BeetlTest {

    public static void main(String[] args) throws IOException {
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("xyz/weechang/jdoc/tpl/", "utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template template = gt.getTemplate("beetl.html.vm");
        List<String> controllers = new ArrayList<String>();
        controllers.add("info");
        template.binding("controllers", controllers);
        String str = template.render();
        System.out.println(str);
    }
}
