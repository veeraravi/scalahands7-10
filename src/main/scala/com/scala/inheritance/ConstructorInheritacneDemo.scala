package com.scala.inheritance

class Animal(var name:String,var typeofAnimal:String){
 
  println("I am from Primary name "+name+" type of animal "+typeofAnimal)
  
  def this(name:String,age:Int){
    this(name,"General")
    println("name = "+name+" age = "+age)
  }

  def this(){
    this("Citty","General")
    println("name = "+name)
  }
  def this(name:String){
    this(name,"Human")
  }
}

class Ravi(name:String,typeofAnimal:String) extends Animal(name,typeofAnimal){


}




class Cow(val name1:String,age:Int) extends Animal(name1,age){
  
}


class Tiger(val name1:String,typeofAnimal:String) extends Animal(name1,typeofAnimal){
  
}

class Dog extends Animal{

}

object ConstructorInheritacneDemo {
  
  def main(args: Array[String]): Unit = {
    val c = new Cow("Gowri",25)
    val t = new Tiger("raa","wild")
  }
}