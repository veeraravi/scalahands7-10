package com.scala.exception.session

import java.io.FileNotFoundException
import java.sql.SQLDataException

class ExceptionExample{
  //without exception handling
  def divide(a:Int, b:Int) = {
    a/b             // Exception occurred here
    println("Rest of the code is executing...")
  }

  //Exception Handling
  def divideWithTryCatch(a:Int, b:Int) = {
    try{
      a/b
      var arr = Array(1,2)
      arr(10)
    }catch{

      case e: ArithmeticException => println(e)
      case e1: ArrayIndexOutOfBoundsException => println(e1)
      case e1: NullPointerException => println(e1)
      case e1: FileNotFoundException => println(e1)
      case e1: StringIndexOutOfBoundsException => println(e1)
      case e1: SQLDataException => println(e1)
      case e1: Exception => println(e1)
      case e1: Throwable => println(e1)

    }
    println("Rest of the code is executing...")
  }

  def validate(age:Int)={
    if(age<18) {
      throw new ArithmeticException("You are not eligible")
    }
    else println("You are eligible")

    println("Rest of the code in validate method")

  }

  @throws(classOf[NumberFormatException])
  def validateThrows()={
    "abc".toInt
  }





}
object MainObjectException {
  def main(args:Array[String]) {
    var e = new ExceptionExample()
  // e.divide(100,0)
   // e.divideWithTryCatch(10,10)
   // e.validate(13)
/*   try{
     e.validate(13)
   }catch {
    case x:Exception => println(x)
   }*/

   // e.validateThrows()

    try {
      e.validateThrows()
    }
    catch {
      case x:NumberFormatException => {
        println("exception object "+x)
        println("Get CAUSE "+x.getCause)
        println(" Get Message "+x.getMessage)
        println(" Get stackstrace "+x.getStackTrace)
      }
      }
    }
  }

