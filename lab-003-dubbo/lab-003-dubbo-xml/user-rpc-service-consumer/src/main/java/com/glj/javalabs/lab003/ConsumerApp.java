package com.glj.javalabs.lab003;

import com.glj.javalabs.lab003.api.UserRpcService;
import com.glj.javalabs.lab003.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName ConsumerApp
 * @Description
 *
 * 启动类
 *
 * @Author glj
 * @Date 2022/6/16 5:39 下午
 * @Version 1.0
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo.xml")
@Slf4j
public class ConsumerApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApp.class, args);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
    }

    @Component
    public class UserRpcServiceTest implements CommandLineRunner {

        @Resource
        private UserRpcService userRpcService;

        @Override
        public void run(String... args) throws Exception {
            UserDTO user = userRpcService.get(1);
            log.info("[run][发起一次 Dubbo RPC 请求，获得用户为({})", user);
        }
    }

}
