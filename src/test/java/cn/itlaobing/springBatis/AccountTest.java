package cn.itlaobing.springBatis;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.itlaobing.entity.Account;
import cn.itlaobing.mapper.AccountMapper;
import cn.itlaobing.service.AccountService;
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountTest {
	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountMapper accountMapper;
	
	@Test
	public void testAccount() {
		String account="李四";
		String password="2234";
		
		Account acc=accountService.findByAccount(account, password);
		//断言
		Assert.assertNotNull(acc);
		
		Assert.assertEquals(account, acc.getAccount());
		Assert.assertEquals(password, acc.getPassword());
		
		
	}
	
}
