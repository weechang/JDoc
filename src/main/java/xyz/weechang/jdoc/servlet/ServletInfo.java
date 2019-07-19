package xyz.weechang.jdoc.servlet;

import xyz.weechang.jdoc.bean.ClassInfo;

/**
 * servlet 信息
 *
 * @author zhangwei
 * date 2019/7/19
 * time 0:08
 */
public class ServletInfo {

    /*** 基本类信息 */
    private ClassInfo classInfo;

    /*** mapping 信息 */
    private MappingInfo mapping;

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public MappingInfo getMapping() {
        return mapping;
    }

    public void setMapping(MappingInfo mapping) {
        this.mapping = mapping;
    }
}
