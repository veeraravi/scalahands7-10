package com.scala.companion

class CompanionObject{
  private var id = 100;
  private var name  = "Spark";
  var sal = 100.00
  def show(){
    println("Name "+ name+" id "+id);
  }
}

object CompanionObject {

  def main(args: Array[String]): Unit = {
  //println(" I am from Object-- Name "+ CompanionObject.name+" id "+CompanionObject.id);
    val x:CompanionObject = new CompanionObject()
    println(x.id)
    println(x.name)
println(x.sal)
  //  CompanionObject.show()

    x.show()
  }

}