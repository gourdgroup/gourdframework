package com.gourd.framework.manager.user.bean;

import com.gourd.framework.common.base.bean.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * Title:用户信息
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  15:05
 */
@Table(name = "t_user")
@ApiModel("用户信息")
@Data
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 4442970341659879262L;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("账号")
    private String loginName;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("手机号")
    private String telephone;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("最后一次更新密码时间")
    private String lastChangePwdTime;

    @ApiModelProperty("最后一次登录IP地址")
    private String lastLoginIp;
}
