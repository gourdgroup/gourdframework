package com.gourd.framework.manager.user.dao;

import com.gourd.framework.manager.user.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Title:
 * Company:互撸娃大战铁茎肛.avi
 *
 * @author <a href="mailto:8574157@qq.com">zengmx</a>
 * @date 2018/5/3  15:45
 */
public interface UserDao extends JpaRepository<User, String> {

    Page<User> findAllByUserNameLike(String username,Pageable pageable);
}
