package com.scala.firstclass

object MatchCaseTest {
  
  def main(args:Array[String]):Unit ={
    var caseVar = 1;
    var _x = 100;
    var $y = 1000;

    
    caseVar match {
      case 1 => println("Print one")
      case 2 => println("Print two")
      case _ => println("I am default")
    }  
    
    println(select(1))
    println(select1(1))
  }

  
  def select(x:Int): String = {
    x match{
      case 1  => "YES"
      case 0 => "No";
      case _ => "Please enter 1 or 0";
       
    }  
  }  
    
    
    def select1(x:Int) = {
    x match{
      case 1 => println("YES")
      case 0 => println("No")
      case _ => println("Please enter 1 or 0");
       
    }  
    }
    
    def choose(arg:String):String = arg match {
      case "1" | "y" | "Yes" | "Y" => "Yes"
      case "default" => "Please choose valid value"

        /*
        * x match {
        * case "1" => "YES"
        * case "y" => "YES"
        * case "Y" => "YES"
        * */
    }
    
    
    def typedPattern(x : Any): String = x match{
      case i:Int => "Intreger value :" + i
      case d:Double => "It is a Double Value " + d
      case s:String => "It is String " + s
      case _:Any => "Default is any"    
}
    
    def tupleMatch(i:Int,s:Any) = (i,s) match {
      case (10,"Ten") => print("its 10, Ten");
      case (20, x:Int) => if(x > 10) "x is > 10" else "x is not > 10"
      case (1,"One") => typedPattern(1)
      case _ => println("Choose correct value");
    }
    
}