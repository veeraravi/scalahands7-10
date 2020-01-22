package com.scala.inheritance

class Person(fName:String,lName:String,age:Int){
  def this(fName:String,age:Int){
    this(fName,"Apache",age)
  }


}

class CallAxilirayConstructorFromSubClass(fName:String,age:Int)
            extends Person(fName,age) {
  
}