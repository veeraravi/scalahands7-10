package com.scala.ArrayDemo

object MultiDimArray {

  def main(args: Array[String]): Unit = {

    var marr1 = Array(Array(10,20,30),
                      Array(80,90,100),
                      Array(101,102,103))
    for (r <- 0 to 2){
      for(c <- 0 to 2){
        print("   "+marr1(r)(c))
      }
      println()
    }


    var marr = Array.ofDim[Int](2,2)
    marr(0)(0) = 10
    marr(0)(1) = 11
    marr(1)(0) = 12
    marr(1)(1) = 15

    for (r <- 0 to 1){
      for(c <- 0 to 1){
        print("   "+marr(r)(c))
      }
      println()
    }
  }
}
