package com.scala.secondsession

object ClassDemo {
  def main(args: Array[String]): Unit = {    
    
    //Person p = new Person();
    
    var ravi:Person = new Person();
    ravi.disp()    
    println("age "+ravi.age)
    println("name "+ravi.name)
    println("sal "+ravi.sal)
    
    
     var abhisek:Person = new Person();
    abhisek.disp()    
    println("age "+abhisek.age)
    println("name "+abhisek.name)
    println("sal "+abhisek.sal)
  }
}