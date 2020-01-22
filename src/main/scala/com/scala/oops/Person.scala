package com.scala.oops

class Person1111(val age:Int,val name:String, val income:Double) {
  
  // no default scope..no default value
  var this.age:Int =age;
  var this.name:String=name;
  var this.income:Double=income;
 
  
  def printPerson():Unit={
    println("name = "+name+"\n"+"Age = "+age+"\n"+"Income = "+income)
  }
  
  println("HI ALL WELCOME TO SCALA");
  
  
}