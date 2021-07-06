package cn.nwafu.cet.service;

import cn.nwafu.cet.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * ---------------------------
 *  (UserService)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface UserService extends CurdService<User> {
    User findByName(String name);
    User findByEmail(String email);
    List<User> findByNamePage(String username);
    int updateUser(User user);
    int delUser(User user);
    int batchDelUser(List<User> records);
}
