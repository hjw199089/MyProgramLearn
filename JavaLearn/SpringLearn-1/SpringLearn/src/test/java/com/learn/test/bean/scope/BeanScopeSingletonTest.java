package com.learn.test.bean.scope;

import com.learn.spring.bean.scope.BeanScope;
import com.learn.spring.ioc.injection.service.InjectionService;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeSingletonTest extends UnitTestBase {
    public BeanScopeSingletonTest() {
        super("classpath:spring-bean-scope-singleton.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say("beanScope");

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say("beanScope2");
    }


    //beanScope3不同,是因为每个Test方法都要重新执行before after 重新生成了容器环境
    @Test
    public void testSay2() {
        BeanScope beanScope3 = super.getBean("beanScope");
        beanScope3.say("beanScope3");
    }

//    BeanScope beanScopesay: 1121453612
//    BeanScope beanScope2say: 1121453612
//    BeanScope beanScope3say: 1990451863

}

