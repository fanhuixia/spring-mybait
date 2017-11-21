package cn.itlaobing.service;

import cn.itlaobing.entity.Account;

public interface AccountService {
	public Account findByAccount(String account,String password);
}
