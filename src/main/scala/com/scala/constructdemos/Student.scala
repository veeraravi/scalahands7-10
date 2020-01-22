package com.scala.constructdemos

class Student(name:String,age:Int,id:Int) {
  
  override def toString():String={
   "FirstName = "+name+" age = "+age+" id = "+id;
  }
  def printStudent(){
    println("===Student Details===")
    println("Name ="+name)
    println("Id   ="+id)
    println("Age ="+age)
  }
  
   println("I am primary cons with args")

   def this(name:String,id:Int){
     this(name,0,id)
   }

  def this(id:Int,name:String){
    this(name,10,id)
    val age = 100;
    print("")
  }

  /*def this(){
    this(name,10,id)
    val age = 100;
    print("")
  }*/
}
