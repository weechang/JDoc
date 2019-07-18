package xyz.weechang.jdoc.bean;

/**
 * Java Class 信息
 * @author zhangwei
 * date 2019/7/19
 * time 0:09
 */
public class ClassInfo {

    /*** 类名 */
    private String className;

    /*** 类描述 */
    private String classDesc;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }
}
