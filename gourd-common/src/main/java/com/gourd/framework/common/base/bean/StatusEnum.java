package com.gourd.framework.common.base.bean;


/**
 * Title:数据状态位
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  11:12
 */
public enum StatusEnum {
    NORMAL("1","正常"),
    DELETED("2","删除"),
    FORBIDEEN("3","禁用");

    private String id;
    private String name;

    StatusEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
