package xyz.weechang.jdoc.spring;

import org.reflections.Reflections;
import xyz.weechang.jdoc.core.ServletBean;

import java.util.Map;
import java.util.Set;

/**
 * Controller 类读取
 *
 * @author zhangwei
 * date 2019/7/17
 * time 18:05
 */
public class ControllerReader {

    public static Map<String, ServletBean> getController(String packageName)  {
        Reflections reflections = new Reflections(packageName);
        Class ctrClazz = null;
        Class restCtrClazz = null;
        try {
            ctrClazz =  Class.forName(SpringConst.CONTROLLER_CLASS_NAME);
            restCtrClazz = Class.forName(SpringConst.REST_CONTROLLER_CLASS_NAME);
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        if (ctrClazz == null && restCtrClazz == null) return null;
        Set<Class<?>> ctrList = null;
        Set<Class<?>> restCtrList = null;
        if (ctrClazz != null) ctrList = reflections.getTypesAnnotatedWith(ctrClazz);
        if (restCtrClazz != null) restCtrList = reflections.getTypesAnnotatedWith(restCtrClazz);

        return null;
    }
}
