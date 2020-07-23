package com.scala.singletondemo

class myPrivateClass{
  private val id:Int = 100;
  private val sal:Double = 1000.00;
  private def getSal():Double={
    return sal;
  }
}



object CarDemo {
  def main(args: Array[String]): Unit = {
    val bmw = new CarClass()
    bmw.disp()
    //bmw.speed

    val prvt = new myPrivateClass()
   /* println(prvt.sal)
    println(prvt.id)*/
  }
}
