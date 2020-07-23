package com.scala.inheritance

/*
* final classes --> can not be create child for final class
* final variable -->Can not override in child class
* final method --> can not override final methods in child class
*
* */
 class ParentFinal{
  final val sal = 1000;

  final def calTax():Double = {
    println("Calculating the tax in Parent")
    return (sal*12)/100;
  }
}

class ChildFinal extends ParentFinal{
 /* override val sal = 100000;
  val bonus = 500;
  override def calTax():Double = {
    var total = sal + bonus;
    println("calculating the tax in child class");
    return (total * 13)/100
  }*/
  /* def getParentSal(): Double ={
    println("I am from getParentSal method")
     return super.sal // super may not be used on variable in subclass
   }*/
}




object FinalDemo {

}
