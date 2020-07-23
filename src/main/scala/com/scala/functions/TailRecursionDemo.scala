package com.scala.functions

import scala.annotation.tailrec

object TailRecursionDemo {
  def main(args: Array[String]): Unit = {
    println(" ****** "+factorial(65000,BigInt(1)))
  }
  def fact(n:BigInt):BigInt={
    if(n==0) 1
    else
      n * fact(n-1);
  }
@tailrec
  def factorial(n:Int,res:BigInt):BigInt ={
           if(n <= 0) res
          else
          factorial(n-1,n*res)
          }
}
/*
fact(4,1)==> n=4,input=1 ==> factorial(3,4)
fact(3,4)==> n=3,input=4 ==> factorial(2,12)
fact(2,12)==> n=2,input=12 ==> factorial(1,24)
fact(1,24)==> n=1,input=24 ==> factorial(0,24)
fact(0,24)==> n=0,input=24  ==> 24
 */