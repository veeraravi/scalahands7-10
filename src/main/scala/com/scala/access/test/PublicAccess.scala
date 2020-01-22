package com.scala.access.test

class PublicAccess{
  val name = "SCALA"
  val age = 12
  def disp():Unit={
    println("I am from disp which has no modifier")
    println("name and age "+name + " "+ age)
  }

}