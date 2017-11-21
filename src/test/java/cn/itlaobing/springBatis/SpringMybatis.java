package cn.itlaobing.springBatis;
import java.util.Date;
import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import cn.itlaobing.entity.Account;
import cn.itlaobing.mapper.AccountMapper;

@RunWith(SpringRunner.class)//测试用例运行的时候需要用到Spring容器
@ContextConfiguration(locations={"classpath:applicationContext.xml"})//pring配置文件的位置
public class SpringMybatis {
	@Autowired
	private AccountMapper accountMapper;
	
	@Test
	public void testSave() {
		Account account=new Account();
		account.setAccount("李四");
		account.setPassword("2234");
		account.setCrateat(new Date());
		accountMapper.insert(account);
		
	}
}
