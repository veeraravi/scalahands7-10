package com.scala.abstractdemo

abstract class MyBank
{
  def getROI()
  private def myDisp(): Unit ={

  }
}
trait FinanceInstitute{
  def getLoan()
}

class Consumer extends MyBank with FinanceInstitute {
  override def getLoan(): Unit = {

  }

  override def getROI(): Unit = {

  }
}

object AbstractTraitDemo {

}
