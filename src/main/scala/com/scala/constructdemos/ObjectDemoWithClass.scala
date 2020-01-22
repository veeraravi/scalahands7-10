package com.scala.constructdemos

class PenClass1{
  var name:String="CELLO";
  var id:Int=10
  def write(): Unit ={
    println("I am writing")
  }
}


object ObjectDemoWithClass {
  def main(args: Array[String]): Unit = {
    val cello:PenClass1 = new PenClass1
    cello.id=100

    println("id is "+cello.id)
    println("name is "+cello.name)

    cello.write()

   /* new PenClass1().id = 1000
    println(new PenClass1().id)
    println(new PenClass1().name)
    new PenClass1().write()*/
  }
}
