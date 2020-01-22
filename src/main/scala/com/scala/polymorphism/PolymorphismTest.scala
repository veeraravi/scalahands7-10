package com.scala.polymorphism

class Disp{
  def printable(){
    println("I am from Disp")
  }
   def show(){
    println("I am from Disp")
  }
}


class PolyPrintable extends Disp{
  override def printable(){
    println("I am from printable")
  }
}

class polyShowable extends Disp{
 override def show(){
    println("I am from showable")
  }
}

class Veeraravi{
  def printable(){
    println("I am from veera")
  }
}

object PolymorphismTest {
  def main(args: Array[String]): Unit = {
    
    val d:Disp = new PolyPrintable()
    d.printable()


   // val s:PolyPrintable = new Disp()
    //val r:Disp = new Veeraravi();
  }
}