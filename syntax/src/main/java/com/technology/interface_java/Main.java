package com.technology.interface_java;

import java.time.Clock;
import java.util.*;
import javax.swing.Timer;

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
        List<ComparableImp> comparatorImps = new ArrayList<>();
        comparatorImps.add(new ComparableImp("tom", 1000.0, 24));
        comparatorImps.add(new ComparableImp("Jim", 2090.0, 34));
        comparatorImps.add(new ComparableImp("Tony", 2300.0, 27));
        comparatorImps.add(new ComparableImp("Sune", 1000.0, 26));
        comparatorImps.add(new ComparableImp("Hoe", 3200.0, 27));
        //使用比较器进行排序比较
        comparatorImps.sort(new ComparatorImp());
        for (var data : comparatorImps) {
            System.out.println(data.getName() + " " + data.getAge());
        }

        //测试字符串浅拷贝后，是否会改变原来的值
        stringCopy();

        cloneTest();

        timer();

    }

    //测试字符串浅拷贝后，修改拷贝后的变量是否会影响原来的变量
    private static void stringCopy() {
        System.out.println("==========================");
        String string = new String("stringCopy");
        String copy = string;
        System.out.println("init value: " + string + "\t" + copy);

        //修改copy的值，将其转换为小写，查看string的值是否发生改变
        copy = copy.toLowerCase();
        System.out.println("moidfied value: " + string + "\t" + copy);
    }

    //测试clone拷贝
    private static void cloneTest() {
        System.out.println("==========================");
        //没有使用Student类
//        CloneableImp cloneableImp = new CloneableImp(101, "hunan");
//        CloneableImp cloneableImpCopy = null;
//        try {
//            cloneableImpCopy = cloneableImp.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        cloneableImpCopy.setAddress("anhui");
//
//        System.out.println(cloneableImp.getId() + "\t" + cloneableImp.getAddress());
//        System.out.println(cloneableImpCopy.getId() + "\t" + cloneableImpCopy.getAddress());

        //使用Student类
        System.out.println("==========================");
        StudentImpl student = new StudentImpl();
        student.setAge(19);
        CloneableImp deepCopy1 = new CloneableImp(102, "shanxi", student);
        CloneableImp deepCopy2 = null;
        try {
            deepCopy2 = deepCopy1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //打印修改student之前的值
        System.out.println(deepCopy1.getStudent().getAge());
        System.out.println(deepCopy2.getStudent().getAge());

        deepCopy2.getStudent().setAge(28);

        //打印修改student之后的值，deepCopy1与deepCopy2中student的age均改变
        System.out.println(deepCopy1.getStudent().getAge());
        System.out.println(deepCopy2.getStudent().getAge());
        //这两个student没有经过深拷贝，共享了一个对象内存，所以是同一个对象
        System.out.println(deepCopy1.getStudent() == deepCopy2.getStudent());

    }

    private static void timer() {
        ActionListenerImpl listener = new ActionListenerImpl();
        Timer timer = new Timer(1000,listener);
        timer.start();
        //让程序持续运行，从而看到定时器的作用
        while (true){
            ;
        }
    }

}
