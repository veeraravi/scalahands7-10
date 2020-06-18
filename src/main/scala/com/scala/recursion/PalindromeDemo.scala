package com.scala.recursion

object PalindromeDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(isPalindrome(list))
  }
  def isPalindrome(l: List[Int]):Boolean = l match {
    case Nil => true
    case List(a) => true
    case list => (list.head == list.last && isPalindrome(list.tail.init))
  }

  def isPalindrome2(l: List[Int]):Boolean = {
    def palindrome(res: Boolean, rem: List[Int]): Boolean = rem match {
      case Nil => res
      case List(a) => res
      case list => palindrome(res && rem.head == rem.last, rem.tail.init)
    }
    palindrome(true, l)
  }

}
