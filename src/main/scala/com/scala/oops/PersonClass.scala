package com.scala.oops

class PersonClass {
  var age:Int =0;
  var name:String = null;
  var sal:Double = 0.0
  
  def disp(){
    println("Hi "+name+ " Welcome to Scala")
    println("Your age is "+age+" sal is "+sal)
  }
  
  def main(args: Array[String]): Unit = {
    
    println("Main in class");
    val k = new PersonClass;
    k.name="Kumar"
    val s = new PersonClass;
    s.name="SCALA";
    println("K "+k.name)
    println("S "+s.name)
  }
}