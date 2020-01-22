package com.scala.abstractdemo

abstract class RBIBank{
  def getRateOfInterest():Int
  val roi = 5;
  def prints(){
    println("I am from RBI")
  }
}

class SBI extends RBIBank{
  override def getRateOfInterest():Int={
    8
  }
 override val roi = 10;
  prints()
  
  def disp(){
    println("SBI ROI "+roi)
  }
  
}

class ICICI extends RBIBank{
  override def getRateOfInterest():Int={
    9
  }
}

class HDFC extends RBIBank{
  override def getRateOfInterest():Int={
    11
  }
}

class YES extends RBIBank{
  override def getRateOfInterest():Int={
    10
  }
}


object AbstractTest2 {
  def main(args: Array[String]): Unit = {
   
  var sbi = new SBI
  sbi.prints()
  }
}