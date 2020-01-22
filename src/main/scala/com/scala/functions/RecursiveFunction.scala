package com.scala.functions

object RecursiveFunction {
  def main(args: Array[String]) {
 /*for (i <- 1 to 10)
 println( "Factorial of " + i + ": = " + factorial(i) )*/
    
    println( "Factorial of 2: = " +factorial(15000))
 }

 def factorial(n: BigInt): BigInt = { 
 if(n == 1)
   return 1

//println("X value before rec"+x)
 val x = n * factorial(n - 1)
   /*
   * 1 ==> 4 * factprial(3) -- 4 * 3 * 2 *1
   * 2 ==>4 * 3 * factorial(2)   -- 4*3*2
   * 3 ==> 4 * 3 * 2 * factorial(1)
   * 4 ==>4 * 3 * 2 * 1
   * */
 println("X value after rec"+x)
 return x;
 }
}