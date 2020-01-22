package com.scala.firstclass

object FirstScala {
  var x = 10;
  val y =20;
  
  def add(x:Int,y:Int):Int= {
   // x = 100;
    x+y;
  }
  
   def printl(x:Int,y:Int)= {
   // x = 100;
    x+y;
    println("WELCOME TO SCALA")
  }
  
  def main(args:Array[String]):Unit ={
    println("WELCOME TO FIRST SCALA PROGRAM");
    println( add(x,y));
    println(printl(10,20));
    println("X value "+x);
    println("Y value "+y);
    
    
  }
  
 
}