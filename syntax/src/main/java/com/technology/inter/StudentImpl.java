package com.technology.inter;

/**
 * 同时实现了Student和Teacher
 * 这两个接口有两个方法冲突了
 */
public class StudentImpl implements Student, Teacher {
    private int age;

    /**
     * 两个接口均有该方法，但是由于是抽象方法必须实现，在此就不会有冲突
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 该方法不是抽象方法，如果不进行覆写，在调用时就无法知道使用的是哪个接口
     * 里面的方法，因此必须进行覆写，解决冲突
     */
    @Override
    public void defaultMethod() {
        System.out.println("Override method");
    }

    public int getAge() {
        return age;
    }
}
