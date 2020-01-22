package com.scala.functions

object TailRecursionDemo {
  def main(args: Array[String]): Unit = {
    println(" ****** "+factorial(60000,BigInt(1)))
  }
  def fact(n:BigInt):BigInt={
    if(n==0) 1
    else
      n * fact(n-1);
  }
  def factorial(n:Int,input:BigInt):BigInt ={
           if(n <= 0) input
          else
          factorial(n-1,n*input)
          }
}
/*
fact(4,1)==> n=4,input=1
fact(3,4)==> n=3,input=4
fact(2,12)==> n=2,input=12
fact(1,24)==> n=1,input=24
fact(0,24)==> n=0,input=24
 */