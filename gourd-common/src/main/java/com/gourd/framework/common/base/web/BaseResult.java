package com.gourd.framework.common.base.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Title:
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  13:46
 */
@ApiModel("返回类基类")
@Data
public class BaseResult<T> {

    @ApiModelProperty(value = "返回信息编码，200为正常返回，其余编码见ResultCodeEnum")
    private String resultCode;

    @ApiModelProperty(value = "返回信息描述")
    private String message;

    @ApiModelProperty(value = "返回的数据")
    private T data;
}
