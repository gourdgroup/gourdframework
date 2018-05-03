package com.gourd.framework.common.base.service;

import com.gourd.framework.common.base.bean.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Title:
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  11:39
 */
public abstract class BaseServiceImpl<T extends BaseEntity, J extends JpaRepository<T, String>> implements BaseService<T> {

    J j;

    @Override
    public T add(T t) {
        j.save(t);
        return t;
    }

    @Override
    public T update(T t) {
        j.save(t);
        return t;
    }

    @Override
    public void deleteById(String id) {
        j.delete(id);
    }

    @Override
    public void deleteByIds(String ids) {
        String[] idArray = ids.split(",");
        for(String id : idArray) {
            j.delete(id);
        }
    }

    @Override
    public T findById(String id) {
        return j.findOne(id);
    }

    @Override
    public List<T> findAll() {
        return j.findAll();
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return j.findAll(pageable);
    }

    @Override
    public Page<T> findAll(int start, int pageSize) {
        Pageable pageable = new PageRequest(start-1, pageSize);
        return j.findAll(pageable);
    }

    @Override
    public long count() {
        return j.count();
    }

    @Override
    public boolean exists(String id) {
        return j.exists(id);
    }
}
