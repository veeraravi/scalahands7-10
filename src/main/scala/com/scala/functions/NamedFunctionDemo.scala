package com.scala.functions

object NamedFunctionDemo {
  
  def main(args:Array[String]):Unit={
    Print(a=100, b=200);
    Print(b=300, a=500);
    
    Print(a=1000,100);

    Print(20,10)  //-- go as order, 20 will got 1st 10 will goto 2nd arg
    
  }
  
  def Print(a:Int,b:Int):Unit={
   println("VALUE OF A "+a)
   println("VALUE OF B "+b)
   
  }
}