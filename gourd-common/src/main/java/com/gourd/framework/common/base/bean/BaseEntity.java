package com.gourd.framework.common.base.bean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * <p>
 * Title:
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
@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 933507917255518479L;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @ApiModelProperty(value = "主键ID", position = -99)
    protected String id;

    @Column(nullable = false)
    @ApiModelProperty(value = "状态位，1为正常，2为删除，3为禁用", position = -99)
    protected String status = StatusEnum.NORMAL.getId();

    @Column(nullable = false)
    @ApiModelProperty(value = "创建时间", position = -99)
    protected String createTime;

    protected String updateTime;

    @Column(nullable = false)
    @ApiModelProperty(value = "数据生成人员id", position = -99)
    protected String createUserId;

    @Column(nullable = false)
    @ApiModelProperty(value = "数据生成人员姓名", position = -99)
    protected String createUserName;

    @ApiModelProperty(value = "最后更新人员id", position = -99)
    protected String lastUpdateUserId;

    @ApiModelProperty(value = "最后更新人员姓名", position = -99)
    protected String lastUpdateUserName;
}
