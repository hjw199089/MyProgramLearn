package com.learn.test.bean.lifecycle;

import com.learn.spring.bean.lifecycle.BeanLifeCycleImplPro;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleImplProTest extends UnitTestBase {
    public BeanLifeCycleImplProTest() {
        super("classpath:spring-bean-lifecycle-pro.xml");
    }
    @Test
    public void test1(){

        BeanLifeCycleImplPro beanLifeCycle =  super.getBean("beanLifeCycle");
        System.out.println("beanLifeCycle.code = " + beanLifeCycle.getCode());
    }
    //这里可见全局配置的defautInit和defaultDestroy没有执行
    //InitializingBean先于init,正式由于这个,beanLifeCycle.code = 2而不是3
    //DisposableBean先于destroy

    //    Bean InitializingBean.afterPropertiesSet.
    //    Bean init-method.
    //    beanLifeCycle.code = 2
    //    Bean DisposableBean.destroy.
    //    Bean destroy-method.
}