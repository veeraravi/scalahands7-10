package com.scala.abstractdemo

trait Printable{
  def printThis
  def disp2(): Unit ={
    println("printthis")
  }
}
trait t1{
  def disp()
}

trait t2 extends t1{
  def disp2(): Unit ={
    println("t2")
  }
  def printable(){
    println("I am printable");
  }
  //def testAbstract()
}

class Demo extends Printable with t2{
 override def printThis(){ // this is from Printable
    println("printThis")
  }
 override def disp(){ // t1
   println("DISP");
 }
 override def disp2(){ //from t2
   println("I am DISP2 in demo");
 }
 
}

object TraitDemo {
  
  def main(args: Array[String]): Unit = {
    val d = new Demo;
    d.printThis();
    d.disp()
    d.disp2()
  }
}