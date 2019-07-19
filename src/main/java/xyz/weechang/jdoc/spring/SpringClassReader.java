package xyz.weechang.jdoc.spring;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Controller 类读取
 *
 * @author zhangwei
 * date 2019/7/17
 * time 18:05
 */
public class SpringClassReader {

    /**
     * 获取所有controller的Class
     *
     * @param packageName 扫描的包名
     * @return controller包信息
     */
    public static Map<String, Set<Class<?>>> getController(String packageName) {
        Reflections reflections = new Reflections(packageName);
        Class controller = null;
        Class restController = null;
        try {
            controller = Class.forName(SpringConst.CONTROLLER_CLASS);
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        try {
            restController = Class.forName(SpringConst.REST_CONTROLLER_CLASS);
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        Map<String, Set<Class<?>>> ctrlClazzMap = new HashMap<String, Set<Class<?>>>();
        if (controller != null) ctrlClazzMap.put(SpringConst.CONTROLLER_CLASS, reflections.getTypesAnnotatedWith(controller));
        if (restController != null) ctrlClazzMap.put(SpringConst.REST_CONTROLLER_CLASS, reflections.getTypesAnnotatedWith(restController));
        return ctrlClazzMap;
    }
}
