package com.scala.controlLoopMethod

class Emp {

}
object MatchDemo {
println("====================1=================")
  def main(args: Array[String]): Unit = {

    val record  = ("RAVI",32,"MCA",1000.50)
    println("=================2====================")

     var e = new Emp();


    var fruit:Any = "apple";

    fruit match {
      case "apple" => {
                        println("APPLE")
                        for (i <- 1 to 5) {
                          println(i)
                        }
                      }
      case "Grapes" => println("Grapes")
      case "Banana" => println("BANANA")
      case "Oranges" => println("ORANGE")
      case "Mango" => println("MANGOS")
      //    case "Mango" => println("MANGOS2")      

      case 10 => println("its value 10")
      //  case 10 => println("its value 10")
      //case e => println("")
      case _ => println("no match found")
    }

    println("================3=====================")

   
    var ele:Any = 100.0f;

    var typeMatchVar = ele match {
      case abhisek: Int => {
                            var str = "I am Integer Type value"
                            println("prinltn ");
                            str
                            }
      case f: Float   =>  " I am float"
      case d: Double  =>  "I am Double"
      case s: String  =>  "I am String"
      case b: Boolean => "I am Boolean"
      //case b: Boolean => "I am boolean"
      case _: Any => "I am Any type"
    }

    println("return value from match case " + typeMatchVar);
    
    println("================4=====================")
    (0, 1) match {
      case (0, 0) => println("0,0 ")
      case (0, 1) => println("0,1")
      case (1, 1) => println("1,1")
      case _ => println("default")
    }
    println("================5=====================")
    (10 % 2, 9 % 3) match {
      case (0, 0) => println("0,0 ")
      case (0, 1) => println("0,1")
      case (1, 1) => println("1,1")
      case _ => println("default")
    }
    println("================5.1=====================")
   // println(tupleMatch(2, 2))
    tupleMatch(2, 2)
    /*for(i <- 1 to 10;j <- 1 to 10){
      (i%2,j%3) match {
        case (0,0) => println("resut is "+ (i,j))
        case (0,1) => println("0,1")
        case (1,1) => println("1,1")
        case _ =>println("default")
      }
    }*/
  println("==================6===================")
    
     val res = typeMatch(1000)
    println(res)

    println("=================7====================")
    
  }
println("====================8=================")
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
println("===================9==================")
  def multiCaseMatch(x: Int): Any = x match {
    case 1 | 3 | 5 | 7 => "Odd numbers"
    case 2 | 4 | 6 | 8 => "even Number"
    case _ => "10"

  }
 println("====================10=================")

  def tupleMatch(x: Int, y: Any): Unit = (x, y) match {
    case (10, "10") => {
                        println("value 10 and string 10")
                  
                      }
    case (2, y: Int) => {
                        println("value match and Type match")
                      }
    case (_, _) => println("No match case")
  }
println("=====================11================")
  var i = 5;
  i match {
    case i if 0 to 9 contains i => println("0-9 range: " + i)
    case i if 10 to 19 contains i => println("10-19 range: " + i)
    case i if 20 to 29 contains i => println("20-29 range: " + i)
    case _ => println("Hmmm...")
  }
println("======================12===============")
}