package com.scala.recursion

import scala.annotation.tailrec

object SumList {
  def main(args: Array[String]): Unit = {
val list = List(1,2,3,4,5)
    println(sum(list))
  }
  def sum(xs: List[Int]): Int = {
    xs match {
      case x :: tail => x + sum(tail) // if there is an element, add it to the sum of the tail
      case Nil => 0 // if there are no elements, then the sum is 0
    }
  }

  def sum2(xs: List[Int]): Int = {
    @tailrec
    def inner(xs: List[Int], accum: Int): Int = {
      xs match {
        case x :: tail => inner(tail, accum + x)
        case Nil => accum
      }
    }
    inner(xs, 0)
  }
}
