package com.scala.exception.session

class MyException(msg:String) extends Exception(msg){
  def disp(){    
    println("I am from disp in myexception "+msg);
  }
}
object CustomExceptions {
  
  def main(args: Array[String]): Unit = {
    try{
    var amt = test(150)
    println("result "+amt);
    }
    catch{
      case s: MyException => s.disp()
      case x : ArithmeticException => x.getCause
    }
  }  
  
  def test(amount:Double):Double={
    if(amount < 100){
      throw new MyException("less than 100 is not sufficient "+amount)
    }
    else{
      println("Thank you");
      amount
    }
  }
}