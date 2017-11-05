package com.learn.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by hjw on 17/11/5.
 * Bean定义与作用域测试
 */
@Scope("prototype") //默认是singleton
//@Component("bean")
@Component // 不指定名字默认为BeanAnnotation的首字母改小写
public class BeanAnnotation {

    public void say(String arg) {
        System.out.println("BeanAnnotation : " + arg);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation : " + this.hashCode());
    }

}