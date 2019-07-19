package xyz.weechang.jdoc.bean;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 方法读取
 */
public class MethodReader {

    /**
     * 方法读取
     * @param method 方法
     * @return 方法信息
     */
    public static MethodInfo methodRead(Method method) {
        MethodInfo methodInfo = new MethodInfo();
        String methodName = method.getName();
        // todo 读取方法描述
        String methodDesc = null;
        List<ClassInfo> requestInfos = new ArrayList<ClassInfo>();
        Class[] parameterTypes =  method.getParameterTypes();
        for (Class parameterType : parameterTypes) {
            requestInfos.add(ClassReader.readClassInfo(parameterType, true, false));
        }
        Class response = method.getReturnType();
        ClassInfo responseInfo = ClassReader.readClassInfo(response, true, false);
        methodInfo.setMethodName(methodName);
        methodInfo.setMethodDesc(methodDesc);
        methodInfo.setRequestInfos(requestInfos);
        methodInfo.setResponseInfo(responseInfo);
        return methodInfo;
    }
}
