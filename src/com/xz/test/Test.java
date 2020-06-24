package com.xz.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试
 * @author zhouxuan
 * @date 2020/6/24 17:09
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Dog dog = (Dog) applicationContext.getBean("dog");

        System.out.println(dog.getAge() + dog.getName());
    }
}
