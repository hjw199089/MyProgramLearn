package com.learn.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by hjw on 17/11/4.
 */
public class BeanAware  implements ApplicationContextAware,BeanNameAware {
    private String beanName;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext : " + applicationContext.getBean(this.beanName).hashCode());
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("BeanAwareBeanName : " + name);
    }
}
