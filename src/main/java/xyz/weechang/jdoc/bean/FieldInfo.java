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
    private String feildName;

    /*** 变量类型 */
    private String feildType;

    /*** 变量描述 */
    private String feildDesc;

    /*** 是否必填 */
    private String feildRequerd;

    public String getFeildName() {
        return feildName;
    }

    public void setFeildName(String feildName) {
        this.feildName = feildName;
    }

    public String getFeildType() {
        return feildType;
    }

    public void setFeildType(String feildType) {
        this.feildType = feildType;
    }

    public String getFeildDesc() {
        return feildDesc;
    }

    public void setFeildDesc(String feildDesc) {
        this.feildDesc = feildDesc;
    }

    public String getFeildRequerd() {
        return feildRequerd;
    }

    public void setFeildRequerd(String feildRequerd) {
        this.feildRequerd = feildRequerd;
    }
}
