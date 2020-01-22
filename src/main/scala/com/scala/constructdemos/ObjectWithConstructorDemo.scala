package com.scala.constructdemos

//class with Primary constructor in line 4
class PenClass(var name:String="PEN",var id:Int=0,var penType:String="BALL PEN",var color:String="BLUE") {

  val age = 60;
  private var sal = 1000;


  def printPenClass() {
    println("name of pen is " + name + ", id is " + id + ", penType is " + penType + " and color is " + color)
  }

  def write(name: String, color: String): Unit = {
    println("name of pen is " + name + " and color is " + color)
  }

  def this(name: String, id: Int) { //auxiliary constructor
    this(name, id, penType="ball", color="blue") // calling primary constructor
  }

}


object ObjectWithConstructorDemo {
  def main(args: Array[String]): Unit = {
    val suresh = new PenClass("CELLO",10,"BALL POINT PEN","GREEN")
    suresh.printPenClass()
    suresh.write(suresh.name,suresh.color)
    val prasad = new PenClass("Prasad's Pen",10)
suresh.age;
   //suresh.sal
    val veera = new PenClass(id=100,name="Veera")

    println("name "+veera.name)
    ObjectWithConstructorDemo.prints();
  }

  def prints(): Unit ={
    println("I am from prints")
  }
}
