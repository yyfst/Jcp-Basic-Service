package com.technology.interface_java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //创建List集合
        List<ComparableImp> list = new ArrayList<>();
        //往list添加内容
        list.add(new ComparableImp("tom", 1000.0, 24));
        list.add(new ComparableImp("Jim", 2090.0, 34));
        list.add(new ComparableImp("Tony", 2300.0, 27));
        list.add(new ComparableImp("Sune", 1000.0, 26));
        list.add(new ComparableImp("Hoe", 3200.0, 27));

        //集合排序方法，由于在Employee中复写了compareTo，因此可以对list进行排序
        Collections.sort(list);

        //遍历集合，var是自动类型推断
        for (var data : list) {
            System.out.println(data.getName() + " " + data.getAge() + " " + data.getSalary());
        }

        System.out.println("==========================");
        List<ComparableImp>comparatorImps=new ArrayList<>();
        comparatorImps.add(new ComparableImp("tom", 1000.0, 24));
        comparatorImps.add(new ComparableImp("Jim", 2090.0, 34));
        comparatorImps.add(new ComparableImp("Tony", 2300.0, 27));
        comparatorImps.add(new ComparableImp("Sune", 1000.0, 26));
        comparatorImps.add(new ComparableImp("Hoe", 3200.0, 27));
        //使用比较器进行排序比较
        comparatorImps.sort(new ComparatorImp());
         for(var data:comparatorImps){
             System.out.println(data.getName()+" "+data.getAge());
         }
    }
}
