package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nwafu.cet.common.MybatisPageHelper;
import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;

import cn.nwafu.cet.model.Menu;
import cn.nwafu.cet.dao.MenuMapper;
import cn.nwafu.cet.service.MenuService;

/**
 * ---------------------------
 *  (MenuServiceImpl)         
 * ---------------------------
 * 作者：  Johnny
 * 时间：  2020-10-08 15:14:13
 * 说明：
 * ---------------------------
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;

	@Override
	public int save(Menu record) {
		if(record.getId() == null || record.getId() == 0) {
			return menuMapper.add(record);
		}
		return menuMapper.update(record);
	}

	@Override
	public int delete(Menu record) {
		return menuMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Menu> records) {
		for(Menu record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Menu findById(Integer id) {
		return menuMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, menuMapper);
	}

	@Override
	public List<Menu> findMenuByRole(Role role) {
		return menuMapper.findMenuByRole(role.getId());
	}
}
