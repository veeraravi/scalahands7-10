package com.scala.inheritance

class Employee{
  def disp(){
    println("I am from disp in employee")
  }
  var sal = 1000.00d;
  private var otherIncome = 500.00d
}
class Developer extends Employee{
  def prints(){
    println("Developer")
    disp()
  }
  var bonus = 200;
 override def disp(){
    println("I am from Developer")
  }
override def toString(): String ={
// println("sal= "+sal+" bonus= "+ bonus )
  "sal= "+sal+" bonus= "+ bonus
}

 // override def toString = s"Developer($bonus)"
}

class Tester extends Employee{
  def test(){
    var mysal = sal;
//    var sal2 = super.sal
  }
  
}

object InheritanceDemo {
  
  def main(args: Array[String]): Unit = {
    var dev = new Developer();
    println("DEV OBJ "+dev)
  dev.disp()
  println("Sal = "+dev.sal)
  dev.prints()
  println("Bonus "+dev.bonus)
  //println("Other income  "+dev.otherIncome)
println("****************************")
    var dev2:Employee = new Developer();
    dev2.disp()
    println(dev2.sal)

//val child:Developer = new Employee();
  //  val name = new String("Scala")
    println("************tester****************")
    val tester = new Tester
    tester.disp()
    println("tester's sal "+tester.sal)

    println("************Dynamic Polymorphsim****************")

    //val e:Developer = new Employee   not possible
    //val t:Tester = new Employee

    var e:Employee = new Developer
    var e2:Employee = new Tester
    e=e2
    e = new Tester
    var dev11 = new Developer();
    var test11 = new Tester();
   // dev11 =test11
   // dev = new Tester
  }
  
}