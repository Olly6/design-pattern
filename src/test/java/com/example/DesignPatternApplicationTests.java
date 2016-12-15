package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternApplicationTests {

	@Autowired
	ARuleHandler aRuleHandler;
	@Test
	public void contextLoads() {
		aRuleHandler.check(null);
	}

}
