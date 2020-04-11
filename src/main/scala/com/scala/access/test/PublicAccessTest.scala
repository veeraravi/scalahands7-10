package com.scala.access.test

/*class ProtectedAccess2 {
  protected val name = "SCALA"
  protected val age = 12
}*/
class AnotherClassPublic{
  val a = new PublicAccess();
  println(a.name)
  println(a.age)
  a.disp()
}

object PublicAccessTest {
  def main(args: Array[String]): Unit = {
    val a = new PublicAccess();
    println(a.name)
    println(a.age)
    a.disp()
    println("=========Protected========")
    val pro:ProtectedAccess = new ProtectedAccess()
     pro.disp()
  }
    
  }
