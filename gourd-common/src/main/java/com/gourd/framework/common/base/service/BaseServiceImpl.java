package com.gourd.framework.common.base.service;

import com.gourd.framework.common.base.bean.BaseEntity;
import org.springframework.data.domain.Page;
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
    public String add(T t) {
        j.save(t);
        return t.getId();
    }

    @Override
    public void update(T t) {
        j.save(t);
    }

    @Override
    public void deleteById(String id) {
        j.delete(id);
    }

    @Override
    public void deleteByBatchIds(String ids) {
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
    public Page<T> findByPage(Pageable pageable) {
        return j.findAll(pageable);
    }
}
