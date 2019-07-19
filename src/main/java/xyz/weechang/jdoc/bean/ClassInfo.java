package xyz.weechang.jdoc.bean;

import java.util.List;

/**
 * Java Class 信息
 *
 * @author zhangwei
 * date 2019/7/19
 * time 0:09
 */
public class ClassInfo {

    /*** 类名 */
    private String className;

    /*** 类名简写 */
    private String classSimpleName;

    /*** 类描述 */
    private String classDesc;

    /*** 字段 */
    private List<FieldInfo> fields;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassSimpleName() {
        return classSimpleName;
    }

    public void setClassSimpleName(String classSimpleName) {
        this.classSimpleName = classSimpleName;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public List<FieldInfo> getFields() {
        return fields;
    }

    public void setFields(List<FieldInfo> fields) {
        this.fields = fields;
    }
}
