package com.scala.functions

object FuncAsParamDemo {
  
  def main(args: Array[String]): Unit = {
   funcAsParam(500,mulBy2);
    
   // funcAsParam1(100, test)
  }
  
  def mulBy2(x:Int):Int={
    x*2
  }
  /*
  f:Int => Int ---> return value's data type
  |  |
  |  arg's data type
  |
 functionName
   */
  def funcAsParam(x:Int,f:Int => Int):Unit ={
    println(f(x)); //f is nothing but mulBy2(x)
  }
  
  def add(x:Int,y:Int):Int = {
    x
    +y
  }  
  
  def funcAsParam1(x:Int,test:String => AnyVal):Unit ={
    println(test("SCALA")); //mulBy2(x)
  }
  
  
  def test(x:String){
println("Test method called, value of X is "+x)    
  }
  
}