package com.learn.spring.bean.scope;

/**
 * Created by hjw on 17/11/4.
 */
public class BeanScope {
    public void say(String args) {
        //打印自身的hashCode来标识是否是单例
        System.out.println("BeanScope " + args + "say: " + this.hashCode());
    }
}
