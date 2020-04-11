package com.scala.strings

class StringTest{
  var name = " scala"
  name+" spark"
  def disp(): Unit ={
    println(name)
  }
}

object StringImmutable {
  def main(args: Array[String]): Unit = {
    val str = new StringTest()
    str.disp()
  }
}
