package com.scala.functions

object AnanomousDemo {

  val sum = (arg1:Int,arg2:Int) => arg1+arg2
  val sub = (_:Int)-(_:Int)
  //val test = (_:Int,_:Int) => _+_

  def main(args: Array[String]): Unit = {
   
    println("return value of sum : "+sum(10,20))
    println("return value of sub : "+sub(10,20))
    println("variable sub "+sub)
    println("variable sum "+sum)
   // println("variable sum "+test(100,200))

    val list = Array(1,2,3,4,5,6)

    val incr = list.map(ele => ele * 10)
}

}