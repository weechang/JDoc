package xyz.weechang.jdoc.spring;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * RequestMapping 读取
 *
 * @author zhangwei
 * date 2019/7/18
 * time 9:31
 */
public class SpringMethodReader {

    /**
     * 获取controller 类里面的Mapping
     * @param controller controller类
     * @return MappingInfo
     */
    public static Map<String, Set<Method>> getMapping(Class controller) {
        Class requestMapping = null;
        Set<Method> requestMethods = null;
        Class getMapping = null;
        Set<Method> getMethods = null;
        Class postMapping = null;
        Set<Method> postMethods = null;
        Class putMapping = null;
        Set<Method> putMethods = null;
        Class patchMapping = null;
        Set<Method> patchMethods = null;
        Class deleteMapping = null;
        Set<Method> deleteMethods = null;
        try {
            requestMapping = Class.forName(SpringConst.REQUEST_MAPPING_CLASS);
            requestMethods = new HashSet<Method>();
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        try {
            getMapping = Class.forName(SpringConst.GET_MAPPING_CLASS);
            getMethods = new HashSet<Method>();
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        try {
            postMapping = Class.forName(SpringConst.POST_MAPPING_CLASS);
            postMethods = new HashSet<Method>();
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        try {
            putMapping = Class.forName(SpringConst.PUT_MAPPING_CLASS);
            putMethods = new HashSet<Method>();
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        try {
            patchMapping = Class.forName(SpringConst.PATCH_MAPPING_CLASS);
            patchMethods = new HashSet<Method>();
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        try {
            deleteMapping = Class.forName(SpringConst.DELETE_MAPPING_CLASS);
            deleteMethods = new HashSet<Method>();
        } catch (ClassNotFoundException e) {
            // do nothing
        }
        Method[] controllerMethods = controller.getMethods();
        if (controllerMethods == null || controllerMethods.length == 0) return null;
        for (Method method : controllerMethods) {
            Annotation requestAnno = method.getAnnotation(requestMapping);
            if (requestAnno != null) {
                requestMethods.add(method);
                continue;
            }
            Annotation getAnno = method.getAnnotation(getMapping);
            if (getAnno != null) {
                getMethods.add(method);
                continue;
            }
            Annotation postAnno = method.getAnnotation(postMapping);
            if (postAnno != null) {
                postMethods.add(method);
                continue;
            }
            Annotation putAnno = method.getAnnotation(putMapping);
            if (putAnno != null) {
                putMethods.add(method);
                continue;
            }
            Annotation patchAnno = method.getAnnotation(patchMapping);
            if (patchAnno != null) {
                patchMethods.add(method);
                continue;
            }
            Annotation deleteAnno = method.getAnnotation(deleteMapping);
            if (deleteAnno != null) deleteMethods.add(method);
        }
        Map<String, Set<Method>> methodMap = new HashMap<String, Set<Method>>();
        if (requestMethods != null && requestMethods.size() > 0) methodMap.put(SpringConst.REQUEST_MAPPING_CLASS, requestMethods);
        if (getMethods != null && getMethods.size() > 0) methodMap.put(SpringConst.GET_MAPPING_CLASS, getMethods);
        if (postMethods != null && postMethods.size() > 0) methodMap.put(SpringConst.POST_MAPPING_CLASS, postMethods);
        if (putMethods != null && putMethods.size() > 0) methodMap.put(SpringConst.PUT_MAPPING_CLASS, putMethods);
        if (patchMethods != null && patchMethods.size() > 0) methodMap.put(SpringConst.PATCH_MAPPING_CLASS, patchMethods);
        if (deleteMethods != null && deleteMethods.size() > 0) methodMap.put(SpringConst.DELETE_MAPPING_CLASS, deleteMethods);
        return methodMap;
    }
}
