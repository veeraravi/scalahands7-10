package com.scala.firstsession

object Operators {
  
  def main(args: Array[String]): Unit = {
    
    var x = 10;
    
    println(calc());
    
  }
  
  def calc():Int={
    var x = 10 + 12; println(x)
    var y = 10*12;
    var age = 15;
    if(age >= 20){
      println("Eligible for Vote")
      } else{
      println("Not eligible")
      }
    y
  }
  
}