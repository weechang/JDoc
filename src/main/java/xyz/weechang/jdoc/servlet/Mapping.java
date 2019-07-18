package xyz.weechang.jdoc.servlet;

import xyz.weechang.jdoc.enums.RequestMethod;

/**
 * Mapping 信息
 *
 * @author zhangwei
 * date 2019/7/18
 * time 15:00
 */
public class Mapping {

    private String[] value;

    private RequestMethod[] method;

    private String[] params;

    private String[] headers;

    private String[] consumes;

    private String[] produces;

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
}
