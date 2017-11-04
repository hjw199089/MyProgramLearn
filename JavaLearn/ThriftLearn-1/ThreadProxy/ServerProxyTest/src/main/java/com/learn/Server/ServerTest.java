package com.learn.Server;


import com.learn.proxy.ThriftServerProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by hjw on 17/10/29.
 */
public class ServerTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-server.xml");
        ThriftServerProxy thriftServerProxy = (ThriftServerProxy) context.getBean(ThriftServerProxy.class);
        thriftServerProxy.start();
    }
}
