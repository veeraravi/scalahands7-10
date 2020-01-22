package com.scala.companion

class Parent(id:Int,name:String, sal:Double){
  val this.id:Int = id;
  val this.name:String = name;
  var this.sal:Double =sal;
  
  override def toString():String={
    "name "+name+ " id "+id;
  }
  
  def this(id:Int,name:String){
    this(id,name,10000.00)
    
  }
}

class Child(id:Int,name:String, sal:Double) extends Parent(id,name, sal){
  
  var tax:Double = 0.0;
 // override val sal:Double = 100000.00;
  def calTax(percentage:Int):Double = {
    sal-sal*percentage/100;
  }
  override def toString():String={
    "name "+name+ " id "+id;
  }
  def this(id:Int,name:String){
    this(1,"",0.0)
  }
}


object DEmo {
 
  def main(args: Array[String]): Unit = {
    val emp = new Parent(1,"Spark",100000.00)
  println(emp)
  
  val child = new Child(1,"Spark-2",1000001.00);
  println(child);
 println( child.calTax(10));
  }
  
  
}