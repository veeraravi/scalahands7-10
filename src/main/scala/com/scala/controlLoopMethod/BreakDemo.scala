package com.scala.controlLoopMethod

import util.control.Breaks._

object BreakDemo {
  
  def main(args: Array[String]): Unit = {
    println("I am from main")
    
    breakable{
      for(i <- 1 to 10){
        println("I value "+ i)
        if(i%2 == 0){
          break;
        }else{
          println("I am from else of break")
        }
      }
    }
    println("=====After break =======");
    
  }
  
}