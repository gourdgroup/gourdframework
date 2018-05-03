package com.gourd.framework.common.base.bean;

/**
 * <p>
 * Title:数据状态位
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2018
 * </p>
 *
 * <p>
 * Company:互撸娃大战铁茎肛.avi
 * </p>
 *
 * @author:<a href="mailto:8574157@qq.com">zengmx</a>
 *
 * @version 1.0
 *
 * @createtime 2018/5/2  14:13
 *
 * @修改历史
 *
 * <li>版本号 修改日期 修改人 修改说明
 *
 * <li>
 *
 * <li>
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
