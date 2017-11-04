package com.learn.client;

import com.learn.pool.UserServiceClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");
        UserServiceClient userServiceClient = (UserServiceClient) context.getBean(UserServiceClient.class);
        userServiceClient.invoke();
    }
}