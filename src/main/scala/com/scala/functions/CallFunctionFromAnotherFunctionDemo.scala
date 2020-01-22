package com.scala.functions

object CallFunctionFromAnotherFunctionDemo {
  def main(args: Array[String]): Unit = {

    println("emp details for empId=1"+getNamebyId(1))

  }

  def getSal():Double={
    val bonus = 2000;
    val sal = 10000+bonus;
    return sal;
  }

  def getNamebyId(id:Int):String={
    if(id==1){
      val sal = getSal()
      return "Name is Veera and Salary= "+sal
    }
    else if(id == 2){
      return "RAVI"
    }
    else{
      return "No emp found"
    }
  }
}
