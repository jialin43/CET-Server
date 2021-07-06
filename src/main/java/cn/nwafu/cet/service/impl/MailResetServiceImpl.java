package cn.nwafu.cet.service.impl;

import java.util.List;

import cn.nwafu.cet.common.PageRequest;
import cn.nwafu.cet.common.PageResult;
import cn.nwafu.cet.model.MailReset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.nwafu.cet.dao.MailResetMapper;
import cn.nwafu.cet.service.MailResetService;

/**
 * ---------------------------
 *  (MailResetServiceImpl)
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2020-12-29 09:45:55
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class MailResetServiceImpl implements MailResetService {

	@Autowired
	private MailResetMapper mailResetMapper;

	@Override
	public int save(MailReset record) {
		if(record.getId() == null || record.getId() == 0) {
			return mailResetMapper.add(record);
		}
		return mailResetMapper.update(record);
	}

	@Override
	public int delete(MailReset record) {
		return mailResetMapper.delete(record.getId());
	}

	@Override
	public int delete(List<MailReset> records) {
		for(MailReset record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public MailReset findById(Integer id) {
		return mailResetMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return null;
	}


	@Override
	public MailReset findByMail(String mail) {
		return mailResetMapper.findByMail(mail);
	}
}
