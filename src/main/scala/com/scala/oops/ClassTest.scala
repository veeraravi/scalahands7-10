package com.scala.oops

class Person {
  var name="Scala"
  var age=0;
  var dob="21-10-1985"
  
  def disp(){
    println("Name "+name+" Age "+age+" dob "+dob)
  }
}


object ClassTest{
  def main(args: Array[String]): Unit = {
    var ravi = new Person();
    println("Name is "+ravi.name)
    println("age is "+ravi.age)
    println("dob is "+ravi.dob)
    
    ravi.disp()
  }
}