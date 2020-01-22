package com.scala.functions

object StackOverFlowExceptionDemo {
  def main(args: Array[String]): Unit = {
    disp()
  }

  def disp(): String ={

    disp()

  }

}
