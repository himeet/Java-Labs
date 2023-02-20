package com.glj.javalabs.lab004;

import com.glj.javalabs.lab004.demo1.Bean1;
import com.glj.javalabs.lab004.demo2.Bean2;
import com.glj.javalabs.lab004.demo3.Bean3;
import com.glj.javalabs.lab004.demo4.Bean4;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Bean1Test
 * @Description
 *
 * Bean1 相关的单元测试
 *
 * @Author glj
 * @Date 2022/6/20 2:05 下午
 * @Version 1.0
 */
public class BeanTest {

    @Test
    public void testBean1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1: " + bean1);
    }

    @Test
    public void testBean2() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        Bean2 bean2 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2: " + bean2);
    }

    @Test
    public void testBean3() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        Bean3 bean3 = context.getBean("bean3", Bean3.class);
        System.out.println("bean3: " + bean3);
    }

    @Test
    public void testBean4() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        Bean4 bean4 = context.getBean("bean4", Bean4.class);
        Bean4 bean4_1 = context.getBean("bean4_1", Bean4.class);
        Bean4 bean4_2 = context.getBean("bean4_2", Bean4.class);
        Bean4 bean4_3 = context.getBean("bean4_3", Bean4.class);
        System.out.println("bean4: " + bean4);
        System.out.println("bean4_1: " + bean4_1);
        System.out.println("bean4_2: " + bean4_2);
        System.out.println("bean4_3: " + bean4_3);
    }

}
