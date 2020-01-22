package com.java.amtest;

import com.java.basics.AccesModifiers;

public class Test2 extends AccesModifiers {
    public static void main(String[] args) {
        Test2 am = new Test2();
     //   System.out.println(am.name); //default
        System.out.println(am.age); //protected
        //  System.out.println(am.sal); //--private type
        System.out.println(am.dob);

    }
}
