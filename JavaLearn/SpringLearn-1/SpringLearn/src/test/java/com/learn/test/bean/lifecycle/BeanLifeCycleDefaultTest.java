package com.learn.test.bean.lifecycle;

import com.learn.spring.bean.lifecycle.BeanLifeCycleDefault;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleDefaultTest extends UnitTestBase {
    public BeanLifeCycleDefaultTest() {
        super("classpath:spring-bean-lifecycle-default.xml");
    }

    @Test
    public void test1(){
        BeanLifeCycleDefault beanLifeCycle =  super.getBean("beanLifeCycle");
        System.out.println("beanLifeCycle.code = " + beanLifeCycle.getCode());
    }

    //    Bean defautInit.
    //    beanLifeCycle.code = 1
    //    Bean defaultDestroy.
}
