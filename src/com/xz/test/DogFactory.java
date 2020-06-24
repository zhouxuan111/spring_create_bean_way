package com.xz.test;

/**
 * 工厂方法实例化
 * @author zhouxuan
 * @date 2020/6/24 19:11
 */
public class DogFactory {

    public Dog newInstance(String name, Integer age) {
        return new Dog(name, age);
    }
}
