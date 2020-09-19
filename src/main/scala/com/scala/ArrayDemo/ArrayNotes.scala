package com.scala.ArrayDemo

class ArrayNotes {
/*
===Different ways to create and update an Array in Scala=
Solution
There are many different ways to define and populate an Array. You can create an array with initial values, in which case Scala can determine the array type implicitly:

scala> val a = Array(1,2,3)
a: Array[Int] = Array(1, 2, 3)

scala> val fruits = Array("Apple", "Banana", "Orange")
fruits: Array[String] = Array(Apple, Banana, Orange)
If you don’t like the type Scala determines, you can assign it manually:

// scala makes this Array[Double]
scala> val x = Array(1, 2.0, 33D, 400L)
x: Array[Double] = Array(1.0, 2.0, 33.0, 400.0)

// manually override the type
scala> val x = Array[Number](1, 2.0, 33D, 400L)
x: Array[java.lang.Number] = Array(1, 2.0, 33.0, 400)
You can define an array with an initial size and type, and then populate it later:

// create an array with an initial size
val fruits = new Array[String](3)

// somewhere later in the code ...
fruits(0) = "Apple"
fruits(1) = "Banana"
fruits(2) = "Orange"
You can create a var reference to an array in a class, and then assign it later:

// this uses a null. don't do this in the real world
var fruits: Array[String] = _

// later ...
fruits = Array("apple", "banana")
The following examples show a handful of other ways to create and populate an Array:

scala> val x = Array.range(1, 10)
x: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val x = Array.range(0, 10, 2)
x: Array[Int] = Array(0, 2, 4, 6, 8)

scala> val x = Array.fill(3)("foo")
x: Array[String] = Array(foo, foo, foo)

scala> val x = Array.tabulate(5)(n => n * n)
x: Array[Int] = Array(0, 1, 4, 9, 16)

scala> val x = List(1, 2, 3).toArray
x: Array[Int] = Array(1, 2, 3)

scala> "Hello".toArray
res0: Array[Char] = Array(H, e, l, l, o)
Discussion
The Scala Array is an interesting creature: It’s mutable in that its elements can be changed, but it’s immutable in that its size cannot be changed. The first link in the See Also section provides this information about the Array:

“Scala arrays correspond one-to-one to Java arrays. That is, a Scala array Array[Int] is represented as a Java int[], an Array[Double] is represented as a Java double[] and an Array[String] is represented as a Java String[].”

The Array is an indexed sequential collection, so accessing and changing values by their index position is straightforward and fast. Once you’ve created an Array, access its elements by enclosing the desired element number in parentheses:

scala> val a = Array(1, 2, 3)
a: Array[Int] = Array(1, 2, 3)

scala> a(0)
res0: Int = 1
Just as you access an array element by index, you update elements in a similar way:

scala> a(0) = 10

scala> a(1) = 20

scala> a(2) = 30

scala> a
res1: Array[Int] = Array(10, 20, 30)

========= How to create an Array whose size can change (ArrayBuffer) ========

Problem
You want to create an array whose size can change, i.e., a completely mutable array.

Solution
An Array is mutable in that its elements can change, but its size can’t change. To create a mutable, indexed sequence whose size can change, use the ArrayBuffer class.

To use an ArrayBuffer, import it into scope and then create an instance. You can declare an ArrayBuffer without initial elements, and then add them later:

import scala.collection.mutable.ArrayBuffer

var characters = ArrayBuffer[String]()
characters += "Ben"
characters += "Jerry"
characters += "Dale"
You can add elements when you create the ArrayBuffer, and continue to add elements later:

// initialize with elements
val characters = collection.mutable.ArrayBuffer("Ben", "Jerry")

// add one element
characters += "Dale"

// add two or more elements (method has a varargs parameter)
characters += ("Gordon", "Harry")

// add multiple elements with any TraversableOnce type
characters ++= Seq("Andy", "Big Ed")

// append one or more elements (uses a varargs parameter)
characters.append("Laura", "Lucy")
Those are the most common ways to add elements to an ArrayBuffer (and other mutable sequences). The next recipe demonstrates methods to delete ArrayBuffer elements.



====== How to delete Array and ArrayBuffer elements in Scala =========

Problem
You want to delete elements from an Array or ArrayBuffer.

Solution
An ArrayBuffer is a mutable sequence, so you can delete elements with the usual -=, --=, remove, and clear methods.

You can remove one or more elements with -=:

import scala.collection.mutable.ArrayBuffer

val x = ArrayBuffer('a', 'b', 'c', 'd', 'e')

// remove one element
x -= 'a'

// remove multiple elements (methods defines a varargs param)
x -= ('b', 'c')
Use --= to remove multiple elements that are declared in another collection (any collection that extends TraversableOnce):

val x = ArrayBuffer('a', 'b', 'c', 'd', 'e')
x --= Seq('a', 'b')
x --= Array('c')
x --= Set('d')
Use the remove method to delete one element by its position in the ArrayBuffer, or a series of elements beginning at a starting position:

scala> val x = ArrayBuffer('a', 'b', 'c', 'd', 'e', 'f')
x: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(a, b, c, d, e, f)

scala> x.remove(0)
res0: Char = a

scala> x
res1: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(b, c, d, e, f)

scala> x.remove(1, 3)

scala> x
res2: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(b, f)
In these examples, the collection that contains the elements to be removed can be any collection that extends TraversableOnce, so removeThese can be a Seq, Array, Vector, and many other types that extend TraversableOnce.

The clear method removes all the elements from an ArrayBuffer:

scala> var a = ArrayBuffer(1,2,3,4,5)
a: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)

scala> a.clear

scala> a
res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
You can also use the usual Scala filtering methods (drop, filter, take, etc.) to filter elements out of a collection; just remember to assign the result to a new variable.

Array
The size of an Array can’t be changed, so you can’t directly delete elements. You can reassign the elements in an Array, which has the effect of replacing them:

scala> val a = Array("apple", "banana", "cherry")
a: Array[String] = Array(apple, banana, cherry)

scala> a(0) = ""

scala> a(1) = null

scala> a
res0: Array[String] = Array("", null, cherry)
You can also filter elements out of one array while you assign the result to a new array:

scala> val a = Array("apple", "banana", "cherry")
a: Array[String] = Array(apple, banana, cherry)

scala> val b = a.filter(! _.contains("apple"))
b: Array[String] = Array(banana, cherry)
Use other filtering methods (drop, slice, take, etc.) in the same way.

If you define the array variable as a var, you can assign the result back to itself, which gives the appearance of deleting elements using filtering:

scala> var a = Array("apple", "banana", "cherry")
a: Array[String] = Array(apple, banana, cherry)

scala> a = a.take(2)
a: Array[String] = [LString;@e41a882

scala> a
res0: Array[String] = Array(apple, banana)


====How to sort Arrays in Scala======
Problem
You want to sort the elements in an Array (or ArrayBuffer).

Solution
If you’re working with an Array that holds elements that have an implicit Ordering, you can sort the Array in place using the scala.util.Sorting.quickSort method. For example, because the String class has an implicit Ordering, it can be used with quickSort:

scala> val fruits = Array("cherry", "apple", "banana")
fruits: Array[String] = Array(cherry, apple, banana)

scala> scala.util.Sorting.quickSort(fruits)

scala> fruits
res0: Array[String] = Array(apple, banana, cherry)
Notice that quickSort sorts the Array in place; there’s no need to assign the result to a new variable.

This example works because the String class (via StringOps) has an implicit Ordering. Sorting.quickSort can also sort arrays with the base numeric types like Double, Float, and Int, because they also have an implicit Ordering.

Other solutions
If the type an Array is holding doesn’t have an implicit Ordering, you can either modify it to mix in the Ordered trait (which gives it an implicit Ordering), or sort it using the sorted, sortWith, or sortBy methods. These approaches are shown in Recipe 10.29.

Also, there are no unique sorting approaches for an ArrayBuffer, so see Recipe 10.29 for an example of how to sort it as well.

See Also
The Scaladoc for the Ordered and Ordering traits is very good. The header information in both documents shows good examples of the approaches shown in this recipe and Recipe 10.29.

The Sorting object
The Ordering trait
The Ordered trait

======== How to sort Scala collections classes (sortWith, sorted, Ordered, Ordering) ===========

Problem
You want to sort a sequential collection. Or, you want to implement the Ordered trait in a custom class so you can use the sorted method, or operators like <, <=, >, and >= to compare instances of your class.

Solution
See Recipe 11.10, “Sorting Arrays”, for information on how to sort an Array. Otherwise, use the sorted or sortWith methods to sort a collection.

The sorted method can sort collections with type Double, Float, Int, and any other type that has an implicit scala.math.Ordering:

scala> val a = List(10, 5, 8, 1, 7).sorted
a: List[Int] = List(1, 5, 7, 8, 10)

scala> val b = List("banana", "pear", "apple", "orange").sorted
b: List[String] = List(apple, banana, orange, pear)
The “rich” versions of the numeric classes (like RichInt) and the StringOps class all extend the Ordered trait, so they can be used with the sorted method. (More on the Ordered trait in the Discussion.)

The sortWith method lets you provide your own sorting function. The following examples demonstrate how to sort a collection of Int or String in both directions:

scala> List(10, 5, 8, 1, 7).sortWith(_ < _)
res1: List[Int] = List(1, 5, 7, 8, 10)

scala> List(10, 5, 8, 1, 7).sortWith(_ > _)
res2: List[Int] = List(10, 8, 7, 5, 1)

scala> List("banana", "pear", "apple", "orange").sortWith(_ < _)
res3: List[java.lang.String] = List(apple, banana, orange, pear)

scala> List("banana", "pear", "apple", "orange").sortWith(_ > _)
res4: List[java.lang.String] = List(pear, orange, banana, apple)
Your sorting function can be as complicated as it needs to be. For example, you can access methods on the elements during the sort, such as the following example, which sorts a list of strings by the string length:

scala> List("banana", "pear", "apple", "orange").sortWith(_.length < _.length)
res5: List[java.lang.String] = List(pear, apple, banana, orange)

scala> List("banana", "pear", "apple", "orange").sortWith(_.length > _.length)
res6: List[java.lang.String] = List(banana, orange, apple, pear)
In the same way the length method is called on a String, you can call a method on any class you want to sort. If your sorting method gets longer, first declare it as a method:

def sortByLength(s1: String, s2: String) = {
    println("comparing %s and %s".format(s1, s2))
    s1.length > s2.length
}
Then use it by passing it into the sortWith method:

scala> List("banana", "pear", "apple").sortWith(sortByLength)
comparing banana and pear
comparing pear and apple
comparing apple and pear
comparing banana and apple
res0: List[String] = List(banana, apple, pear)
Discussion
If the type a sequence is holding doesn’t have an implicit Ordering, you won’t be able to sort it with sorted. For instance, given this basic class:

class Person (var name: String) {
    override def toString = name
}
create a List[Person]:

val ty = new Person("Tyler")
val al = new Person("Al")
val paul = new Person("Paul")
val dudes = List(ty, al, paul)
If you try to sort this list in the REPL, you’ll see an error stating that the Person class doesn’t have an implicit Ordering:

scala> dudes.sorted
<console>:13: error: No implicit Ordering defined for Person.
              dudes.sorted
                    ^
You can’t use sorted with the Person class as it’s written, but you can write a simple anonymous function to sort the Person elements by the name field using sortWith:

scala> val sortedDudes = dudes.sortWith(_.name < _.name)
sortedDudes: Array[Person] = Array(Al, Paul, Tyler)

scala> val sortedDudes = dudes.sortWith(_.name > _.name)
sortedDudes: Array[Person] = Array(Tyler, Paul, Al)
Mix in the Ordered trait
If you’d rather use the Person class with the sorted method, just mix the Ordered trait into the Person class, and implement a compare method. This technique is shown in the following code:

class Person (var name: String) extends Ordered [Person] {
    override def toString = name

    // return 0 if the same, negative if this < that, positive if this > that
    def compare (that: Person) = {
        if (this.name == that.name)
            0
        else if (this.name > that.name)
            1
        else
            −1
    }
}
This new Person class can be used with sorted. The compare method is what provides the sorting capability. As shown in the comment, compare should work like this:

Return 0 if the two objects are the same (equal, typically using the equals method of your class)
Return a negative value if this is less than that
Return a positive value if this is greater than that
How you determine whether one instance is greater than another instance is entirely up to your compare algorithm.

Note that because this compare algorithm only compares two String values, it could have been written like this:

def compare (that: Person) = this.name.compare(that.name)
However, I wrote it as shown in the first example to be clear about the approach.

An added benefit of mixing the Ordered trait into your class is that it also lets you compare object instances directly in your code:

if (al > ty) println("Al") else println("Tyler")
This works because the Ordered trait implements the <=, <, >, and >= methods, and calls your compare method to make those comparisons.


========= How to create multidimensional arrays in Scala =========

Problem
You need to create a multidimensional array, i.e., an array with two or more dimensions.

Solution
There are two main solutions:

Use Array.ofDim to create a multidimensional array. You can use this approach to create arrays of up to five dimensions. With this approach you need to know the number of rows and columns at creation time.
Create arrays of arrays as needed.
Both approaches are shown in this solution.

Using Array.ofDim
Use the Array.ofDim method to create the array you need:

scala> val rows = 2
rows: Int = 2

scala> val cols = 3
cols: Int = 3

scala> val a = Array.ofDim[String](rows, cols)
a: Array[Array[String]] = Array(Array(null, null, null), Array(null, null, null))
After declaring the array, add elements to it:

a(0)(0) = "a"
a(0)(1) = "b"
a(0)(2) = "c"
a(1)(0) = "d"
a(1)(1) = "e"
a(1)(2) = "f"
Access the elements using parentheses, similar to a one-dimensional array:

scala> val x = a(0)(0)
x: String = a
Iterate over the array with a for loop:

scala> for {
     |   i <- 0 until rows
     |   j <- 0 until cols
     | } println(s"($i)($j) = ${a(i)(j)}")
(0)(0) = a
(0)(1) = b
(0)(2) = c
(1)(0) = d
(1)(1) = e
(1)(2) = f
To create an array with more dimensions, just follow that same pattern. Here’s the code for a three-dimensional array:

val x, y, z = 10
val a = Array.ofDim[Int](x,y,z)
for {
  i <- 0 until x
  j <- 0 until y
  k <- 0 until z
} println(s"($i)($j)($k) = ${a(i)(j)(k)}")
Using an array of arrays
Another approach is to create an array whose elements are arrays:

scala> val a = Array( Array("a", "b", "c"), Array("d", "e", "f") )
a: Array[Array[String]] = Array(Array(a, b, c), Array(d, e, f))

scala> a(0)
res0: Array[String] = Array(a, b, c)

scala> a(0)(0)
res1: String = a
This gives you more control of the process, and lets you create “ragged” arrays (where each contained array may be a different size):

scala> val a = Array(Array("a", "b", "c"), Array("d", "e"))
a: Array[Array[String]] = Array(Array(a, b, c), Array(d, e))
You can declare your variable as a var and create the same array in multiple steps:

scala> var arr = Array(Array("a", "b", "c"))
arr: Array[Array[String]] = Array(Array(a, b, c))

scala> arr ++= Array(Array("d", "e"))

scala> arr
res0: Array[Array[String]] = Array(Array(a, b, c), Array(d, e))
Note in this example that the variable arr was created as a var, which lets you assign the output from the ++= operator back to it. This gives the illusion that you’ve modified the contents of arr, but in reality, you’ve modified arr’s reference so it points at a new collection. (See Recipe 10.6, “Understanding Mutable Variables with Immutable Collections” for more information.)

Discussion
Decompiling the Array.ofDim solution helps to understand how this works behind the scenes. Create the following Scala class in a file named Test.scala:

class Test {
    val arr = Array.ofDim[String](2, 3)
}
If you compile that class with scalac, and then decompile it with a tool like JAD, you can see the Java code that’s created:

private final String arr[][];
Similarly, creating a Scala three-dimensional Array like this:

val arr = Array.ofDim[String](2, 2, 2)
results in a Java array like this:

private final String arr[][][];
As you might expect, the code generated by using the “array of arrays” approach is more complicated. This is a case where using a decompiler can help you understand how Scala works, i.e., what code it generates for you.

Finally, the Array.ofDim approach is unique to the Array class; there is no ofDim method on a List, Vector, ArrayBuffer, etc. But the “array of arrays” solution is not unique to the Array class. You can have a “list of lists,” “vector of vectors,” and so on.

===============How to pass Scala arrays back and forth with Java methods ========

Problem
You want to pass an array back and forth between your Scala and Java methods.

Solution
The first link in the See Also section states, “Scala arrays correspond one-to-one to Java arrays,” and as a result of this, passing arrays back and forth between Java and Scala code is easier than the example shown in Recipe 17.1, “Going to and from Java Collections”.

For instance, if you have a Java class with methods that return an int[] or String[], like these:

// java
package javaarrays;
public class Test {
    public static int[] getNumbers() {
        int[] x = {1, 2, 3};
        return x;
    }
    public static String[] getStrings() {
        String[] x = {"a", "b", "c"};
        return x;
    }
}
you can call them directly from your Scala application:

package javaarrays
object ArrayTest extends App {
    Test.getNumbers.foreach(println)
    Test.getStrings.foreach(println)
}
If you look at the types in your Scala code, you can see how Scala sees them:

println(Test.getNumbers.getCanonicalName)
// int[]

println(Test.getStrings.getClass.getCanonicalName)
// String[]
You can also access a Scala Array from a Java application. Given this Scala code that builds a method named getFriends:

package javaarrays
object ArrayTest {
    // create one Person
    val fred = Person("Fred")
    val fredsFriends = Array(Person("Barney"), Person("Betty"), Person("Wilma"))
    fred.friends = fredsFriends

    // create a second Person
    val barney = Person("Barney")
    val barneysFriends = Array(Person("Betty"), Person("Fred"), Person("Wilma"))
    barney.friends = barneysFriends

    // return the two Person instances when called
    def getFriends = Array(fred, barney)
}

case class Person(name: String) {
  var friends = Array[Person]()
  override def toString = s"$name (${friends.mkString(",")})"
}
you can use the following Java class to call the getPerson method and print out the Person instances:

package javaarrays;

public class GetScalaArrays {
    public static void main(String[] args) {
        Person[] peeps = ArrayTest.getFriends();
        for (Person p: peeps) {
            System.out.println(p);
        }
    }
}
As long as you’re working with an Array on the Scala side and treating it as an array of objects in Java, this works fine.

Discussion
In the book, Programming in Scala, the authors discuss an unusual situation that can happen with legacy Java code. One approach to having an array of objects in Java where each object was a subtype of some supertype was to define the array as Object[]. This is shown in the following Java code, where the method printObjectArray expects an array of Object:

// java
package javaarrays2;
public class AJavaClass {
    public static void printObjectArray(Object[] objects) {
      for (Object o: objects) {
          System.out.println(o);
      }
    }
}
Attempting to call this Java method from Scala with an array of type Any will not work:

val objects = Array("a", 1)
AJavaClass.printObjectArray(objects)  // will not compile
For that matter, an array of String also won’t work:

val objects = Array("a", "b")
AJavaClass.printObjectArray(objects)  // will not compile
The solution to this problem is to cast your Scala array to an Array[Object], as shown here:

// this works
val objects = Array("a", 1)
val arrayOfObject = objects.asInstanceOf[Array[Object]]
AJavaClass.printObjectArray(arrayOfObject)
See Also
A discussion of the Array class, including how it’s a “special kind of collection”
Recipe 17.1, “Going to and from Java Collections” discusses how to convert many types of collections when interacting with Java code
 */
}
