package com.scala.oops

object PersionObject {
  def main(args: Array[String]): Unit = {
    
  // val ravi = new Person(32,"RAVI",100.00);
   // ravi.printPerson();
  //  val kumar = new Person(33,"KUMAR",1000.0);
   // kumar.printPerson()
    
    val ravi = new PersonClass
    val kumar = new PersonClass
    
    ravi.disp();
    kumar.disp();
    
    ravi.age=32;
    ravi.name="RAVI";
    ravi.sal=100.0;
    
    kumar.age=28;
    kumar.name="KUMAR";
    kumar.sal=1000.0
    println("====================");
     ravi.disp();
    kumar.disp();
   // ravi = new Persion;
   
   ravi.main(null)
   kumar.main(null)
  }
}