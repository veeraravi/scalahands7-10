package com.scala.abstractdemo

sealed  trait Friend{
  val name : String;
  def listen(){
    println("I am "+ name + " listing")
  }
}


class Human2(override val name: String) extends Friend
{
 def show(){
   println("I am from Human2 class")
 }

 // override val name = "SCALA TRAIT"
}

class Animal1(val name:String)
{
  def print(name:String){
    println("Iam from Animal1 class with name "+name)
  }
}

class Dog1(override val name:String) extends Animal1(name)with Friend {
  
}

/*
* abstract class A{}
* interface I {}
* class NC exentds A implements I{}*
*
* */






object TraitDemo2 {
  
  def disp(frind:Friend){
    frind.listen();
  }
  
  def main(args: Array[String]): Unit = {
    /* val ravi = new Human("RAVI");
         ravi.listen()*/
     val dog = new Dog1("dog")
         dog.listen()
         
     val ravi =  new Human2("Veeraravi");
     ravi.listen();
  }
  
  
 
}