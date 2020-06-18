package com.scala.abstractdemo

trait Prints{
  def printable():Unit // abstract method
 //non-abstract or concret
  def disp(){
    println("I am disp method from Prints Trait")
  }
}
trait Shows{
	def showable():Unit
}

class TraitTests extends Prints with Shows{
 // Members declared in com.scala.abstractdemo.Prints
 override  def printable(): Unit ={
   println("I am from print trait")
 }
  
  // Members declared in com.scala.abstractdemo.Shows
 override def showable(): Unit = {
     println("I am from Show trait")
 }
 
}

abstract class Abs{
  def greet():Unit
}



class AbsTraitTest extends Abs with Prints with Shows{
  
  /** As seen from class AbsTraitTest, the missing signatures are as follows.
 *  For convenience, these are usable as stub implementations.
 */
  // Members declared in com.scala.abstractdemo.Abs
  def greet(): Unit = ???
  
  // Members declared in com.scala.abstractdemo.Prints
  def printable(): Unit = ???
  
  // Members declared in com.scala.abstractdemo.Shows
  def showable(): Unit = ???

}

object TraitTest {
  
}