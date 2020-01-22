package com.scala.functions

object MethodDemo {
  
  def main(args: Array[String]): Unit = {
    val sum = addNumbers(10, 20)    
    println("SUM of addNumbers "+sum)
    
    val d = disp()
    println(d)
    addNumbers(100, 20) 
    
    println(getRecord(name="ravi",id=10))
  //  print(mulNumbers())
  }

  //val sub = udf(arg1:Int,arg2:Int) => arg1-arg2


  def addNumbers(arg1:Int,arg2:Int):Int={
    println("I am in addNumber Method")
    arg1+arg2
  }
  
  def subNumbers(arg1:Int,arg2:Int)={
    println("I am in SubNumber Method")
    arg1-arg2
  }
  
  def mulNumbers(arg1:Int,arg2:Int):Int={
    println("I am in addNumber Method")
    return arg1*arg2
  }
  def disp(){
    println("I am from disp");
  }
  
  def getRecord(id:Int,name:String)={
    println("I am in addNumber Method")
    
    (100,"Veeraravi",1000)

  }
  
}