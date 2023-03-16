package com.scala.controlLoopMethod

object SuperDigit {
  def main(args: Array[String]): Unit = {
    val num = "34567"
    println(" super digits of "+num+ " : is "+getSumOfDigits(num))

  }
  def getSumOfDigits(num:String):String={
    if(num.length == 1)return num
    else{
      val sum = num.foldLeft(0)(_ + Character.digit(_,10))
      return getSumOfDigits(sum.toString)
    }
  }
}
