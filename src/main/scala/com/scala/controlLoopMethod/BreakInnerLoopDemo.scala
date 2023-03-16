package com.scala.controlLoopMethod

import scala.util.control.Breaks._

object BreakInnerLoopDemo {
  def main(args: Array[String]): Unit = {  
    
    breakable{
    for(i <- 1 to 5){
      if(i == 4) break;
      breakable{
        for(j <- 1 to 3){
          if(i == 3 && j == 2) break;
          println("Inner Loop --> i value from outer = "+i+" j value from inner = "+j)
        }
      
    }
      println("OUTER LOOP")
       
    }
    }
    println("Inside Main after loop")
  }
}