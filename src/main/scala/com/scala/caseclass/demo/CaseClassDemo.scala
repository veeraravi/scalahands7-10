

package com.scala.caseclass.demo

/**
 * Scala has a special type of class called a �case� class. 
 * By default, case classes are immutable and compared by value. 
 * You can define case classes with the�case class�keywords.
 * 
 * */

case class Point(x:Int,y:Int){
  var this.x:Int = x;
  var this.y:Int = y;
  
  def show(){
    println("I am from show")
  }
}

class ClassPoint(x:Int,y:Int){
  var this.x:Int = x;
  var this.y:Int = y;
 // var p1=Point(100,200)
}

private class CaseClassDemo{
//  var
  class innerTest{

}
}

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    var p1 =  Point(1,2)
    p1.show()
    var p2 = Point(1,2)
    if(p1 == p2){
      println("CASE CLASS OBJ SAME")
    }
    else 
      {
        println("CASE CLASS OBJ NOT SAME")
      }
    
    println("Case Class P1 "+p1);
    
    var clasP1 = new ClassPoint(1,2)
    var clasP2 = new ClassPoint(1,2)
    if(clasP1 == clasP2){
      println("CLASS OBJ SAME")
    }
    else
      println("CLASS OBJ NOT SAME")
    
    println("Class p1 "+clasP1)
    
  }
}