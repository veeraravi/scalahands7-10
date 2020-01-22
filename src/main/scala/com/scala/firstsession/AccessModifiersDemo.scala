package com.scala.firstsession

class AccessModifiers1{
  private var accessSal:Double = 1000.00;
  var accessId :Int = 101;
  protected var accessName:String = "SCALA"
  
  def show(){
    println("Sal same class"+accessSal);
    println("name same class"+accessName);
    println("id same class"+accessId);
  }
}

class SubAccessModifier extends AccessModifiers1{
  def prints(){
  // println("Sal "+accessSal);
    println("name "+accessName);
    println("id "+accessId);
  }
}

class test2{
  var am:AccessModifiers1 = new AccessModifiers1;
  def show(){
  //  println("Sal same class"+am.accessSal);
  //  println("name same class"+am.accessName);
    println("id same class"+am.accessId);
  }
}



object AccessModifiersDemo {
  
}