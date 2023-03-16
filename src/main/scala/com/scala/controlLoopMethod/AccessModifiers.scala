package com.scala.controlLoopMethod

class AccessModifiers {
 private var sal:Double = 1000.00;
  var id :Int = 101;
  protected var accessName:String = "SCALA"
  
  def setSal(sal:Double):Unit={
    this.sal = sal;
  }
  
  def getSal():Double={
    return sal;
  }
}