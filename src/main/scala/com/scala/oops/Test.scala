package com.scala.oops

import com.scala.access.test.ProtectedAccess


class ProtectedSub2 extends ProtectedAccess{
  println(age)
  println(name)
}
object Test {
 
  def main(args:Array[String]):Unit = {
  val name = new ConstructorDemo;
  println(name.firstName)
  println(name.lastName)
  println(name.name)

    val x = new ProtectedAccess

  //  println(x.age)
  //  println(x.name)

  }
}