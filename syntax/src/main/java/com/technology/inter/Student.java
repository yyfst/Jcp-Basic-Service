package com.technology.inter;

/**
 * 1.接口中的字段默认是static final，可以省略不写.
 * 2.接口中的方法默认是public，可以省略不写.
 */
public interface Student {
    /**
     * 学生年龄.
     */
    int AGE = 10;
    /**
     * 学生姓名.
     */
    String NAME = "cot";
    /**
     *
     * @param age 年龄
     */
    void setAge(int age);
}
