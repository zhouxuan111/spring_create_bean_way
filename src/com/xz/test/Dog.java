package com.xz.test;

/**
 * 构造方法创建bean
 * @author zhouxuan
 * @date 2020/6/24 16:56
 */
public class Dog {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
