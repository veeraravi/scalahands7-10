package com.scala.abstractdemo

class Test1(name:String,age:Int,sal:Double){
  def this(name:String,age:Int){
    this(name,age,0.0)
  }
}

class Test12(x:String,y:Int) extends Test1(x,y)

object TestCons {
  def main(args: Array[String]): Unit = {
    var test = new Test12("X",2);
    
  }
}