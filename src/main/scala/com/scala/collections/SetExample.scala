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
    /*
    scala> val set1 = Set(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
set1: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 10, 7, 4, 8)

scala> set1.head
res17: Int = 9

scala> val set1 = com.scala.collection.immutable.Set(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
<console>:14: error: object scala is not a member of package com
       val set1 = com.scala.collection.immutable.Set(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
                      ^

scala> val set1 = scala.collection.immutable.Set(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
set1: scala.collection.immutable.Set[Int] = Set(5, 10, 1, 6, 9, 2, 7, 3, 8, 4)

scala> val nums = List(1,10.0d,100,100.00f,15.toByte,10.toShort,1025469874563215489l,null)
nums: List[Any] = List(1, 10.0, 100, 100.0, 15, 10, 1025469874563215489, null)

scala> val set1 = HashSet(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
set1: scala.collection.mutable.HashSet[Int] = Set(9, 1, 5, 2, 6, 3, 10, 7, 4, 8)

scala> var s1 = Set(1,2,3,4,5,6,7,8)
s1: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 6, 3, 7, 4, 8)

scala> s1.head
head   headOption

scala> s1.head
res18: Int = 1

scala> s1.tail
res19: scala.collection.mutable.Set[Int] = Set(5, 2, 6, 3, 7, 4, 8)

scala> s1.size
size   sizeHint   sizeHintBounded

scala> s1.size
res20: Int = 8

scala> s1.foreach(println)
1
5
2
6
3
7
4
8

scala> s1.isEmpty
res22: Boolean = false

scala> s1.contains(8)
res23: Boolean = true

scala> s1.contains(9)
res24: Boolean = false

scala> s1+=9
res25: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 7, 4, 8)

scala> for(s <- s1){
     | if(s > 0 && s%2==0)
     |   println("EVEN "+s)
     | else
     |   println("ODD "+s)
     | }
ODD 9
ODD 1
ODD 5
EVEN 2
EVEN 6
ODD 3
ODD 7
EVEN 4
EVEN 8

scala> var s2 = Set(10,20,30,40,50,60,70,80,90)
s2: scala.collection.mutable.Set[Int] = Set(30, 60, 70, 20, 50, 90, 10, 40, 80)

scala> s1.intersect(s2)
res27: scala.collection.mutable.Set[Int] = Set()

scala> val s3 = s1.union(s2)
s3: scala.collection.mutable.Set[Int] = Set(30, 9, 60, 1, 2, 3, 90, 10, 4, 40, 70, 5, 20, 50, 6, 7, 8, 80)

scala> s3.intersect(s1)
res28: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 7, 4, 8)

scala> s1.intersect(s3)
res29: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 7, 4, 8)

scala> s1
res30: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 7, 4, 8)

scala> s1.add(10)
res31: Boolean = true

scala> s1
res32: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 10, 7, 4, 8)

scala> s1.add(10)
res33: Boolean = false

scala> s1+=11
res34: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 10, 7, 4, 11, 8)

scala> s1+=11
res35: scala.collection.mutable.Set[Int] = Set(9, 1, 5, 2, 6, 3, 10, 7, 4, 11, 8)

scala> s1+=(12,15)
res36: scala.collection.mutable.Set[Int] = Set(15, 12, 9, 1, 5, 2, 6, 3, 10, 7, 4, 11, 8)

scala>

scala> import scala.collection.immutable._
import scala.collection.immutable._

scala> val set1 = HashSet(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
set1: scala.collection.immutable.HashSet[Int] = Set(5, 10, 1, 6, 9, 2, 7, 3, 8, 4)

scala> val set1 = ListSet(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4)
set1: scala.collection.immutable.ListSet[Int] = ListSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val set1 = ListSet(34,2,31,56,23,12,55,23,31)
set1: scala.collection.immutable.ListSet[Int] = ListSet(34, 2, 31, 56, 23, 12, 55)

scala> val set1 = TreeSet(34,2,31,56,23,12,55,23,31)
set1: scala.collection.immutable.TreeSet[Int] = TreeSet(2, 12, 23, 31, 34, 55, 56)

scala> val set1 = HashSet(1,2,3,4,5,6,7,8,5,9,10,6,1,2,4,null)
set1: scala.collection.immutable.HashSet[Any] = Set(null, 5, 10, 1, 6, 9, 2, 7, 3, 8, 4)

scala> val set1 = ListSet(34,2,31,56,23,12,55,23,31,null)
set1: scala.collection.immutable.ListSet[Any] = ListSet(34, 2, 31, 56, 23, 12, 55, null)

scala> val set1 = TreeSet(34,2,31,56,23,12,55,23,31,null)
<console>:14: error: No implicit Ordering defined for Any.
       val set1 = TreeSet(34,2,31,56,23,12,55,23,31,null)
     */
  }
}
