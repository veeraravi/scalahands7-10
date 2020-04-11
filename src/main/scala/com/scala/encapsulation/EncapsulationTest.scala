package com.scala.encapsulation

class EncapsulEmployee{
  private var id = 0;
  private var name = "";
  private var sal=0.0D;

  def setId(id:Int): Unit ={
    this.id = id;
  }
  def getId():Int={
    return id;
  }
}



object EncapsulationTest {
  def main(args: Array[String]): Unit = {
    val test = new EncapsulEmployee();
  //  println(test.id)

    test.setId(101)
    println(test.getId())

    test.setId(102)
    println(" after setting "+test.getId())

  }
}
