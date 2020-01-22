package com.scala.inheritance

class ClassA
{
  val name="Scala"
  protected val fee = 25000.00
  
  def disp(){
    println("I am from ClassA")
    println("Fee "+fee)
  }
}
class ClassB extends ClassA{
  
  val age:Int = 12

  def print(){
        println("I am from ClassB and Age is "+age)
    println("Fee "+fee)

  }
  
}

class ClassC extends ClassB{
  val sal = 1000
  def show(){
    println("I am from classC")
    println("Fee "+fee)
  }
}


object MultiLevelDemo {
  def main(args: Array[String]): Unit = {
    
    val c = new ClassC
   println("name "+c.name)
   println("age "+c.age)
   println("sal "+c.sal)
 //  println("fee "+c.fee)

    val b = new ClassB
    println(" B name "+b.name)
    println(" B age "+b.age)
  //  println(" B sal "+b.sal) its child(Class C) varisble
  //  println(" B fee "+b.fee)
  }
}