package com.scala.inheritance

class Parent{
  val sal = 1000;

  def calTax():Double = {
    println("Calculating the tax in Parent")
    return (sal*12)/100; 
  }
}

class Child extends Parent{
 override val sal = 100000;
  val bonus = 500;
 override def calTax():Double = {
    var total = sal + bonus;
    println("calculating the tax in child class");
    return (total * 13)/100
  }
 /* def getParentSal(): Double ={
   println("I am from getParentSal method")
    return super.sal // super may not be used on variable in subclass
  }*/
}

class ProtectedTest extends ClassA{
  println(fee)
}

object OverrideDemo {
  def main(args: Array[String]): Unit = {
    val parent:Parent = new Parent;
    val child:Child = new Child;
   println("Parent tax"+ parent.calTax());
   println("Child's tax" +child.calTax());
    
    println("child's sal "+child.sal)
    println("parent's sal "+parent.sal)

    println("================================")

   // val ch:Child = new Parent()
    val pnt:Parent = new Child()
    println("pnt's sal "+pnt.sal)
    println("pnt's tax" +pnt.calTax());





 //   println("get Parent sal from child "+child.getParentSal())

    val test:ClassA = new ClassA()
    //println(test.fee)
  }
  
}