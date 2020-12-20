package com.technology.interface_basic.basciinterface;

/**
 * 1.接口中的字段默认是static final，可以省略不写.
 * 2.接口中的方法默认是public，可以省略不写.
 */
public interface Student {
    /**
     * 学生年龄.
     */
    static final int AGE = 10;
    /**
     * 学生姓名.
     */
    static final String NAME = "cot";

    /**
     * @param age 年龄
     */
    public void setAge(int age);

    /**
     * 接口中可以有静态方法
     */
    public static void staticMethod() {
        System.out.println("this is a static method");
    }

    /**
     * 接口中可以有默认方法
     */
    default public void defaultMethod() {
        System.out.println("this is a default method in student");
        staticMethod();
        privateMethod();
    }

    /**
     * 接口中可以有私有方法，但是只能在接口中被其他方法调用
     */
    private void privateMethod(){
        System.out.println("this is a private method");
    }
}
