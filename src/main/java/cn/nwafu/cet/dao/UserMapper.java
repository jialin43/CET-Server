package cn.nwafu.cet.dao;

import java.util.List;

import cn.nwafu.cet.model.Input;
import cn.nwafu.cet.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * ---------------------------
 *  (UserMapper)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
public interface UserMapper {

	/**
	 * 添加
	 *
	 * @param record
	 * @return
	 */
	int add(User record);

	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int delete(int id);

	/**
	 * 修改
	 * @param record
	 * @return
	 */
	int update(User record);
	User findById(@Param(value="id") int id);
	User findByName(@Param(value="name") String name);
	User findByEmail(@Param(value="email") String email);
	List<User> findPage();

	List<User> findPageByRoleAndUsername(@Param(value="role") String role, @Param(value="username") String username);

	List<User> findPageByRole(@Param(value="role") String role);
}