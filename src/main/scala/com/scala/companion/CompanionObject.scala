package com.scala.companion

class CompanionObject(id1:Int,name1:String,sal1:Double){
  private var id = id1;
  private var name  = name1;
  var sal = sal1
  def show(){
    println("Name "+ name+" id "+id);
  }
}

object CompanionObject {

  def main(args: Array[String]): Unit = {
  //println(" I am from Object-- Name "+ CompanionObject.name+" id "+CompanionObject.id);
    /*val x:CompanionObject = new CompanionObject()
    println(x.id)
    println(x.name)
println(x.sal)*/
    //CompanionObject.show()

   // x.show()

    val co1:CompanionObject = CompanionObject(1,"scala",1000.00);
    println(co1.id)
    println(co1.name)
    println(co1.sal)




  }

  def apply(id1:Int,name1:String,sal1:Double):CompanionObject={
  new CompanionObject(id1,name1,sal1)
  }
}