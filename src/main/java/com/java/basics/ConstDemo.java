package com.java.basics;

class Parent{
    public Parent(int y) {
        System.out.println("I am from parent");
    }
    public static void print(){
        System.out.println("i m from parent");
    }
    public  void disp(){
        System.out.println("i m disp from parent");
    }
}

class Child extends Parent{
    int age;

    public Child(int age) {
        super(20);
        this.age = age;
        System.out.println("child const");
    }
    public static void print(){
        System.out.println("I am from print in child");
    }
    @Override
    public  void disp(){
        System.out.println("i m disp from child");
    }
}
public class ConstDemo {

    private double sal;
    String name;
    protected int age;
    public String dob;

   public  ConstDemo(String name,int age,String dob1,double sal1){
        this.age= age;
        this.name = name;
        dob = dob1;
        sal = sal1;
       System.out.println("I have 4 args");
    }
    public  ConstDemo(String name,int age,String dob1){
        this(name,age,dob1,10000.025);
        this.age= age;
        this.name = name;
        dob = dob1;
        System.out.println("I have 3 args");
    }

    public  ConstDemo(String name,int age){
       this(name,age,"12-09-2014");
        this.name = name;
        this.age = age;
        System.out.println("I have 2 args");
      }

    public  ConstDemo(String name){
        this(name,37);
        this.name = name;
        System.out.println("I have 1 arg");
    }

    public static void main(String[] args) {
        ConstDemo am = new ConstDemo("java");
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.sal);
        System.out.println(am.dob);

        Child cc = new Child(10);
        cc.print();
        Parent.print();

        cc.disp();


    }
}
