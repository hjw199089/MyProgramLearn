package com.learn.Client;




import com.learn.proxy.ThriftClientProxy;
import com.learn.thrift.UserRequest;

import com.learn.thrift.UserResponse;
import com.learn.thrift.UserService;
import org.apache.thrift.TException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws TException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");

        ThriftClientProxy thriftClientProxy = (ThriftClientProxy) context.getBean(ThriftClientProxy.class);
        UserService.Iface client = (UserService.Iface)thriftClientProxy.getClient(UserService.class);
        UserRequest request = new UserRequest();
        request.setId("10000");
        UserResponse res = client.userInfo(request);
        System.out.println(res.getCode() + "- " + "name: " + res.getParams().get("name"));

    }
}