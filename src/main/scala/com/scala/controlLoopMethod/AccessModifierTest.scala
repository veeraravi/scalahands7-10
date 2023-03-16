package com.scala.controlLoopMethod

import com.scala.access.test.PublicAccess

object AccessModifierTest {
  def main(args: Array[String]): Unit = {
    var obj = new AccessModifiers();
    //var obj2 = new ProtectedTest(); 
    
    obj.getSal();
    obj.setSal(100000)
    
    
  //  println(obj.sal)
    println(obj.id)
  //  println(obj2.accessName)
  val p:PublicAccess = new PublicAccess()
    println(p.name)
    println(p.age)
    p.disp()
  }
}