package com.learn.test.bean.lifecycle;

import com.learn.spring.bean.lifecycle.BeanLifeCycleDefault;
import com.learn.spring.bean.lifecycle.BeanLifeCycleInitMethod;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleInitMethodTest extends UnitTestBase {
    public BeanLifeCycleInitMethodTest() {
        super("classpath:spring-bean-lifecycle-initmethod.xml");
    }
    @Test
    public void test1(){
        BeanLifeCycleInitMethod beanLifeCycle =  super.getBean("beanLifeCycle");
        System.out.println("beanLifeCycle.code = " + beanLifeCycle.getCode());
    }
    //这里可见全局配置的defautInit和defaultDestroy没有执行
    //Bean init-method.
    //beanLifeCycle.code = 2
    //Bean destroy-method.
}
