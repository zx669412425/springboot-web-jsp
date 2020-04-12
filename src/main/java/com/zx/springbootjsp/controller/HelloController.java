package com.zx.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 对比两方法，一个使用注解请求，一个使用jsp访问
@Controller
public class HelloController {
    // 该方法使用hello请求无法获得，因为指定的前缀为/WEB-INF/，该文件在webapp目录下，可以使用hello.jsp访问
    // 项目启动后会自动在打开浏览器，直接在地址栏中添加hello.jsp就可访问，表示直接访问hello.jsp
    @RequestMapping("/hello")
    public String hello(){
    System.out.println("hello");
    return "hello";
}
    // 该方法可以使用success请求获得，不能使用success.jsp访问，因为配置的web资源在webapp/WEB-INF下
    @RequestMapping("/success")
    public String success(){
        System.out.println("success");
        return "success";
    }
}
