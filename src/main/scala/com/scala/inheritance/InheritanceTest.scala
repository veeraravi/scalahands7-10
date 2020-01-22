package com.scala.inheritance

class EmployeeTest{
  var sal:Double = 10000;  
  def getSal(){
    println("salary is "+sal)
  }
}

class ProgrammerTest extends EmployeeTest{
  var bonus:Double = 2500
  var totalSal:Double = 0.0d
  def calTotalSal():Double={
    totalSal = bonus+sal    
    totalSal
  }  
  }


object InheritanceTest {
  
  def main(args: Array[String]): Unit = {
    
    val emp = new EmployeeTest;
    println(emp.sal)
    emp.getSal()
    
    println("======== Chaild Class Detail ==========")
    val pro = new ProgrammerTest
    println(pro.sal)
    println(pro.bonus)
    println(pro.calTotalSal())
    pro.getSal()
    
  }
}