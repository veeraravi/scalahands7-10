package com.scala.functions

object HigherOrderFunctionDemo { 
  
  def main(args: Array[String]): Unit = {

//    println("return value is : "+mulBy2(10))

 //  println(callMethod(100))
 //   mulBy2()
  //  higherOrder(mulBy2)

 //   methdCompos(mulBy2(10).toInt)

 //   println(mulBy2(10))
  //  println(higherOrder(mulBy2))

  //  println(methdCompos(mulBy2(10)))// method composition
 /*val list = List("","","","")
    list.map(ele => ele*2)*/

    higherOrder2(25,mulBy2)

  }

  def mulBy2(arg1:Int):Double={
    println("Hey welcome to mulBy2 given input is "+arg1)
    return (arg1*2).toDouble;
  }
  def higherOrder(arg:Int => Double){
    println("from HOF "+arg(50))  //mulBy2(50)
  }

  def higherOrder2(ele:Int,fun:Int => Double){
    println("Res from HOF "+fun(ele))  //mulBy2(ele)
  }



  def methdCompos(arg1:Double):Double = {
    println("The value of arg1 "+arg1)
    return arg1*100*10;
  }

  def callMethod(arg:Int)={
    println("Hey welcome to callMethod")
    mulBy2(arg)
  }

}