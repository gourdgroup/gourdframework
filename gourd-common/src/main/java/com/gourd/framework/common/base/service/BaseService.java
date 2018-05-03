package com.gourd.framework.common.base.service;

import com.gourd.framework.common.base.bean.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Title:service接口
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  11:12
 */
public interface BaseService<T extends BaseEntity> {

    /**
     * 新增实体类
     * @param t
     * @return 返回新增实体类
     */
    T add(T t);

    /**
     * 更新实体类
     * @param t
     */
    T update(T t);

    /**
     * 根据ID删除实体类
     * @param id
     */
    void deleteById(String id);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(String ids);

    /**
     * 根据ID返回查询结果
     * @param id
     * @return
     */
    T findById(String id);

    /**
     * 获取所有的结果集
     * @return
     */
    List<T> findAll();

    /**
     * 返回分页的结果集
     * @param pageable
     * @return
     */
    Page<T> findAll(Pageable pageable);

    /**
     * 根据开始索引及页面数返回数据
     * @param start
     * @param pageSize
     * @return
     */
    Page<T> findAll(int start, int pageSize);

    /**
     * 返回总数
     * @return
     */
    long count();

    /**
     * 是否存在
     * @param id
     * @return
     */
    boolean exists(String id);
}
