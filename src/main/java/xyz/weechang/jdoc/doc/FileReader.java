package xyz.weechang.jdoc.doc;

import com.google.common.base.Joiner;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 文件读取
 *
 * @author zhangwei
 * date 2019/7/19
 * time 16:47
 */
public class FileReader {

    /**
     * 根据类名获取文件路径
     *
     * @param className 类名
     * @return 文件路径
     */
    public static String getFilePath(String className) {
        String[] preDir = {"src", "main", "java"};
        return getFilePath(className, preDir);
    }

    /**
     * 根据类名获取文件路径
     *
     * @param className 类名
     * @param preDir java package 的基础路径 如 src main java
     * @return 文件路径
     */
    public static String getFilePath(String className, String... preDir) {
        String basePath = System.getProperty("user.dir") + File.separator;
        String prePath = preDir == null || preDir.length == 0 ? "" : Joiner.on(File.separator).skipNulls().join(preDir) + File.separator;
        String javaPath = className.replace(".", File.separator) + ".java";
        return basePath + prePath + javaPath;
    }
}
