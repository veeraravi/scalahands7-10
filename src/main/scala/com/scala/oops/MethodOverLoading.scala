package com.scala.oops

object MethodOverLoading {
  
  def main(args: Array[String]): Unit = {
   
    dispEmp();
    dispEmp("Raju")
    dispEmp("RAJU",100.00)
    dispEmp(100.00,"spark")
  }
  
  
  def dispEmp(){
    println("name scala sal 100 dept IT")
  }
  
  
  def dispEmp(name:String){
   println("name is "+name+" sal is 200") 
  }
  
  def dispEmp(name:String,sal:Double){
   println("name is "+name+" sal is "+sal) 
  }
  
def dispEmp(sal:Double,name:String){
   println("name is "+name+" sal is 200") 
  }  
}