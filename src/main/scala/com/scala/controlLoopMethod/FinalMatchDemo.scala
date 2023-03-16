package com.scala.controlLoopMethod

object FinalMatchDemo {
  
  val x = List(1, 2, 3)
  val y = 1 :: 2 :: 3 :: Nil
  
  val fruits = "Apples" :: "Bananas" :: "Oranges" :: Nil
  
  
  def listToString(list: List[String]): String = list match {
    case s :: rest => s + " " + listToString(rest)
    case Nil => ""
}
  
  
  def listToStringPrint(list: List[String]): String = list match {
      case s :: rest => {
                          println(" S value "+s+" Rest is "+rest)
                          s + " " + listToStringPrint(rest)
                        }
    case Nil => ""
}
  
  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case n :: rest => n + sum(rest)
}

def multiply(list: List[Int]): Int = list match {
    case Nil => 1
    case n :: rest => n * multiply(rest)
}

    case class Person(firstName: String, lastName: String)
    case class Dog(name: String)

    // trigger the constant patterns
    println(echoWhatYouGaveMe(0))
    println(echoWhatYouGaveMe(true))
    println(echoWhatYouGaveMe("hello"))
    println(echoWhatYouGaveMe(Nil))

    // trigger the sequence patterns
    println(echoWhatYouGaveMe(List(0,1,2)))
    println(echoWhatYouGaveMe(List(1,2)))
    println(echoWhatYouGaveMe(List(1,2,3)))
    println(echoWhatYouGaveMe(Vector(1,2,3)))

    // trigger the tuple patterns
    println(echoWhatYouGaveMe((1,2)))         // two element tuple
    println(echoWhatYouGaveMe((1,2,3)))       // three element tuple

    // trigger the constructor patterns
    println(echoWhatYouGaveMe(Person("Melissa", "Alexander")))
    println(echoWhatYouGaveMe(Dog("Suka")))

    // trigger the typed patterns
    println(echoWhatYouGaveMe("Hello, world"))
    println(echoWhatYouGaveMe(42))
    println(echoWhatYouGaveMe(42F))
    println(echoWhatYouGaveMe(Array(1,2,3)))
    println(echoWhatYouGaveMe(Array("coffee", "apple pie")))
    println(echoWhatYouGaveMe(Dog("Fido")))
    println(echoWhatYouGaveMe(List("apple", "banana")))
    println(echoWhatYouGaveMe(Map(1->"Al", 2->"Alexander")))

    // trigger the wildcard pattern
    println(echoWhatYouGaveMe("33d"))


  def main(args: Array[String]): Unit = {
    val fruits = "Apples" :: "Bananas" :: "Oranges" :: Nil
    listToString(fruits)
    val nums = List(1,2,3,4,5)
    sum(nums)
    multiply(nums)
    
    var i =10
    
    i match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case c if 20 to 29 contains c => println("20-29 range: " + c)
    case _ => println("Hmmm...")
}

    println("*************************************************")

   var num =1 
    num match {
    case x if x == 1 => println("one, a lonely number")
    case x if (x == 2 || x == 3) => println(x)
    case _ => println("some other value")
}
  /* var stock = "XYZ"
    stock match {
    case x if (x.symbol == "XYZ" && x.price < 20) => buy(x)
    case x if (x.symbol == "XYZ" && x.price > 50) => sell(x)
    case _ => // do nothing
}*/
    
  }
    
   /* case class Person1(firstName: String)

  def speak(p: Person) = p match {
    case Person1(name) if name == "Fred" => println("Yubba dubba doo")
    case Person1(name) if name == "Bam Bam" => println("Bam bam!")
    case _ => println("Watch the Flintstones!")
}*/
 
  def echoWhatYouGaveMe(x: Any): String = x match {

    // constant patterns
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said 'hello'"
    case Nil => "an empty List"

    // sequence patterns
    case List(0, _, _) => "a three-element list with 0 as the first element"
    case List(1, _*) => "a list beginning with 1, having any number of elements"
    case Vector(1, _*) => "a vector starting with 1, having any number of elements"

    // tuples
    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, and $c"

    // constructor patterns
    case Person(first, "Alexander") => s"found an Alexander, first name = $first"
    case Dog("Suka") => "found a dog named Suka"

    // typed patterns
    case s: String => s"you gave me this string: $s"
    case i: Int => s"thanks for the int: $i"
    case f: Float => s"thanks for the float: $f"
    case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
    case as: Array[String] => s"an array of strings: ${as.mkString(",")}"
    case d: Dog => s"dog: ${d.name}"
    case list: List[_] => s"thanks for the List: $list"
    case m: Map[_, _] => m.toString

    // the default wildcard pattern
    case _ => "Unknown"
}
  
}