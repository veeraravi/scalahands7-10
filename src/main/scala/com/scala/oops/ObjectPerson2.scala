package com.scala.oops

object ObjectPerson2 {
  var age:Int = 28;
  var name:String = "RAJU";
  var sal:Double = 100.0
  
  def main(args: Array[String]): Unit = {
    //val ravi = new ObjectPerson;
    println("Name "+name)

    val t =  ObjTest
    ObjTest.showable()
  }
}

object ObjTest{
  def showable(): Unit ={
    println("I am from ObjTest object")
  }
}