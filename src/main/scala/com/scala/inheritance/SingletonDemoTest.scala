package com.scala.inheritance

class SingletonDemo private{
  override def toString():String = "I am from SingletonDemo";
}

object SingletonDemo{
  val p = new SingletonDemo;
    def getInstance = p;
}


object SingletonDemoTest {  
  def main(args: Array[String]): Unit = {
    
    val person = SingletonDemo.getInstance;
    println(person.hashCode())
    val p2 = SingletonDemo.getInstance;
    println(p2.hashCode());
  }
}