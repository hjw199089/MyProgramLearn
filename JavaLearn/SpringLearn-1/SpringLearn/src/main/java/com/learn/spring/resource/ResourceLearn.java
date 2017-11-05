package com.learn.spring.resource;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by hjw on 17/11/5.
 */

//ClassPathResource可用来获取类路径下的资源文件。假设我们有一个资源文件test.txt在类路径下，我们就可以通过给定对应资源文件在类路径下的路径path来获取它，new ClassPathResource(“test.txt”)。
//FileSystemResource可用来获取文件系统里面的资源。我们可以通过对应资源文件的文件路径来构建一个FileSystemResource。FileSystemResource还可以往对应的资源文件里面写内容，当然前提是当前资源文件是可写的，这可以通过其isWritable()方法来判断。FileSystemResource对外开放了对应资源文件的输出流，可以通过getOutputStream()方法获取到。
//UrlResource可用来代表URL对应的资源，它对URL做了一个简单的封装。通过给定一个URL地址，我们就能构建一个UrlResource。
//ByteArrayResource是针对于字节数组封装的资源，它的构建需要一个字节数组。
//ServletContextResource是针对于ServletContext封装的资源，用于访问ServletContext环境下的资源。ServletContextResource持有一个ServletContext的引用，其底层是通过ServletContext的getResource()方法和getResourceAsStream()方法来获取资源的。
//InputStreamResource是针对于输入流封装的资源，它的构建需要一个输入流

//ApplicationContext接口也继承了ResourceLoader接口，所以它的所有实现类都实现了ResourceLoader接口，都可以用来获取Resource。
public class ResourceLearn implements ApplicationContextAware {
    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

   //no形式的和applicationContext形式一致,这里applicationContext在test中已classpath形式
    public void resourceByNone() throws IOException {
        Resource resource = applicationContext.getResource("resource-config.properties");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }

    //classpath
    public void resourceByClasspath() throws IOException {
        Resource resource = applicationContext.getResource("classpath:resource-config.properties");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }


    //file
    public void resourceByFile() throws IOException {
        Resource resource = applicationContext.getResource("file:./src/main/resources/resource-config.properties");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
    //url
    //file
    public void resourceByURL() throws IOException {
        Resource resource = applicationContext.getResource("url:https://www.baidu.com/s");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }

}


