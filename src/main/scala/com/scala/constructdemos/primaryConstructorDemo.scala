package com.scala.constructdemos

class primaryConstructorDemo(fName:String,lastName:String){
  
  def name(){
    println("Inside Method")
   fName+ " "+ lastName;
  }
  println("before method")
  println("afterMethod")
}