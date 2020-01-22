package com.scala.inheritance

class Employee_Test(id:Int,name:String,sal:Double){
  
  
  
  override def toString():String = {
    "name= "+name+" id= "+ id + " sal= " + sal;
  }  
  
}


object ToStringDemo {
  def main(args: Array[String]): Unit = {
    val emp = new Employee_Test(1,"Spark",1000);
    
    println("EMP "+emp.toString())
  }
}