package xyz.weechang.jdoc.bean;

/**
 * Java field 信息
 *
 * @author zhangwei
 * date 2019/7/19
 * time 0:10
 */
public class FieldInfo {

    /*** 变量名 */
    private String fieldName;

    /*** 变量类型 */
    private String fieldType;

    /*** 变量描述 */
    private String fieldDesc;

    /*** 是否必填 */
    private boolean fieldRequired;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public boolean getFieldRequired() {
        return fieldRequired;
    }

    public void setFieldRequired(boolean fieldRequired) {
        this.fieldRequired = fieldRequired;
    }
}
