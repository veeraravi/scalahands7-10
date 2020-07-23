package com.scala.exception.session

object TryCatchDemo {
  def main(args: Array[String]): Unit = {
    try{
      val res = 100/0;
    }catch {

      case x: NullPointerException =>{ println("Nullpointer");
        /*x.getCause()
        x.getMessage()
        x.getStackTrace()*/
      }
      case a: ArithmeticException =>{
        println("Arithmatic");
        /* println(a.getCause())
         println(a.getMessage())
         println(a.getStackTrace())*/
      }
      // case t: Throwable => println("Dividing is not possibl wth 0");
      case ravi:Exception => {
        ravi.printStackTrace()
        ravi.getCause()
      }
    }
    finally {
      println("Hi Scala, i am from finally");
    }
    println("rest of the code")
  }
}
