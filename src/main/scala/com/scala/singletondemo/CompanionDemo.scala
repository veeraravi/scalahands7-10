package com.scala.singletondemo

class CompanionDemo{
  private val id:Int = 100;
  private val sal:Double = 1000.00;
  private def getSal():Double={
    return sal;
  }
  var name:String = "Scala";
  def disp(){
    println("Sal "+sal+" name "+name)
  }
  def apply(){
    
  }
}


object CompanionDemo {
  def main(args: Array[String]): Unit = {
   val comp = new CompanionDemo
   println(comp.id)
   println(comp.name)
   println(comp.sal)
   println(comp.disp())
   println(comp.getSal())
  }
}