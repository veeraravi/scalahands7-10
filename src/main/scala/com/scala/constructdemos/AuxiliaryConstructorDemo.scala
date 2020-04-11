package com.scala.constructdemos

class AuxiliaryConstructorDemo(val name:String,var age:Int,val roll:Int){
  var sal = 1000;
  val bonus = 150;
  println("I am from primary Constructor")
  println("Name : "+name)
   println("Age : "+age)
   println("Roll : "+roll)
       
 // when we defing a def this() we should call main constructor
  def this(name:String,age:Int){
 //  println("I am auxiliary");
    this(name,age,0); //-- calling another cons
    println("I have name and age")
  }
   
  def this(name:String){ //auxiliary
    this(name,0,0) //primary
    println("I have name ")
  }
  def this(){ //auxiliary
    this("Veera"); //calling another auxiliary
    println("I have no args")
  } 
  
  def this(id:Int){
    this("",id,0)
  }
 /* 
  def this(name:String,age:Int,roll:Int){
    this("",0,0)
  }*/
  
  /*{
    println("IIB")
  }*/
  
  def show()={
       println("Name : "+name)
       println("Age : "+age)
       println("Roll : "+roll) 
       println("=============== ");
  }
}