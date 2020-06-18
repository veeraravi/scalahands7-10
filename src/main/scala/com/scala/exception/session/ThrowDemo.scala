package com.scala.exception.session

object ThrowDemo {
def main(args: Array[String]): Unit = {
  try{
  var isEligible = validateAge(17)
  println(isEligible)
  }
  catch{
    case t: Throwable => println("Not eligible for vote");
  }
 //  validateAge(13)
  println("After the call to validate age method");
}

def validateAge(age:Int):Boolean ={
  //try{
  if(age < 18){
    throw new ArithmeticException()
   // return false;
  }
  else{
   println("eligible for vote");
   return true;
  } 
 // }
 // catch{
 //   case t: Throwable => println("Not eligible for vote");
    
 // }
  
  println("---------");
  println("------------");
  println("--------------");
  println("-----------------");
  println("---------------------");
  println("-------------------------");
  
  return true;  
}
}