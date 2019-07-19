package xyz.weechang.jdoc.bean;

import java.util.List;

/**
 * 方法信息
 */
public class MethodInfo {

    /*** 方法名 */
    private String methodName;

    /*** 方法描述 */
    private String methodDesc;

    /*** 请求参数 */
    private List<ClassInfo> requestInfos;

    /*** 返回参数 */
    private ClassInfo responseInfo;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodDesc() {
        return methodDesc;
    }

    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc;
    }

    public List<ClassInfo> getRequestInfos() {
        return requestInfos;
    }

    public void setRequestInfos(List<ClassInfo> requestInfos) {
        this.requestInfos = requestInfos;
    }

    public ClassInfo getResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(ClassInfo responseInfo) {
        this.responseInfo = responseInfo;
    }
}
