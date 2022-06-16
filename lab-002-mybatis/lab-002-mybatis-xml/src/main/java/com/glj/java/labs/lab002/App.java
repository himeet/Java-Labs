package com.glj.java.labs.lab002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName App
 * @Description
 *
 * 启动类
 *
 * @Author glj
 * @Date 2022/5/22 8:53 下午
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.glj.java.labs.lab002.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
