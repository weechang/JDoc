package xyz.weechang.jdoc.servlet;

import xyz.weechang.jdoc.bean.ClassInfo;
import xyz.weechang.jdoc.enums.RequestMethod;


/**
 * Mapping 信息
 *
 * @author zhangwei
 * date 2019/7/18
 * time 15:00
 */
public class Mapping {

    /*** 请求路径 */
    private String[] value;

    /*** 请求方法 */
    private RequestMethod[] method;

    /*** 请求参数 */
    private String[] params;

    /*** 请求头 */
    private String[] headers;

    /*** 请求类型 */
    private String[] consumes;

    /*** 返回类型 */
    private String[] produces;

    /*** 返回结果 */
    private ClassInfo response;

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public RequestMethod[] getMethod() {
        return method;
    }

    public void setMethod(RequestMethod[] method) {
        this.method = method;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public String[] getConsumes() {
        return consumes;
    }

    public void setConsumes(String[] consumes) {
        this.consumes = consumes;
    }

    public String[] getProduces() {
        return produces;
    }

    public void setProduces(String[] produces) {
        this.produces = produces;
    }

    public ClassInfo getResponse() {
        return response;
    }

    public void setResponse(ClassInfo response) {
        this.response = response;
    }
}
