package com.gourd.framework.common.base.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title:
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  13:50
 */
@RestController
public abstract class BaseController<T> {

    protected final static Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 新增实体类
     * @param t
     * @return
     */
    public abstract BaseResult<T> add(@RequestBody T t);

    /**
     * 更新实体类
     * @param t
     * @return
     */
    public abstract BaseResult<T> update(@RequestBody T t);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    public abstract BaseResult<Boolean> delById(@PathVariable Long id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public abstract BaseResult<Boolean> delByIds(@PathVariable String ids);

    /**
     * 根据ID查找实体类
     * @param id
     * @return
     */
    public abstract BaseResult<T> findById(@PathVariable Long id);

    /**
     * 根据分页参数返回数据
     * @param start
     * @param pageSize
     * @return
     */
    public abstract BaseResult<Page<T>> findAll(@PathVariable int start, @PathVariable int pageSize);

    /**
     * 返回所有数据
     * @return
     */
    public abstract BaseResult<List<T>> findAll();
}
