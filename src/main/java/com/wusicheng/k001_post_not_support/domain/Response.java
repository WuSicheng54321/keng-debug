package com.wusicheng.k001_post_not_support.domain;

/**
 *  通用返回
 */
public class Response {
    /**
     * 是否出错
     */
    private boolean hasError;

    /**
     *  错误标识码
     */
    private String code;

    /**
     *  错误详细信息
     */
    private String msg;

    public Response() {
        super();
    }

    public Response(boolean hasError, String code, String msg) {
        this.hasError = hasError;
        this.code = code;
        this.msg = msg;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Response success() {
        return new Response(false, "001", "操作成功");
    }
}
