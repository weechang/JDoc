package xyz.weechang.jdoc.spring;

import java.util.Map;
import java.util.Set;

/**
 * Spring 文档生成器
 *
 * @author zhangwei
 * date 2019/7/19
 * time 18:02
 */
public class SpringDocGenerator {

    /**
     * Spring文档生成
     *
     * @param basePackage 基础包
     */
    public static void docGenerator(String basePackage) {
        Map<String, Set<Class<?>>> controllerMap = SpringClassReader.getController(basePackage);
        Set<Class<?>> controllerSet = controllerMap.get(SpringConst.CONTROLLER_CLASS);
        Set<Class<?>> restControllerSet = controllerMap.get(SpringConst.REST_CONTROLLER_CLASS);
    }
}
