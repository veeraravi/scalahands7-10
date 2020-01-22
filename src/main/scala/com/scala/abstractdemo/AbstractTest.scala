package com.scala.abstractdemo

//simple abstract class

abstract class AbClass1(name:String,age:Int){
  var name1 = name;
  var age1 = age;
  
  def write()
  def prints(){
    println("Iam from abstract class");
    println("name "+name1+" age "+age1)
  }


  
  
  val lname = "";
  
/*  def this(name:String){
    this("",0)
  }*/
}

class AbImpl1(x:String,y:Int) extends AbClass1(x,y){
  def write(){
    println("I am from implemented class")
  }
}
object AbstractTest {
  def main(args: Array[String]): Unit = {
    var x = new AbImpl1("KUMAR",33);
    x.write()
    x.prints()
    //abstract class can not instantiated
  //  var ab = new AbClass1();
    
    // AbClass1 a = new AbImpl1()
    
   // var ab:AbClass1 = new AbImpl1()
  }
}