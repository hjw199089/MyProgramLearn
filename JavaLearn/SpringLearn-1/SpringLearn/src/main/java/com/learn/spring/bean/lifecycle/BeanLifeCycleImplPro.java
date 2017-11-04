package com.learn.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by hjw on 17/11/4.
 */

//继承>配置bean>全局
//当配置了继承>配置bean,全局不生效

//测试bean的InitializingBean和DisposableBean

//InitializingBean先于init,正式由于这个,beanLifeCycle.code = 2而不是3
//DisposableBean先于destroy

//    Bean InitializingBean.afterPropertiesSet.
//    Bean init-method.
//    beanLifeCycle.code = 2
//    Bean DisposableBean.destroy.
//    Bean destroy-method.
public class BeanLifeCycleImplPro implements InitializingBean,DisposableBean {
    private int code;

    //bean的全局初识化
    public void defautInit() {
        System.out.println("Bean defautInit.");
        this.code = 1;
    }
    //bean的全局销毁
    public void defaultDestroy() {
        System.out.println("Bean defaultDestroy.");
    }

    public int getCode() {
        return code;
    }

    //这是bean的init-method
    public void start() {
        System.out.println("Bean init-method.");
        this.code = 2;
    }
    //这是bean的destroy-method
    public void stop(){
        System.out.println("Bean destroy-method.");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Bean DisposableBean.destroy.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean InitializingBean.afterPropertiesSet.");
        this.code = 3;
    }
}
