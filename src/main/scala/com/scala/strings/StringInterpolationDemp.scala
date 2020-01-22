package com.scala.strings

class Book(val bookName:String,val author:String){ 
  def disp():String ={
    "bookName = "+bookName+" author name is "+author;
  }
}

object StringInterpolationDemp {
  def main(args: Array[String]): Unit = {
    
    //variable interpolation
    
    var x = 100;
    var y = 200;
    
    val str = "scala"

    // x value is 100 and y value is 200 x+y is 300

    println("X and Y values are "+x+y)

    println("X value is "+x+" and y value is "+y+" x+y is "+x+y)
    //val test = "X value is "+x+" and y value is "+y+" x+y is "+x+y;
    
    println("x value is $x and y value is $y x+y is ${x+y}")

    val test = s"x value is $x and y value is $y x+y is ${x+y}"
    
    println(s"x value is $x and y value is $y x+y is ${x+y}")
    
    //object interpolation
    
    var book1 = new Book("scala cook book","alex")
    var book2 = new Book("learning spark","XXXXXX")
    
    println(s"book name is ${book1.bookName} and author is ${book1.author}" )
    
    //method call from string
    
    println(s"${book1.disp()}")
   
  // f type string interpolation
   
   val bookPrice = 100.5;
    println(s"the price of book is $bookPrice%.2f") 
    
    println(f"the price of book is $bookPrice%.4f") 
    
    // raw type 
    
    val book = "Scala Cook Book";
    val author = "alex";
    val price = 1000
    
    println(s"Book details:\n name: $book \t author: $author \t price:$price")
    
    println(f"Book details:\n name: $book \t author: $author \t price:$price%.2f")

   println(raw"Book details:\n name: $book \t author: $author \t "+ f" price:$price%.2f")
   println("Book details:\n name: $book \t author: $author \t price:$price")


  }
}