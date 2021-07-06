package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nwafu.cet.common.MybatisPageHelper;
import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;

import cn.nwafu.cet.model.Role;
import cn.nwafu.cet.dao.RoleMapper;
import cn.nwafu.cet.service.RoleService;

/**
 * ---------------------------
 *  (RoleServiceImpl)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public int save(Role record) {
		if(record.getId() == null || record.getId() == 0) {
			return roleMapper.add(record);
		}
		return roleMapper.update(record);
	}

	@Override
	public int delete(Role record) {
		return roleMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Role> records) {
		for(Role record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Role findById(Integer id) {
		return roleMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, roleMapper);
	}

	@Override
	public Role findRoleByUser(User user) {
		return null;
	}
}
