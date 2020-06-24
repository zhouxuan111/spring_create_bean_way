package com.xz.test;

/**
 * 静态工厂实例化
 * @author zhouxuan
 * @date 2020/6/24 19:44
 */
public class DogStaticFactory {

    public static Dog newInstance(String name, Integer age) {
        return new Dog(name, age);
    }
}
