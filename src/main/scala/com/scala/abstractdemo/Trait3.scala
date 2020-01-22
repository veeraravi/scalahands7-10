package com.scala.abstractdemo

/*trait Animal11 {
    def walk { println("Animal is walking") }
}

class FourLeggedAnimal extends Animal11 {
    override def walk { println("I'm walking on all fours") }
}

class Dog1 extends FourLeggedAnimal {
    def walkThenRun {
        super.walk                    // works
        super[FourLeggedAnimal].walk  // works
    //    super[Animal].walk            // error: won't compile
    }
}*/





trait Human {
    def hello = "the Human trait"
}

trait Mother extends Human {
    override def hello = "Mother"
}

trait Father extends Human {
    override def hello = "Father"
}

class Child extends Human with Father with Mother  {
    def printSuper = super.hello
    def printMother = super[Mother].hello
    def printFather = super[Father].hello
    def printHuman = super[Human].hello
}

/*class ClassWithTrait extends Human{

}*/

object Trait3 {
  val c = new Child
  def main(args: Array[String]): Unit = {
    println(s"c.printSuper = ${c.printSuper}")
    println(s"c.printMother = ${c.printMother}")
    println(s"c.printFather = ${c.printFather}")
    println(s"c.printHuman = ${c.printHuman}")
  }
    
}