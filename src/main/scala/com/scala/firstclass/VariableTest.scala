package com.scala.firstclass

object VariableTest {
  var x :Int = 10;
 val y  = 10.30; 
 
 def main(args:Array[String]):Unit={
   println(x+y);

   val std:ScalaStudent = new ScalaStudent()

   println(std.studentName)
   println(std.age)
  //println(std.fee)
   println(std.age)
   println(std.age)

 }
}