package com.scala.encapsulation

class SettersGetters{
  private var name1:String = "";
  private var id1:String=""
  private var sal1:Double=0.0d;


}



class TestPOJO(protected var name:String,
                var id:String,
                var sal:Double){

  def printDetails(): Unit ={

  }
}


class Person( private var name:String,
              val id:String,
              var salary:Double){

  /*def getName(): String ={
    name
  }
def getId(): String ={
  id
}*/
  def disp(): Unit ={
    println("I am from disp in Person POJO")
    println("name = "+name+" id = "+id+" salary = "+salary)

  }
}



object EncapsulationDemo {
  def main(args: Array[String]): Unit = {
    val ravi:Person = new Person("VEERA","101",1000.00)
    ravi.disp()
    ravi.getClass().getName
 //   ravi.getClass().

//ravi.name = "VEERARAVI";

    //println("Name using getter "+ravi.getName)
    //ravi.id = ""

    var x = new TestPOJO("Test","m101",100.00)

   //x.id
  //  println(x.name)
   // println(x.id)
   // println(x.sal)
  }
}
