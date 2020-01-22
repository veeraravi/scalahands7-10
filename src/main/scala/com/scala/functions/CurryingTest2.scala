package com.scala.functions

object CurryingTest2 {

  def main(args: Array[String]): Unit = {
 //   println("result of add func "+addNumbers(10)(20))
  //  println("result2 of add func "+addNumbers(10)_)
val res = addNumbers(10)_
    val res2 = res(30)
//    println("result3 of add func "+res2)

  }

  def addNumbers(arg1:Int)(arg2:Int):Int={
    println("******entered into addNumbers *****")
    arg1+arg2
  }

}
