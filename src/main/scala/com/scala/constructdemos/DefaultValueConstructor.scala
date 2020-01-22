package com.scala.constructdemos

class DefaultValueConstructor(fName:String="Hadoop",lName:String="Apache") {
  override def toString():String={
    "FirstName = "+fName+" Last Name "+lName;
    
  }
  /*def this(){
    //this()
  }*/
}