package com.trg.websocket.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //启动类
public class SpringbootApplication {

    public static void main(String[]args)
    {
        SpringApplication.run(SpringbootApplication.class,args);
        System.out.println("项目启动成功");
    }

}
