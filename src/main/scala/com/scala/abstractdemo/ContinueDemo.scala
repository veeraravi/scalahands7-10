package com.scala.abstractdemo

import util.control.Breaks._
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
              breakable {
                  if (i % 2 == 0) break
                  println(i)
              }
          }
  }
  
}