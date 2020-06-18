package com.scala.control_statements

object IF_ELSE_Demo {
  println("-------Entered into object ------")


  def main(args: Array[String]): Unit = {
    println("-------Entered into Main ------")

    println("Enter the age :")
    val age = scala.io.StdIn.readInt()

    // only if
   /* if(age >= 20){
      println("age is "+age)
      println("Eligible to vote")
    }*/
    //if and else
    println("age is "+age)
    if(age >= 20){
      println("Eligible to vote")
    }else{
      println("Not eligible to vote")
    }


    println("-------Exiting into Main ------")
  }
}
