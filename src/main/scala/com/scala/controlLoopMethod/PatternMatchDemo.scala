package com.scala.controlLoopMethod

object PatternMatchDemo {
  def main(args: Array[String]): Unit = {

    val x = 10
    x match {
      case 1 => println("its one")
      case 2 => println("its Two")
      case 3 => println("its Three")
      case 5 => println("its FIVE")
      case 10 => println("its TEN")
      case _ => println("Any Value")
    }

    print(10)
    print(100)
    print("hallo")
  }


}

//def printMachedValue(x:Int):Any =

