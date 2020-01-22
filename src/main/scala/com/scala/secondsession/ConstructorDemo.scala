package com.scala.secondsession

class Employee(val name:String,val age:Int,val sal:Double){ 
  
  var this.name = name;
  var this.age = age;
  var this.sal = sal;  
  
  def print(){
    println("Name "+name)
    println("age "+age)
    println("Sal "+sal)
  }
  
  def this(obj:Employee){
    this(obj.name,obj.age,obj.sal)
    var this.name = obj.name
    var this.age = obj.age
    
  }
}
/*setters 
 * getter
 * 
 * **/


object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    var ravi:Employee = new Employee("VEERARAVI",33,1000.00)
    ravi.print()    
    println("age "+ravi.age)
    println("name "+ravi.name)
    println("sal "+ravi.sal)
    
    
    var veera = new Employee(ravi)
    veera.print()
    
    var abhisek:Employee = new Employee("ABHISEK",27,10000.00)
    abhisek.print()    
    
   /* var manoj:Employee = new Employee("ABHISEK",27)
    abhisek.print() 
    
    var anjali = new Employee("Anjali",12032)
    
    var me = new Employee();*/
  }
}