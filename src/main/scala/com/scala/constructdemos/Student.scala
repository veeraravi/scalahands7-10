package com.scala.constructdemos

class Student(name:String,age:Int,id:Int) {

  // its a statement in constructor
  println("I am primary cons with args in line 4")

  //member method
  override def toString():String={
   "FirstName = "+name+" age = "+age+" id = "+id;
  }

  //member method
  def printStudent(){
    println("===Student Details===")
    println("Name ="+name)
    println("Id   ="+id)
    println("Age ="+age)
  }
  // statement inside primary constructor
   println("I am primary cons with args")

  // auxiliary constructor
   def this(name:String,id:Int){
    this(name,0,id)
     print("I am from auxiliary constructor")
  }

  def this(id:Int,name:String){
    this(name,10,id)
    val age = 100;
    print("")
  }

  def this(){
    this("",10,1012)
    val age = 100;
    print("")
  }

  def this(id:Int){
    this("Ravi",32,id)
    val age = 100;
    print("")
  }
}
