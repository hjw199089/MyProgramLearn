package com.learn.test.ioc.interfaces;

import com.learn.spring.ioc.interfaces.OneInterface;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface() {
        super("classpath*:spring-ioc-interfaces.xml");
    }

    @Test
    public void testSay() {
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.say("This is a test.");
    }

}