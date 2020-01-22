package com.scala.secondsession

class SCTest(val name:String,val age:Int,val roll:Int){
 // when we defing a def this() we should call main constructor
  /*
   * this.name
   * this()
   * def this(){
   * }
   * */
  1
  def this(stName:String,age:Int){
    this(stName,age,0);    
    println();
    
  }
  def this(name:String){
    this(name,0,0)
  }
  def this(){
    this("Veera",0,0);
  } 
  
  def this(id:Int){
    this("",id,0)
  }
 /* 
  def this(name:String,age:Int,roll:Int){
    this("",0,0)
  }*/
  
  {
    println("IIB")
  }
  
  def show()={
       println("Name : "+name)
       println("Age : "+age)
       println("Roll : "+roll) 
       println("=============== ");
  }
}



object SecondaryConstructorDemo {
  
  def main(args: Array[String]): Unit = {
    var threeParams = new SCTest("RAVI",33,110212) 
    
    var nameParam = new SCTest("VEERA")
    
    var noParam = new SCTest();
    
    
    var rollParam = new SCTest(102102)
  }
  
  
}