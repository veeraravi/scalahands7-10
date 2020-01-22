package com.java.basics;

/**
 * javac FirstExample.java  --> compile or build
 * java FirstExample --> running
* */

public class FirstExample {
    //instance
    String name = "JAVA";
    int age = 75;
    // static

    static String course = "JAVA";

    public static void main(String[] args){
      //  int age = 16;
        final int x =100;

      //  int lv;
     //   System.out.println(lv);

        FirstExample fe = new FirstExample();
        FirstExample fe2 = new FirstExample();

        fe2.age = 100;
        fe2.course = "SCALA";

        System.out.println("WELCOME TO JAVA WORLD");

        System.out.println("fe age "+fe.age);
        System.out.println("fe name "+fe.name);
        System.out.println("course "+fe.course);
        System.out.println("**********************");


        System.out.println("fe2 age "+fe2.age);
        System.out.println("fe2 name "+fe2.name);
        System.out.println("course "+fe2.course);

        System.out.println("int min="+Integer.MIN_VALUE+" MAX="+Integer.MAX_VALUE);
        System.out.println("long min="+Long.MIN_VALUE+" MAX="+Long.MAX_VALUE);
        System.out.println("float min="+Float.MIN_VALUE+" MAX="+Float.MAX_VALUE);
        System.out.println("double min="+Double.MIN_VALUE+" MAX="+Double.MAX_VALUE);
     //   System.out.println("boolean min="+Boolean.MIN_VALUE+" MAX="+Double.MAX_VALUE);
        System.out.println("char min="+Character.MIN_VALUE+" MAX="+Character.MAX_VALUE);

        fe.test();











    }

    public void test(){
        String name = "Vasavi";
    System.out.println("age in test() "+age);
    }


    public static void disp(){
     //   System.out.println("age in disp() "+age);
      //  System.out.println("name in disp() "+name);
        System.out.println("course in disp() "+course);
    }


}
