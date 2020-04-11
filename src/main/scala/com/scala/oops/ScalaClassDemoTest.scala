package com.scala.oops


class ScalaClassDemo {
  var name:String = "Spark";
  var id:Int = 0;
  var income = 100.00;

  def disp(): Unit ={
    println("name is "+name)
    println("id is "+id)
    println("income is "+income)
  }
}

object ScalaClassDemoTest {
  def main(args: Array[String]): Unit = {
    var test = new ScalaClassDemo() //object creation
    test.disp()//accessing the method from object
    println("-----Setting the new values to object-----")
    test.name="Veera" // accessing the variable
    test.id=1010
    test.income=1000.00
    test.disp()
  }

  def printable(): Unit ={

  }

}
