package com.java.basics;

public class LoopDemo {
    public static void main(String[] args) {

        for(int i = 0; i <=10;i++){
            System.out.println("I value "+i);
        }
        int x = 2;
        for(;x<5;x++){
            System.out.println("X value "+x);
        }
    int codes[] = {101,105,108,110,150};
        for(int c:codes){
            System.out.println("codes "+c);
        }
int y =0;
        while(y<5){
            System.out.println("y value "+y);
            y++;
        }
    }
}
