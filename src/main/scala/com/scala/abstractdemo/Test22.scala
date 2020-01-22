package com.scala.abstractdemo

import com.scala.access.test.PublicAccess

abstract class Abs2222{
  def disp(): Unit ={

  }
  def print(): Unit ={

  }
}




object Test22 {
  def main(args: Array[String]): Unit = {
    val a = new PublicAccess();
a.disp()
  }
}
