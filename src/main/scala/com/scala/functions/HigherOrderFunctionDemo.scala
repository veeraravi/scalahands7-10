package com.scala.functions

object HigherOrderFunctionDemo { 
  
  def main(args: Array[String]): Unit = {
   // println(mulBy2(10))
  // println(callMethod(100))
    //mulBy2()
 //   higherOrder(mulBy2)
    methdCompos(mulBy2(10).toInt)

   /* println(mulBy2(10))
    println(higherOrder(mulBy2))
    println(methdCompos(mulBy2(10)))*/

  }

  def mulBy2(arg1:Int):Double={
    println("Hey welcome to mulBy2")
    return (arg1*2).toDouble;
  }
  def higherOrder(arg:Int => Double){
    println("from HOF "+arg(50))  //mulBy2(50)
  }
  
  def methdCompos(arg1:Int):Int = {
    println("The value of arg1 "+arg1)
    return arg1*100*10;
  }

  def callMethod(arg:Int)={
    println("Hey welcome to callMethod")
    mulBy2(arg)

  }

}