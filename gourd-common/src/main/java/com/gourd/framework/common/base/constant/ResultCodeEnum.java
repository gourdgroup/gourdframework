package com.gourd.framework.common.base.constant;

/**
 * Title:结果编码表
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  14:26
 */
public enum ResultCodeEnum {

    SUCCESS("200", "成功"),

    //系统级别错误
    NOT_PERMISSION("403", "没有权限"),
    NOT_FOUNT("404", "找不到该页面"),
    SYSTEM_ERROR("500", "系统错误"),

    //业务级别错误
    VALICODE_TIMEOUT("901", "验证码失效，请刷新验证码"),
    TOKEN_TIMEOUT("902", "access_token失效，请重新登录"),
    AUTH_FAILED("903", "用户名或密码错误"),
    USER_FORBIDDEN("904", "账号被禁用，请联系管理员");

    private String resultCode;
    private String message;

    ResultCodeEnum(String resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
