package com.scala.secondsession

class DefaultArgConstructorDemo(val name:String="SCALA",val age:Int=13,val sal:Double=100.00){
  def print(){
    println("Name "+name)
    println("age "+age)
    println("Sal "+sal)
  }
}

object DefaultArgConstructorDemo {
  def main(args: Array[String]): Unit = {
    
    var ravi = new DefaultArgConstructorDemo();
    
    ravi.print()
    
    var lakshmi = new DefaultArgConstructorDemo("Lakshmi");
    
    lakshmi.print()
    
    var veera = new DefaultArgConstructorDemo("VEERARAVI",sal=1000.00);
    
    veera.print()
    
  }
  
  
}