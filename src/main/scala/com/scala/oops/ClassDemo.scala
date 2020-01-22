package com.scala.oops

class PersonTest {
  
  var name:String="Scala"
  var age:Int=0;
  var dob="21-10-1985"
  
  def disp(){
    println("Name "+name+" Age "+age+" dob "+dob)
  }
 //blocks
 //Constructors
 // inner class
  
}

class PersonTest2(name:String,age:Int,dob:String){
  
  def disp(){
    println("Name "+name+" Age "+age+" dob "+dob)
  }
 //blocks
 //Constructors
 // inner class
  
}
class ClassDemo{
  
}

object ClassDemo{
  def main(args: Array[String]): Unit = {

    var ravi:PersonTest = new PersonTest();

    println("BEFORE Name is "+ravi.name)
    println("BEFORE age is "+ravi.age)
    println("BEFORE dob is "+ravi.dob)

    ravi.name = "Veeraravi"
    ravi.age=35
    ravi.dob = "21-10-1985"
    
    println("After Name is "+ravi.name)
    println("After age is "+ravi.age)
    println("After dob is "+ravi.dob)
    
    ravi.disp()
    
    println("------------------------")
    
    var raju = new PersonTest();
    var  rani = new PersonTest();
    var mantri = new PersonTest();

    raju.disp()
    rani.disp()
    mantri.disp()

    println("-------------Primary Cons-----------")
    
    var spark = new PersonTest2("Spark",30,"21-10-2010")
    spark.disp()
    
    var hadoop = new PersonTest2("Hadoop",12,"21-10-2006")
    hadoop.disp()
    
    var hive = new PersonTest2("HIVE",10,"21-10-2008")
    hive.disp()
  }
}