package com.scala.controlLoopMethod

object PatternMatchDemo2 {
  def main(args: Array[String]): Unit = {

  /* print("Enter the fruit name :")
   val fruit = scala.io.StdIn.readLine()

  //  var fruit = "Apple";

    fruit match {
      case "Apple" => println("I am Apple")
      case "Orange" => println("I am Orange")
      case "Grapes" => println("I am Grapes")
      case "Mango" => println("I am Mango")
      case _ => println("No matching fruit")
    }*/

   /* var age :Any = 1000;

    var typeMatchVar = age match {

      case abhisek: Int => {
                            var str = "I am Integer Type value"
                                println("prinltn ");
                                str
                            }
      case f: Float   =>  " I am float"
      case d: Double  =>  "I am Double"
      case s: String  =>  "I am String"
      case b: Boolean => "I am Boolean"
      case _: Any => "I am Any type"
    }

    println("return value from match case " + typeMatchVar);*/

   /* (0, 1) match {
      case (0, 0) => println("0,0 ")
      case (0, 1) => println("0,1")
      case (1, 1) => println("1,1")
      case _ => println("default")
    }

    (10 % 2, 9 % 3) match {
      case (0, 0) => println("0,0 ")
      case (0, 1) => println("0,1")
      case (1, 1) => println("1,1")
      case _ => println("default")
    }*/

 //   val res = typeMatch(10000)
 //   println("Returned value : "+res)

  }



  def typeMatch(ele: Any): String = ele match {

    case abhisek: Int => {
                        var str = "Iam Integer Type value"
                        println("prinltn ");
                        str
                      }
    case f: Float => " I am float"
    case d: Double => "I am Double"
    case s: String => "Iam String"
    case b: Boolean => "I am Boolean"
    case _: Any => "I am Any type"
  }

  def multiCaseMatch(x: Int): Any = x match {
    case 1 | 3 | 5 | 7 | 9 => "Odd numbers"
    case 2 | 4 | 6 | 8 | 10 => "even Number"
    case _ => "10"

  }
}
