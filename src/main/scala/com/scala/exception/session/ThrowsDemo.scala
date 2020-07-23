package com.scala.exception.session

object ThrowsDemo {
  
  def main(args: Array[String]): Unit = {
  try{
  var isEligible = validateAge(17)
  println(isEligible)
  }
  catch{
    case t: Throwable => println("Not eligible for vote");
  }
//  var isEligible = validateAge(17)
//  println(isEligible)
  println("After the call validate age");
  }
    
  
  @throws(classOf[ArithmeticException])
  def validateAge(age:Int):Boolean ={ 
  if(age < 18){
    throw new ArithmeticException()
   // return false;
  }
  else{
   println("eligible for vote");
   return true;
  } 
  
}
}