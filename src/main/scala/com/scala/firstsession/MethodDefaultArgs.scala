package com.scala.firstsession

object MethodDefaultArgs {
  def main(args: Array[String]): Unit = {
   // println(" Return value from test2 with 2 args  "+test2(10,20))
   // println(" Return value from test2 with no args  "+test2())
    println(" Return value from test2 with 1 args  "+test2(y=100,x=10))
  }
  def test2(x:Int=5,y:Int=6):Int = {
    println(" X value "+x)
    println(" Y value "+y)
    x+y
  }




}
