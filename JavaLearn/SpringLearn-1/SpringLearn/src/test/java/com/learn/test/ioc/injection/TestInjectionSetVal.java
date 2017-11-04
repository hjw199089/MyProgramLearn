package com.learn.test.ioc.injection;

import com.learn.spring.ioc.injection.service.InjectionService;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjectionSetVal extends UnitTestBase {

    public TestInjectionSetVal() {
        super("classpath:spring-ioc-injection-setval.xml");
    }

        @Test
        public void testSetter() {
            InjectionService service = super.getBean("injectionService");
            service.save("这是要保存的数据");
        }



}
