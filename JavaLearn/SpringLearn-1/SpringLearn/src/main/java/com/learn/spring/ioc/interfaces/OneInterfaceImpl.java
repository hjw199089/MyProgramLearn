package com.learn.spring.ioc.interfaces;

/**
 * Created by hjw on 17/11/4.
 */
public class OneInterfaceImpl implements OneInterface {
    @Override
    public void say(String arg) {
        System.out.println("ServiceImpl say: " + arg);
    }
}
