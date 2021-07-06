package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.common.MybatisPageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;

import cn.nwafu.cet.model.User;
import cn.nwafu.cet.dao.UserMapper;
import cn.nwafu.cet.service.UserService;

/**
 * ---------------------------
 *  (UserServiceImpl)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserMapper userMapper;

	@Override
	public int save(User record) {
		return userMapper.add(record);
	}

	@Override
	public int delete(User record) {
		return userMapper.delete(record.getId());
	}

	@Override
	public int delete(List<User> records) {
		return 0;
	}

	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		PageResult pageResult = null;
		String username = MybatisPageHelper.getColumnFilterValue(pageRequest,"label");
		System.out.println("username:"+username);
		if (!"".equals(username)){
			pageResult = MybatisPageHelper.findPage(pageRequest,userMapper,"findPageByRoleAndUsername","1",username);
		} else {
			pageResult  = MybatisPageHelper.findPage(pageRequest, userMapper,"findPageByRole","1");
		}
		return pageResult;
	}

	@Override
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@Override
	public User findByEmail(String email) {
		return userMapper.findByEmail(email);
	}

	@Override
	public List<User> findByNamePage(String username) {
		return null;
	}

	@Override
	public int updateUser(User user) {
		return userMapper.update(user);
	}

	@Override
	public int delUser(User user) {
		return userMapper.delete(user.getId());
	}

	@Override
	public int batchDelUser(List<User> records) {
		for(User user:records){
			delUser(user);
		}
		return 1;
	}

}

