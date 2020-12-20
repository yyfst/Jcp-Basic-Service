package com.technology.interface_basic.implement;

import java.util.Comparator;

/**
 * 实现了接口Comparator,为ComparableImp类的对象提供比较器
 */
public class ComparatorImp implements Comparator<ComparableImp> {
    @Override
    public int compare(ComparableImp o1, ComparableImp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
