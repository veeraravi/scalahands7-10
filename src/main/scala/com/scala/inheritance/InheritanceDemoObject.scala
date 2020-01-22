package com.scala.inheritance

import com.scala.inheritance.Employee
import com.scala.inheritance.Developer

object InheritanceDemoObject {
  def main(args: Array[String]): Unit = {
    var ravi = new Employee()
    
    println("Parent's Sal "+ravi.sal)
    ravi.disp()
    
    println("============Child===============")
    
    var babu = new Developer()
    println("Child bonus "+babu.bonus)
    println("Child Sal "+babu.sal)
    
    babu.disp()
    
    babu.prints()
    
  }
}