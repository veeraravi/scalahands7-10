package com.scala.inheritance

import com.scala.access.test.PublicAccess
import com.scala.access.test.ProtectedAccess

class Nomodifier extends PublicAccess{
  def testDisp(): Unit ={
  //val pa = new PublicAccess()
    println(name)
    println(age)
    disp()
  }
}
class ProtectedAccessTest extends ProtectedAccess{
  def protectedTestDisp(): Unit ={
    println(name)
    println(age)
  }
}
class TestNomodifierSub extends Nomodifier{
  def test(): Unit ={
    println(name)
    println(age)
    disp()
  }
}

object AccessModifierSubclassTest {

}
