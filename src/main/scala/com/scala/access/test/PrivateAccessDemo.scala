package com.scala.access.test

class PrivateParent(){
  private var age = 35
  def getAge(): Int ={
    return age
  }
  def setAge(age:Int): Unit ={
    this.age = age;
  }
  println("I am from private parent cls, in constructor "+age)
}

object PrivateAccessDemo {
  def main(args: Array[String]): Unit = {
    val pp = new PrivateParent
  //  println("age = "+pp.age)
    println("Get age "+pp.getAge())
  }
}
