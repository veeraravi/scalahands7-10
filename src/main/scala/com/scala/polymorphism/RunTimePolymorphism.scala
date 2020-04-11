package com.scala.polymorphism

class Shape{
  def draw(): Unit ={
    println("Drawing from shape")
  }
}
class Circle extends Shape{
  override def draw(): Unit ={
    println("Drawing circle")
  }
  def myPrint(): Unit ={
    println("Printing circle stuff")
  }
}
class Square extends Shape{
  override def draw(): Unit ={
    println("Drawing Square")
  }
}


class Tringle extends Shape{
  override def draw(): Unit ={
    println("Drawing Tringle")
  }
}

object RunTimePolymorphism {
  def main(args: Array[String]): Unit = {
    var c:Circle = new Circle()
    c.draw()
    c.myPrint()
  //  c = new Shape()

    var s:Square = new Square()
    s.draw()

    var t:Tringle = new Tringle()
    t.draw()
  println("=========================")
    
    var sh:Shape = new Shape()
    sh.draw()
    
    var sh2:Shape = new Circle()
    sh2.draw()
    //sh2.myPrint()
    
    
    
  }
}
