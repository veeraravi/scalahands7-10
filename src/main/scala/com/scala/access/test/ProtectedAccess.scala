package com.scala.access.test

class ProtectedAccess {
  protected val name = "Protected SCALA"
  protected val age = 12
  
  def disp(){
    println(name)
    println(age)
  }
}

object  ProtectedTest{
  def main(args: Array[String]): Unit = {
    val x = new ProtectedAccess
   // println(x.name)
   // println(x.age)
  }
}