package com.learn.spring.ioc.injection.dao;

/**
 * Created by hjw on 17/11/4.
 */
public class InjectionDAOImpl implements InjectionDAO {
    //模拟将数据存入数据库
    @Override
    public void save(String arg) {
        System.out.println("保存数据: " + arg);
    }
}
