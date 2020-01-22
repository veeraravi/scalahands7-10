package com.scala.oops

class CompanionClassDemo {
  var age:Int =0;
  var name:String = null;
  var sal:Double = 0.0
  
  def disp(){
    println("Hi "+name+ " Welcome to Scala")
    println("Your age is "+age+" sal is "+sal)
    CompanionClassDemo.address;
    CompanionClassDemo.printObject()
  }
   
}

object CompanionClassDemo {
  var address:String = "HYD";
  def printObject(){
    println("Address is "+address);
  //  println("age "+age);
    
  }
  def main(args: Array[String]): Unit = {
    
    /*val x = new CompanionClassDemo;
    x.disp();*/
  //  CompanionClassDemo.printObject();
  //  CompanionClassDemo.
    
    
    
  }
}