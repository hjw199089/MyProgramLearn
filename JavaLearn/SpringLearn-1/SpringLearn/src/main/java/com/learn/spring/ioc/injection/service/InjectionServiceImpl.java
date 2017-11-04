package com.learn.spring.ioc.injection.service;

import com.learn.spring.ioc.injection.dao.InjectionDAO;

/**
 * Created by hjw on 17/11/4.
 */
public class InjectionServiceImpl implements InjectionService{
    InjectionDAO injectionDAO;

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public InjectionServiceImpl() {
    }

    //值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //业务逻辑调用Dao
    @Override
    public void save(String args) {
        System.out.println("Service接收到数据 + " + args);
        System.out.println("Service处理中...");
        args = args + ":" + this.hashCode();
        System.out.println("Service开始保存数据....");
        injectionDAO.save(args);
        System.out.println("数据已落库,执行完毕");
    }
}
