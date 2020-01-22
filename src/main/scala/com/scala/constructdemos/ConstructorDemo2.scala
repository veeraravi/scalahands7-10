package com.scala.constructdemos

class Pen{
  
  val name:String="Cello"
  val color:String="blue"
  val penType:String="ball Pen"
  
  def print(){
  println("Pen name "+name+" Pen Color "+color+" pen Type "+penType)  
  }
  
  println("I am Scala Constructor ")
}

object ConstructorDemo2 {
  def main(args: Array[String]): Unit = {
    
    val pen= new Pen()
    pen.print()
  }
}