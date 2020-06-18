package com.scala.exception.session

object TryCatchDemo {
  def main(args: Array[String]): Unit = {
    try{
      val res = 100/0;
    }
    println("rest of the code")
  }
}
