package com.scala.functions

object DefaultArgDemo {
  def main(args: Array[String]): Unit = {
    println("==================with proper args==================")
    defaultArgTest(10,"Veera")
    println("==================with proper args named==================")
    defaultArgTest(arg1 = 10,"Veera")
    println("===================No args==================")

    defaultArgTest();
    println("==================with one args===================")

    defaultArgTest(1000);

    println("==================with one args===================")

    defaultArgTest(arg2="Veera");
  }
  
  def defaultArgTest(arg1:Int=100,arg2:String="Scala"){
    println("age "+arg1+ " name "+arg2 )
  }
  
}