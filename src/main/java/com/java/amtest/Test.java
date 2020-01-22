package com.java.amtest;

import com.java.basics.AccesModifiers;

public class Test {
    public static void main(String[] args) {
        AccesModifiers am = new AccesModifiers();
        //System.out.println(am.name);  default type
        // System.out.println(am.age);  protected
        // System.out.println(am.sal); --private type
        System.out.println(am.dob);
    }
}
