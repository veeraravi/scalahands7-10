package com.scala.functions

object MethodOverLoadingDemo {
  def main(args: Array[String]): Unit = {
    val sum = addNumbers(10, 20)    
    println(sum)
    println(addNumbers(100,150.25f))
  }

  /*
  * method name should be same and the below should change
  * no of rgs
  * type of args
  * order of args type
  * */


  def addNumbers(arg2:Int,arg1:Int):Int={
    println("I am in addNumber Method INT INT")
    return (arg1+arg2)
  }
  def addNumbers(arg1:Int):Int={
    println("I am in addNumber Method INT INT")
    return (arg1+100)
  }

/*
  def addNumbers(arg1:Int,arg2:double):Double={
    println("I am in addNumber Method INT INT")
    return (arg1+arg2).toDouble
  }
*/


  def addNumbers(arg2:Int,arg1:Double):Int ={
    println("I am in addNumber Method INT INT")
    return (arg1+arg2).toInt
  }
  
   def addNumbers(arg1:Int,arg2:Float)={
    println("I am in addNumber Method Int Float")
    arg1+arg2
   
   }
   
   def addNumbers(arg1:Float,arg2:Int)={
    println("I am in addNumber Method Float Int")
    arg1+arg2
   }
   
   def addNumbers(arg1:Float,arg2:Float)={
    println("I am in addNumber Method Float Float")
    arg1+arg2
  }
  
   def addNumbers(arg1:Int,arg2:Int,arg3:Int)={
    println("I am in addNumber Method Int Float")
    arg1+arg2+arg3
  }
    
}