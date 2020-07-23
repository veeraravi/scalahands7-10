package com.java.basics;

public class POJODemo {
    private int id;
    private String name;
    private double sal;

    public POJODemo(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }
}
