package com.scala.exception.session

object WithExceptionHandlingDemo { 
  
  def main(args: Array[String]): Unit = {
    println("Hi Scala, you are beautiful  language to learn  1 ");
    println("Hi Scala, you are beautiful  language to learn  2 ");
    println("Hi Scala, you are beautiful  language to learn  3 ");
    var x =0;
    try{    
     var res = 100/x; //
     
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

    println("Hi Scala, you are beautiful  language to learn  4 ");
    println("Hi Scala, you are beautiful  language to learn  5 ");
    println("Hi Scala, you are beautiful  language to learn  6 ");
    println("Hi Scala, you are beautiful  language to learn  7 ");
    println("Hi Scala, you are beautiful  language to learn  8 ");
    println("Hi Scala, you are beautiful  language to learn  9 ");
    println("Hi Scala, you are beautiful  language to learn  10 ");
    println("Hi Scala, you are beautiful  language to learn  11 ");
    println("Hi Scala, you are beautiful  language to learn  12 ");
    
   /* var retu = test();
    println(retu)*/
  }
  
  def test() ={

  }
}