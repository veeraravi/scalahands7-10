package com.scala.constructdemos

object ConstructurDemo {
  def main(args: Array[String]): Unit = {
   // var noargs = new Student()
   // calling primary constructor directly
    var ravi = new Student("RAVI",32,101)
    println("printing ravi object directly  "+ ravi.toString())
    println("Hashcode of ravi object "+ravi.hashCode())
    //println(ravi.)
    ravi.printStudent()
    
  /*
    val raju = new Student("RAJU",1001)

    raju.printStudent();
    var veera:Student = new Student("VEERA",32,102)
     veera.printStudent();
    var kumar:Student = new Student("KUMAR",32,103)
    kumar.printStudent();

    new Student("XYZ",100,14).printStudent()*/
  }
}