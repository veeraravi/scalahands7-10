package com.scala.constructdemos

class primaryConstructorDemo(fName:String,lastName:String){
  
  def name()={
    println("Inside Method")
   fName+ " "+ lastName;
  }
  println("before method")
  println("afterMethod")

  def this(){
    this("","")//calling primary constructor
    println("Inside AuxiliaryConstructor")
  }

  def this(fName:String){
    this(fName,"")//calling primary constructor
    println("Inside AuxiliaryConstructor with 1 arg")
  }

  def this(fName:String,lName:String,sal:Double){
    this(fName,"")//calling primary constructor
    println("Inside AuxiliaryConstructor with 1 arg")

    println("My sal is "+ sal)
    println("my tax is "+(sal*10/100))

  }


}