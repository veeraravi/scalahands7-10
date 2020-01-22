package com.scala.exception.session

class ThrowsTest{
 
  @throws[ArithmeticException]
 // @throws(classOf[])
  def validateAge(age:Int) ={ 
  if(age < 18){
  var x =age/0 
  }
  else{
   println("eligible for vote"); 
  } 
  }
}


object Test {
  
  def main(args: Array[String]): Unit = {  
    var obj = new ThrowsTest();    
  //  try{
    var x = obj.validateAge(16);
    println(x);
  //  }
//    catch{
   //   case t: Throwable => println("Not eligible for vote");
 //   }
    
    println("After the validate call");
  }
  
}