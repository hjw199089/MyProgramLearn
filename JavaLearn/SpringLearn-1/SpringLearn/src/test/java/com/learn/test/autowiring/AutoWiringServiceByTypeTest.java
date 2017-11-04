package com.learn.test.autowiring;

import com.learn.spring.autowiring.AutoWiringService;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hjw on 17/11/4.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringServiceByTypeTest extends UnitTestBase {
    public AutoWiringServiceByTypeTest() {
        super("classpath:spring-autowiring-bytype.xml");
    }

    @Test
    public void testSay() {
        AutoWiringService service = super.getBean("autoWiringService");
        service.say(" this is a test");
    }

//    In setAutoWiringDAO Function...
//    AutoWiringDAO :  this is a test
}
