package com.learn.test.aware;

import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAwareTest extends UnitTestBase{
    public BeanAwareTest() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void textBeanAware() {
        System.out.println("textBeanAware : " + super.getBean("beanAware").hashCode());
    }

    //BeanAwareBeanName : beanAware
    //setApplicationContext : 951880373
    //textBeanAware : 951880373

}
