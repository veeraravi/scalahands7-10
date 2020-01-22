package com.scala.firstsession

object VariableDemo {
  
  //fields
  var name:String = "SCALA";
  
  def disp(){
    //local
    var disp1 =10;
    println("I am from disp "+name)
    
    println("i am from disp method "+disp1)
  }
  
  def prints(){
    println(name);
    disp()
  }
  
  {
  println("I am from block")
  }
  
  
 def main(args:Array[String]):Unit = {
    disp()
    prints()
    println(name);
    
   // prinltn(disp1)
  }
}