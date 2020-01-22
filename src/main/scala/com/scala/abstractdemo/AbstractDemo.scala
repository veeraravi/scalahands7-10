package com.scala.abstractdemo

abstract class Animal(name:String,animalType:String){
  
  var  id:Int =1;
  val rate:Double=0.0
  
  val age:Int = 0;
  
  def greeting:String
  
  def eat()
  def run
  def makeSound
  
  // non-abstract or concret methods
  def disp(){
    println("I m from abstract class ")
    testPrivate()
  }
  
  def this(name:String){
    this(name,"Animal")
  }

  private def testPrivate(): Unit ={
    println("I am from private method in abstract")
  }

}


class Dog(name:String,dogType:String) extends Animal(name,dogType){
 
  var id1:Int = 20;
//  rate = 200.00;
  id = 200;
  
 // override def age = 25;
  
  val greeting = "Dog---->Good morning";
  
  override val rate:Double = 20000.00

  override def eat(){
    println("Dog eating");

  }
  override def run(){
    println("Dog running")
  }

 override def makeSound(){
    println("BOW BOW")
  }
}

class Cat(name:String,catType:String) extends Animal(name,catType){

   def eat(){
    println("Cat eating");
  }
  def run(){
    println("Cat running")
  }
  
  def makeSound(){
    println("MEEAM MEEEAM")
  }
    val greeting = "CAT---->Good morning";

}


class xyz(name:String) extends Animal(name){
  def eat(): Unit = {
    
  }
  def makeSound: Unit = {
    
  }
  def run: Unit = {
    
  }
  val greeting = "XYZ---->Good morning";

}

object AbstractDemo {
  
  def main(args: Array[String]): Unit = {
    val dog = new Dog("tommy","x")
    println(dog.id)
    println(dog.rate)
    dog.eat()
    dog.run()
    dog.makeSound()
    println(dog.greeting)
    dog.disp()
    
    val cat = new Cat("kitty","cattype");
  //  cat.eat()
 //   cat.run()
 //   cat.makeSound()
    println(cat.greeting)
    cat.disp()
    
 // val animal = new Animal("chichi","abc")
    
    
  }
}