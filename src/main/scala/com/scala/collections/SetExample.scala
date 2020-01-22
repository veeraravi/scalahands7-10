package com.scala.collections


class SetEmployee(name:String,age:Int,id:String,sal:Double) {
val eName = name
  val eAge = age
  val eId = id
  val eSal = sal
  override def toString = s"SetEmployee($eName, $eAge, $eId, $eSal)"

  def canEqual(other: Any): Boolean = other.isInstanceOf[SetEmployee]

  override def equals(other: Any): Boolean = other match {
    case that: SetEmployee =>
      (that canEqual this) &&
        eName == that.eName &&
        eAge == that.eAge &&
        eId == that.eId &&
        eSal == that.eSal
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(eName, eAge, eId, eSal)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object SetExample {

  def main(args: Array[String]): Unit = {

    val fName = "Animesh"
    val sName = "Animesh"

    val names = Set("JAVA","HDFS","MAPREDUCE","HIVE","SCALA","SPARK","MAPREDUCE","HIVE",fName,sName)
    println(names)
    println("First element from set "+names.head)
    println("last element from set "+names.last)
    println("Except body complete set "+names.tail)
    println("size of set "+names.size)
    println("is it empty set "+names.isEmpty)

    var courses = Set("Java","HDFS", "MapReduce", "scala", "mapreduce", "Hive", "oozie")
    println(courses)
    println("size of courses "+courses.size)
    println("oozie is exists in courses "+courses.contains("oozie"))

    println("********* ADD ELEMENTS TO SET ********")

      courses = courses + "PIG"
    courses+="VEERA"
    println("after adding PIG to set "+courses)

    courses = courses + ("HBASE","FLUME")
    println("after adding hbase and flume as group to set "+courses)

    courses = courses ++ Set("VASAVI","RAM")
    println("after adding vasavi and ram as group to set "+courses)
   // courses.add

var mutableStudents = scala.collection.mutable.Set("veera","animesh","mahesh","veera","vasavi")
println("students "+mutableStudents)
    mutableStudents+="ravi"
    println("add ravi to mutable list "+mutableStudents)
    mutableStudents.add("swetha")
    println("add method in set "+mutableStudents)

    println("*********** DELETION ************")

    mutableStudents -= "veera"
    println("remove element veera in set "+mutableStudents)

    mutableStudents -=("animesh","ravi")
    println("remove element in set "+mutableStudents)

    mutableStudents --=List("vasavi","swetha")
    println("remove element in set "+mutableStudents)

    mutableStudents.remove("")  // remove specified element from set
    mutableStudents.retain(ele => ele.equalsIgnoreCase("")) // removes element based on condition
    mutableStudents.clear() // removes all the elements
println("**************Deletion in Immutable sets")
    courses = courses - "PIG"
  //  courses+="VEERA"
    println("after removing PIG to set "+courses)

    courses = courses - ("HBASE","FLUME")
    println("after removing hbase and flume as group to set "+courses)

    courses = courses -- Set("VASAVI","RAM")
    println("after removing vasavi and ram as group to set "+courses)

    courses.filter(ele => ele.startsWith(""))
    courses.take(2)

    println("************ HASHSET,TREESET, LINKEDHASHSET, SORTEDSET")

val ten = 10
val dus = 10

    val hashSet = scala.collection.mutable.TreeSet(1,2,3,6,7,8,9,ten,dus,4,5,3,6,4)
    println("numbers "+hashSet)


    val ravi = new SetEmployee("RAVI",34,"R101",1000.00)
    val veera = new SetEmployee("RAVI",34,"R101",1000.00)

    val setEmp = Set(ravi,veera)

    println("Emp "+setEmp)
  }
}
