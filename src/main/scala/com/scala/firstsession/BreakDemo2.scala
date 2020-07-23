package com.scala.firstsession

import scala.util.control._

object BreakDemo2 {
  def main(args: Array[String]): Unit = {
    val inner = new Breaks
    val outer = new Breaks

    outer.breakable{
      for(i <- 1 to 3){        
        inner.breakable{
        for(j <- 1 to 5){
          if(i == 3 && j == 3)inner.break() else println("I and J values "+(i,j))
          if(i == 5 && j == 5)outer.break()
        }
        }
      }
    }
    
  }
}