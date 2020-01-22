
package com.scala.access.test

import com.scala.firstclass.ScalaStudent
import com.scala.firstsession.AccessModifiers
import com.scala.inheritance.ClassA

class TestingAccess
{
  var am:AccessModifiers = new AccessModifiers;
  def showDetails(){
  //  println("Sal same class"+am.accessSal);
   // println("name same class"+am.accessName);
   // println("id same class"+am.accessId);
    
  }
}

class TestProtect extends AccessModifiers{
  def showDetails(){
  //  println("Sal same class"+accessSal);
    println("name same class"+accessName);
 //   println("id same class"+accessId);
    
  }
}
class ProtectedDemo2 extends ClassA{
  println(fee)
}

class ProtectedSub extends ProtectedAccess{
  println(age)
  println(name)

  val age1 = age
  val name1 = name
}


object Test {
  def main(args: Array[String]): Unit = {
    val p:PublicAccess = new PublicAccess()
    println(p.name)
    println(p.age)
    p.disp()
    
    val pro:ProtectedAccess = new ProtectedAccess()
    //println(pro.name)
   // println(pro.age)

    val std:ScalaStudent = new ScalaStudent();
    println()

    val pp = new PrivateParent
   // println("age "+pp.age)

    val ps = new ProtectedSub
   // println(ps.)
  }
}
