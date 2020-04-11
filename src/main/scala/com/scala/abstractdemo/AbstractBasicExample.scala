package com.scala.abstractdemo

abstract class Bike{
val model:String = "RC300";
val make:String = "KTM RC300";
val year:Int = 2000;

  def disp(): Unit ={
    println("I am from abstract class which has no abstract methods")
  }
  def getSpeed()
  //def getSpeed2()
}

class KTM extends Bike{
  def printable(): Unit ={
    println("Model "+model)
    println("Make "+make)
    println("Year "+year)
    println("Child who implemented abstract bike")
  }

  override def getSpeed(): Unit = {
    println("100")
  }
  override def disp(): Unit ={
    println("I am from KTM class method")
  }
}

object AbstractBasicExample {
  def main(args: Array[String]): Unit = {
    val ktm220 = new KTM
    ktm220.printable()
    ktm220.disp()

    val ref:Bike = new KTM
    ref.disp()

    //val b = new Bike



  }
}
