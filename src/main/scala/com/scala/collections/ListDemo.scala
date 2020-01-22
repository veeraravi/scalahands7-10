package com.scala.collections

object ListDemo {
  def main(args: Array[String]): Unit = {
    val x = "scala" :: "spark" :: "java" :: Nil;
    val nameList = List("scala","spark","java")
    
    println("x == "+x)
    println("nameList == "+nameList)
  }
}