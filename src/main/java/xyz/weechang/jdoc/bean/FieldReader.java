package xyz.weechang.jdoc.bean;

import java.lang.reflect.Field;

/**
 * 字段读取器
 *
 * @author zhangwei
 * date 2019/7/19
 * time 14:17
 */
public class FieldReader {

    /**
     * 读取字段信息
     *
     * @param field 字段
     * @return 字段信息
     */
    public static FieldInfo readFiledInfo(Field field) {
        FieldInfo fieldInfo = new FieldInfo();
        String fieldName = field.getName();
        Class<?> type = field.getType();
        String fieldType = type.getName();
        // todo 读取字段描述
        String fieldDesc = null;
        // todo 读取字段必填
        boolean fieldRequired = false;
        fieldInfo.setFieldName(fieldName);
        fieldInfo.setFieldType(fieldType);
        fieldInfo.setFieldDesc(fieldDesc);
        fieldInfo.setFieldRequired(fieldRequired);
        return fieldInfo;
    }
}
