package com.scala.firstsession

object MethodDemo {
  //field
  val myName = "VEERA";

  //args is arguments
  def main(args: Array[String]): Unit = {
    
    //local variable
    val yourName = "NEERU";
   println("------------------------------------")
    dispName()
   println("------------------------------------")
    val res = dispName()
    println("result "+res)
    println("------------------------------------")

    println("=====================================")
    var sal = getSalary();
   
    println("Salary "+sal);
    println("=================println====================")

    println(getSalary())
    println("=====================================")

    paramMethod()
    
    paramMethod("SCALA SAPRK",10000)//calling

    paramMethod(id = 10000,name="VEERA")

    var y = addOne(100,200)
println(y);    
  }
  
  def dispName()={
    println("I am SCALA, from Method which return nothing");
    println(myName)
  //  myName
  }
  
  def getSalary():Double={
   var sal = 1000.00;
    println(myName)
   return sal;
 // sal
   
  }
  
  def paramMethod(name:String = "SCALA",id:Int = 100){
       
    println("Name is "+name)
    println("Id is "+id)
     println(myName)
  }
  
 val addOne = (x:Int,y:Int) => x+y+1;
  
  
}