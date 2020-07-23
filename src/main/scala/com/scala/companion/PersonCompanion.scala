package com.scala.companion

class PersonCompanion(var id:Int,var name:String,var income:Double){
  private var pId = id
  private var pName = name
  private var pIncome = income

  private  def getPersonDetails(): Unit ={
    println("Id "+pId)
    println("Name "+pName)
    println("income "+pIncome)
  }



}

object PersonCompanion {

  def apply(id: Int,name: String, income: Double): PersonCompanion={
    var pd = new PersonCompanion(id,name,income)
    pd.id = id
    pd.name = name
    pd.income = income
    pd
  }

  def main(args: Array[String]): Unit = {
    var ravi = new PersonCompanion(101,"RAVI",100.00d)
    println("Private member Id"+ravi.pId)
    println("Private member name"+ravi.pName)
    println("Private member income"+ravi.pIncome)
    ravi.getPersonDetails()
    //since defined apply method for companion object
    // no need to use New keyword to create object
    var veera = PersonCompanion(102,"VEER",1000.00d)

  }

}
