package com.scala.inheritance

class ParentAgrs{
  def disp(name:String,age:Int): Unit ={
    println("Paranet's name "+name+"Parent's age "+age)
  }
}
class ChildAgrs extends ParentAgrs {
 def disp(name:String): Unit ={
    println("child's name "+name)
  }
}
object OverrideWithDiffArgsTest {
  def main(args: Array[String]): Unit = {
    val c = new ChildAgrs
    c.disp("child")
    c.disp("scala",10)
  }
}
