package com.learn.test.bean.scope;

import com.learn.spring.bean.scope.BeanScope;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopePrototypeTest  extends UnitTestBase{

    public BeanScopePrototypeTest() {
        super("classpath:spring-bean-scope-prototype.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say("beanScope");

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say("beanScope2");
    }

//    BeanScope beanScopesay: 2095490653
//    BeanScope beanScope2say: 352359770

}
