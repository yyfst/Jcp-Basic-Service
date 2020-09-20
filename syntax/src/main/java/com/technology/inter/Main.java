package com.technology.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //创建List集合
        List<Employee> list = new ArrayList<>();
        //往list添加内容
        list.add(new Employee("tom", 1000.0, 24));
        list.add(new Employee("Jim", 2090.0, 34));
        list.add(new Employee("Tony", 2300.0, 27));
        list.add(new Employee("Sune", 1000.0, 26));
        list.add(new Employee("Hoe", 3200.0, 27));

        //集合排序方法
        Collections.sort(list);

        //遍历集合
        for (var data : list) {
            System.out.println(data.getName() + " " + data.getAge() + " " + data.getSalary());
        }
    }
}
