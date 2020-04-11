package com.scala.functions

object FunctionWithDefaultValue {
  def main(args: Array[String]) {
 println( " Returned Value when no value passed  : " + addInt() );
 println( " Returned Value when value passed : " + addInt(100,200) );
 println( " Returned Value when single value passed : " + addInt(100) );



  }
  def addInt( a:Int=5, b:Int=7 ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def addMe( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }
}