package com.scala.functions

object CurryingFunctions {
 // def strcat(s1: String)(s2: String) = s1 + s2
//  def strcat(s1: String) = (s2: String) => s1 + s2
  def main(args: Array[String]): Unit = {
    //strcat("foo")("bar")
    //
 val str1:String = "Hello, "
 val str2:String = "Scala!"
 println( "str1 + str2 = " + strcat(str1)(str2) )
 println("Function currying "+strcat(str1)_)
 
 val res = strcat(str1)_
 val res2 = res(str2)

  println("result res "+ res)
 println("result 2 "+ res2)
 
 val cost = calTotalCost(2.5f)_
 
 val finalPrice = cost(5)
 
 println("Shopping cost "+finalPrice)
 
  }
  
def strcat(s1: String)(s2: String) = {
 s1 + s2
 }

def calTotalCost(disc:Float)(qnty:Int):Float={
  val price = 100;
  val totalCost = price * qnty
  
  val discPrice = totalCost - ((totalCost * disc)/100)
  
  return discPrice;
}



}