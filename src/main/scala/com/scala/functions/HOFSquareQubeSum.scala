package com.scala.functions

object HOFSquareQubeSum {
  def main(args: Array[String]): Unit = {

    val squre = sumAll(squareSum,5,5)
    println(" Value of squre "+squre)

    val cube = sumAll(qubeSum,3,5)
    println(" value of cube is "+cube)

    val sums = sumAll(sum,3,5)
    println(" value of sums is "+sums)
/*
* map
* flatmap
* filter
* fold
* foldleft
* foldright
* :
* :
*
* */
/**
  * val squre = sumAll(squareSum,5,5)
  * f is nothing but squareSum,
  * x is nothing 5,
  * y is nothing but 5
  * */
  }

  def sumAll(f:(Int,Int) => AnyVal,x:Int,y:Int):AnyVal ={

    f(x,y)// 1st call squareSum(x,y)
  }

  def demo(x:Int,y:Int):AnyVal ={

    squareSum(x,y)
  }

  val squareSum = (x:Int,y:Int) =>(x*x + y*y)
  val qubeSum = (x:Int,y:Int) =>(x*x*x + y*y*y)
  val sum = (x:Int,y:Int) =>(x + y)
}
