package com.sxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sxx.App;
import com.sxx.domain.User;
import com.sxx.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =App.class)
public class Test_1 {
	@Autowired
	private IUserService userService;
	
	@Test
	public void testName() throws Exception {
		User user = userService.get(1L);
		System.out.println(user);
		
	}

}
