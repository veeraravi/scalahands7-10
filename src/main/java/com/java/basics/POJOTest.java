package com.java.basics;

public class POJOTest {
    public static void main(String[] args) {
        POJODemo pd = new POJODemo(101,"Ravi",1000.00);
        System.out.println("Id is "+pd.getId());
        System.out.println("Name is "+pd.getName());
        System.out.println("Sal is "+pd.getSal());
    }
}
