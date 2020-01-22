package com.scala.inheritance

class ParentA
{
  def getTax(){
   println("I am from parentA") 
  }
}

class ParentB{
  def getTax(){
    println("I am from parentB") 
  }
}


class ChildC extends ParentA//,ParentB
{
  
}

object MultipleInheritanceDemo {
  
  def main(args: Array[String]): Unit = {
    val c = new ChildC
    c.getTax();
  }
}