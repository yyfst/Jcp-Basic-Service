package com.technology.interface_basic.implement;

//Cloneable其实是个空接口，没有任何方法，实现该接口的目的是为了能够使用instanceof
public class CloneableImp implements Cloneable {
    private int id;
    private String address;
    private StudentImpl student;

    public CloneableImp(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public StudentImpl getStudent() {
        return student;
    }

    public CloneableImp(int id, String address, StudentImpl student) {
        this.id = id;
        this.address = address;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public CloneableImp clone() throws CloneNotSupportedException {
        CloneableImp cloned = (CloneableImp) super.clone();
        cloned.student = student.clone();
        return cloned;
    }
}