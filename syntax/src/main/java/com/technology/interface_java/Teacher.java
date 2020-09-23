package com.technology.interface_java;

/**
 * 该类主要用于演示接口中的方法发生冲突时的解决方式
 */
public interface Teacher {
    public void setAge(int age);

    default public void defaultMethod() {
        System.out.println("this is a default method in teacher");
    }
}
