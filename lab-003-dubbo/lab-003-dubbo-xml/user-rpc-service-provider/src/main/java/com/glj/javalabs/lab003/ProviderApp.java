package com.glj.javalabs.lab003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName ProviderApp
 * @Description
 *
 * 启动类
 *
 * @Author glj
 * @Date 2022/6/16 4:27 下午
 * @Version 1.0
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo.xml")
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }

}
