package com.technology.interface_java;

/**
 * 实现了Comparable接口，通过实现compareTo方法完成Employee对象的排序
 */
public class ComparableImp implements Comparable<ComparableImp> {
    private String name;
    private double salary;
    private int age;

    public ComparableImp(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    /**
     * 对Employee类的对象进行比较排序，以薪资从低到高排序
     * 浮点类使用Double.compare来比较，而不是使用this.salary-o.getSalary()
     */
    @Override
    public int compareTo(ComparableImp o) {
        return Double.compare(this.salary,o.getSalary());
    }
}
