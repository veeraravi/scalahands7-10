package com.scala.functions

object FunctionCompositionDemo {
  def main(args: Array[String]): Unit = {

    //function composition
  //  println("Result of fun mulBy2 is : "+mulBy2(addBy2(100)))
   //
    val res = addBy2(100)
    println("mulby2 "+mulBy2(res))
  }

  def mulBy2(arg1:Double):Double={
    println("Hey welcome to mulBy2 given input is "+arg1)
    return (arg1*2).toDouble;
  }
  def addBy2(arg1:Int):Double={
    println("Hey welcome to addBy2 given input is "+arg1)
    return (arg1+2).toDouble;
  }
}
