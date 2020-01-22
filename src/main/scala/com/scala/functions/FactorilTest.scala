package com.scala.functions

object FactorilTest {
  def main(args:Array[String]): Unit={
    
    val factValue = fact(15000);
    
    println("Factorial of 4   "+factValue);
  }
 
  def fact(n:BigInt):BigInt={
   if(n==0) 1
   else
     n * fact(n-1);
  }
  
 
}