package com.learn.test.beanannotation;

import com.learn.spring.beanannotation.BeanAnnotation;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	
	public TestBeanAnnotation() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.say("This is test.");
		
		bean = super.getBean("beanAnnotation");
		bean.say("This is test.");
	}
	
	@Test
	public void testScpoe() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();
		
		bean = super.getBean("beanAnnotation");
		bean.myHashCode();
	}
	//BeanAnnotation : This is test.
	//BeanAnnotation : This is test.
	//BeanAnnotation : 1473611564
	//BeanAnnotation : 107456312
}
