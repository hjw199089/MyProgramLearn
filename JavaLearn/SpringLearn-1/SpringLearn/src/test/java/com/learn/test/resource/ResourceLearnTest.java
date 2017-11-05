package com.learn.test.resource;

import com.learn.spring.ioc.interfaces.OneInterface;
import com.learn.spring.resource.ResourceLearn;
import com.learn.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by hjw on 17/11/5.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ResourceLearnTest extends UnitTestBase {
    public ResourceLearnTest() {
        super("classpath*:spring-resources.xml");
    }

    @Test
    public void testResourceByNone() {
        ResourceLearn resourceLearn = super.getBean("resourceLearn");
        try {
            System.out.println("====测试resourceByNone");
            resourceLearn.resourceByNone();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testResourceByClasspath() {
        ResourceLearn resourceLearn = super.getBean("resourceLearn");
        try {
            System.out.println("====测试resourceByClasspath");
            resourceLearn.resourceByClasspath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testResourceByFile() {
        ResourceLearn resourceLearn = super.getBean("resourceLearn");
        try {
            System.out.println("====测试resourceByFile");
            resourceLearn.resourceByFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testResourceByURL() {
        ResourceLearn resourceLearn = super.getBean("resourceLearn");
        try {
            System.out.println("====测试resourceByURL");
            resourceLearn.resourceByURL();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
