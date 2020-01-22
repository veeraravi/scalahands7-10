package com.java.basics;

public class AccesModifiers {

    private double sal = 1000.00;
    String name ="JAVA";
    protected int age = 35;
    public String dob = "21-10-1999";

    public AccesModifiers(){

    }



    public static void main(String[] args) {

        AccesModifiers am = new AccesModifiers();

        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.sal);
        System.out.println(am.dob);


    }
}
