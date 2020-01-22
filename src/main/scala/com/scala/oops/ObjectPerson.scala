package com.scala.oops

class Person1{
  var name="scala";
  var id:Int=0
}

class Bike{
  
}

class Car{
  
}


object ObjectPerson {
  var age:Int = 28;
  var name:String = "RAMU";
  var sal:Double = 100.0
  
  def main(args: Array[String]): Unit = {
    //val ravi = new ObjectPerson;
    println("Name "+name)
    
    var ravi = new Person1();
    var ravi1 = new Person1();
    var ravi2 = new Person1();
    var ravi3 = new Person1();
    var ravi4 = new Person1();
    var ravi5 = new Person1();
    
    var veera = new PersonClass();
    veera.disp()
    
    var args = Array("scala","java")
    veera.main(args)
    
    println(ravi.id + " " + ravi.name )
    println(veera.name + " " + veera.age )
    
  }
}