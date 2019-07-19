package xyz.weechang.jdoc.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 类读取器
 *
 * @author zhangwei
 * date 2019/7/19
 * time 14:17
 */
public class ClassReader {

    /**
     * 根据类名读取类信息
     *
     * @param clazz class
     * @return 类信息
     */
    public static ClassInfo readClassInfo(Class<?> clazz) {
        return readClassInfo(clazz, true, true);
    }

    /**
     * 根据类名读取类信息
     *
     * @param clazz class
     * @param readField 是否读取字段信息
     * @param readMethod 是否读取方法信息
     * @return 类信息
     */
    public static ClassInfo readClassInfo(Class<?> clazz, boolean readField, boolean readMethod) {
        ClassInfo classInfo = new ClassInfo();
        String className = clazz.getName();
        String classSimpleName = clazz.getSimpleName();
        // todo 读取类描述信息
        String classDesc = null;
        classInfo.setClassName(className);
        classInfo.setClassSimpleName(classSimpleName);
        classInfo.setClassDesc(classDesc);
        if (readField) {
            Field[] fields = clazz.getFields();
            if (fields.length > 0) {
                List<FieldInfo> fieldInfos = new ArrayList<FieldInfo>();
                for (Field field : fields) {
                    fieldInfos.add(FieldReader.readFiledInfo(field));
                }
                classInfo.setFields(fieldInfos);
            }
        }
        if (readMethod) {
            Method[] methods = clazz.getMethods();
            if (methods.length > 0) {
                List<MethodInfo> methodInfos = new ArrayList<MethodInfo>();
                for (Method method : methods) {
                    methodInfos.add(MethodReader.methodRead(method));
                }
                classInfo.setMethodInfos(methodInfos);
            }
        }
        return classInfo;
    }
}
