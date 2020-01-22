package com.scala.functions

object FunctionCallByNameTest {
  def main(args:Array[String]): Unit ={
    delayedTime(time());//
  }
  
  def time():Long ={
    println("Getting system time in Nano Secs");
    println("System.nanoTime "+System.nanoTime())
      System.nanoTime();
  }
  
  def delayedTime(time: => Long): Unit ={
    println("Delayed time is");
    println("Param : "+time);
    time;
    
  }
}