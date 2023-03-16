package com.scala.controlLoopMethod



object ExameTest {
 /* def mean(numbers: Array[Int], weights: Array[Int]): Double = {
    var total = 0
    var totalWeights = 0
    val numRegEx="""\d+""".r

    for(i <- numbers.indices) {
      numbers(i) match{
        case numRegEx(numbers(i)) | numRegEx(weights(i))  =>{
          total += numbers(i) * weights(i)
          totalWeights += weights(i)
        }
        case _ => throw new NumberFormatException()
      }

    }
    total / totalWeights

  }

  def main(args: Array[String]) = {
    // Example case
    val a: Array[Int] = Array(3, 6)
    val b: Array[Int] = Array(4, 2)
    println(ExameTest.mean(a,b))
  }*/

 /* def prefixes(words: List[String], length: Int): List[String] = {
    var lB = scala.collection.mutable.ListBuffer()
    if(!words.isEmpty){
      for(s <- words){
        // println(s)
        if(s.length()>length)
          lB :+ s.substring(0,length)
        else{
          lB :+ s
        }

      }
      lB.foreach(println)
    }
    else
      throw new UnsupportedOperationException("Waiting to be implemented.")
    lB.toList
  }

  def main(args: Array[String]): Unit = {
    val words = "many" :: "manly" :: "men" :: "maybe" :: "my" :: Nil
    // words.foreach(println)
    ExameTest.prefixes(words, 3).foreach(println)
  }*/

  class PlayerInventory {
    private var items: Vector[String] = Vector("lumber", "stone", "magic potion")

    def getItems(): Vector[String] = {
      items
    }

    def addToInventory(item: String): Unit = {
      items :+ item
    }

    def dropFromInventory(item: String): Unit = {
      items.drop(items.indexOf(item))
    }
  }

  object PlayerInventory {
    def main(args: Array[String]) = {
      var p: PlayerInventory = new PlayerInventory

      p.addToInventory("lumber")
      p.dropFromInventory("stone")

      println(p.getItems())
    }
  }
}

class ExameTest