package cn.itlaobing.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itlaobing.entity.Account;
import cn.itlaobing.mapper.AccountMapper;
import cn.itlaobing.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountMapper;
	
	
	
	@Transactional(readOnly=true)//使用只读事务
	@Override
	public Account findByAccount(String account, String password) {
		Account acc=accountMapper.findByAccount(account);
		if(acc!=null || password.equals(acc.getPassword())) {
			return acc;
		}
		return null;
	}

}
