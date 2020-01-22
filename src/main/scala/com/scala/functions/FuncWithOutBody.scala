package com.scala.functions

object FuncWithOutBody {
  def main(args: Array[String]): Unit = {
    println(doubleValue(100))
  }

  def doubleValue = (x:Int) => x*x
  def sum = (x:Int,y:Int) => x+y
  def mulBy2 = (x:Int) => x*2



}
