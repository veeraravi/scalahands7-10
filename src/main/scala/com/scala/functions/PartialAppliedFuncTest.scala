package com.scala.functions

object PartialAppliedFuncTest {
  def main(args: Array[String]): Unit = {
 //   println("test")

    val t1 = test("Veera",_:String)
    t1("SIngiri")
  //  val t2 = test("Ravi","Singiri")
  }
  def test(fname:String,lName:String="scala"):Unit={
    println("fName = "+fname)
    println("lName = "+lName)
  }

 /* def test2(fn:String,lN:String):Unit={
    println("fName in test2 = "+fn)
    println("lName in test2 = "+lN)
  }*/
}
