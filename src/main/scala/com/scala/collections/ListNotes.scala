package com.scala.collections

class ListNotes {
/*
======== Different ways to create or populate list in scala ====
There are many ways to create and initially populate a List:

// 1
scala> val list = 1 :: 2 :: 3 :: Nil
list: List[Int] = List(1, 2, 3)

// 2
scala> val list = List(1, 2, 3)
x: List[Int] = List(1, 2, 3)

// 3a
scala> val x = List(1, 2.0, 33D, 4000L)
x: List[Double] = List(1.0, 2.0, 33.0, 4000.0)

// 3b
scala> val x = List[Number](1, 2.0, 33D, 4000L)
x: List[java.lang.Number] = List(1, 2.0, 33.0, 4000)

// 4
scala> val x = List.range(1, 10)
x: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val x = List.range(0, 10, 2)
x: List[Int] = List(0, 2, 4, 6, 8)

// 5
scala> val x = List.fill(3)("foo")
x: List[String] = List(foo, foo, foo)

// 6
scala> val x = List.tabulate(5)(n => n * n)
x: List[Int] = List(0, 1, 4, 9, 16)

// 7
scala> val x = collection.mutable.ListBuffer(1, 2, 3).toList
x: List[Int] = List(1, 2, 3)

// 8
scala> "foo".toList
res0: List[Char] = List(f, o, o)
The first two approaches shown are the most common and straightforward ways to create a List. Examples 3a and 3b show how you can manually control the List type when your collection has mixed types. When the type isn’t manually set in Example 3a, it ends up as a List[Double], and in 3b it’s manually set to be a List[Number].

Examples 4 through 6 show different ways to create and populate a List with data.

Examples 7 and 8 show that many collection types also have a toList method that converts their data to a List.

Going back to the first example, it shows the :: method for creating a List, which will be new to Java developers. As shown, the :: method (called “cons”) takes two arguments: a head element, which is a single element, and a tail, which is another List. When a List is constructed like this, it must end with a Nil element.

It’s important to know that the Scala List class is not like Java List classes, such as the Java ArrayList. For example, Recipe 17.1, “Going to and from Java Collections” shows that a java.util.List converts to a Scala Buffer or Seq, not a Scala List.

The following quote from the Scala List Scaladoc discusses the important properties of the List class:

“This class is optimal for last-in-first-out (LIFO), stack-like access patterns. If you need another access pattern, for example, random access or FIFO, consider using a collection more suited to this than List. List has O(1) prepend and head/tail access. Most other operations are O(n) on the number of elements in the list.”


========== How to create a mutable List in Scala (ListBuffer)


Problem
You want to use a mutable list — a LinearSeq, as opposed to an IndexedSeq — but a Scala List isn’t mutable.

Solution
Use the Scala ListBuffer class, and convert the ListBuffer to a List when needed. The following examples demonstrate how to create a ListBuffer, and then add and remove elements, and then convert it to a List when finished:

import scala.collection.mutable.ListBuffer

var fruits = new ListBuffer[String]()

// add one element at a time to the ListBuffer
fruits += "Apple"
fruits += "Banana"
fruits += "Orange"

// add multiple elements
fruits += ("Strawberry", "Kiwi", "Pineapple")

// remove one element
fruits -= "Apple"

// remove multiple elements
fruits -= ("Banana", "Orange")

// remove multiple elements specified by another sequence
fruits --= Seq("Kiwi", "Pineapple")

// convert the ListBuffer to a List when you need to
val fruitsList = fruits.toList
Discussion
Because a List is immutable, if you need to create a list that is constantly changing, the preferred approach is to use a ListBuffer while the list is being modified, then convert it to a List when a List is needed.

The ListBuffer Scaladoc states that a ListBuffer is “a Buffer implementation backed by a list. It provides constant time prepend and append. Most other operations are linear.” So, don’t use ListBuffer if you want to access elements arbitrarily, such as accessing items by index (like list(10000)); use ArrayBuffer instead. See Recipe 10.4, “Understanding the Performance of Collections” for more information.

Although you can’t modify the elements in a List, you can create a new List from an existing one, typically prepending items to the original list with the :: method:

scala> val x = List(2)
x: List[Int] = List(2)

scala> val y = 1 :: x
y: List[Int] = List(1, 2)

scala> val z = 0 :: y
z: List[Int] = List(0, 1, 2)

============= How to add elements to a List in Scala ======
“How do I add elements to a List?” is a bit of a trick question, because a List is immutable, so you can’t actually add elements to it. If you want a List that is constantly changing, use a ListBuffer (as described in Recipe 11.2), and then convert it to a List when necessary.

To work with a List, the general approach is to prepend items to the list with the :: method while assigning the results to a new List:

scala> val x = List(2)
x: List[Int] = List(2)

scala> val y = 1 :: x
y: List[Int] = List(1, 2)

scala> val z = 0 :: y
z: List[Int] = List(0, 1, 2)
Rather than continually reassigning the result of this operation to a new variable, you can declare your variable as a var, and reassign the result to it:

scala> var x = List(2)
x: List[Int] = List(2)

scala> x = 1 :: x
x: List[Int] = List(1, 2)

scala> x = 0 :: x
x: List[Int] = List(0, 1, 2)
As these examples illustrate, the :: method is right-associative; lists are constructed from right to left, which you can see in this example:

scala> val list1 = 3 :: Nil
list1: List[Int] = List(3)

scala> val list2 = 2 :: list1
list2: List[Int] = List(2, 3)

scala> val list3 = 1 :: list2
list3: List[Int] = List(1, 2, 3)
Any Scala method that ends with a : character is evaluated from right to left. This means that the method is invoked on the right operand. You can see how this works by analyzing the following code, where both methods print the number 42:

object RightAssociativeExample extends App {
    val f1 = new Printer
    f1 >> 42
    42 >>: f1
}

class Printer {
    def >>(i: Int) { println(s"$i") }
    def >>:(i: Int) { println(s"$i") }
}
The two methods can also be invoked like this:

f1.>>(42)
f1.>>:(42)
but by defining the second method to end in a colon, it can be used as a right-associative operator.

Though using :: is very common, there are additional methods that let you prepend or append single elements to a List:

scala> val x = List(1)
x: List[Int] = List(1)

scala> val y = 0 +: x
y: List[Int] = List(0, 1)

scala> val y = x :+ 2
y: List[Int] = List(1, 2)
You can also merge lists to create a new list. See Recipe 11.5 for examples.

Discussion
If you’re not comfortable using a List, but want to use a mutable, linear list, see Recipe 11.2, “Creating a Mutable List” for examples of how to use the ListBuffer class.

The ListBuffer is a mutable, linear sequence (as opposed to an indexed sequence, like an Array or ArrayBuffer), and is similar to working with a StringBuffer or StringBuilder in Java. Just as you’d convert those classes to a String when needed, you convert a ListBuffer to a List when needed. Programmers from other backgrounds may be more comfortable with the :: approach. A nice benefit of Scala is that it offers both options.

======== How to delete elements from a List (or ListBuffer) in Scala ==========

Solution
A List is immutable, so you can’t delete elements from it, but you can filter out the elements you don’t want while you assign the result to a new variable:

scala> val originalList = List(5, 1, 4, 3, 2)
originalList: List[Int] = List(5, 1, 4, 3, 2)

scala> val newList = originalList.filter(_ > 2)
newList: List[Int] = List(5, 4, 3)
Rather than continually assigning the result of operations like this to a new variable, you can declare your variable as a var and reassign the result of the operation back to itself:

scala> var x = List(5, 1, 4, 3, 2)
x: List[Int] = List(5, 1, 4, 3, 2)

scala> x = x.filter(_ > 2)
x: List[Int] = List(5, 4, 3)
See Chapter 10 for other ways to get subsets of a collection using methods like filter, partition, splitAt, take, and more.

ListBuffer
If you’re going to be modifying a list frequently, it may be better to use a ListBuffer instead of a List. A ListBuffer is mutable, so you can remove items from it using all the methods for mutable sequences shown in Chapter 10. For example, assuming you’ve created a ListBuffer like this:

import scala.collection.mutable.ListBuffer
val x = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
You can delete one element at a time, by value:

scala> x -= 5
res0: x.type = ListBuffer(1, 2, 3, 4, 6, 7, 8, 9)
You can delete two or more elements at once:

scala> x -= (2, 3)
res1: x.type = ListBuffer(1, 4, 6, 7, 8, 9)
That method looks like it takes a tuple, but it’s actually defined to take two parameters and a third varargs field.

You can delete elements by position:

scala> x.remove(0)
res2: Int = 1

scala> x
res3: scala.collection.mutable.ListBuffer[Int] = ListBuffer(4, 6, 7, 8, 9)
You can use remove to delete from a given starting position and provide the number of elements to delete:

scala> x.remove(1, 3)

scala> x
res4: scala.collection.mutable.ListBuffer[Int] = ListBuffer(4, 9)
You can also use --= to delete multiple elements that are specified in another collection:

scala> val x = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
x: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> x --= Seq(1,2,3)
res0: x.type = ListBuffer(4, 5, 6, 7, 8, 9)
Discussion
When you first start using Scala, the wealth of methods whose names are only symbols (+:, /:, :::, etc.) can seem daunting, but the -= and --= methods are used consistently across mutable collections, so it quickly becomes second nature to use them.

=========== How to merge (concatenate) Lists in Scala ==========

Solution
Merge two lists using the ++, concat, or ::: methods. Given these two lists:

scala> val a = List(1,2,3)
a: List[Int] = List(1, 2, 3)

scala> val b = List(4,5,6)
b: List[Int] = List(4, 5, 6)
you can use the ++ method as shown in the following example. It’s used consistently across immutable collections, so it’s easy to remember:

scala> val c = a ++ b
c: List[Int] = List(1, 2, 3, 4, 5, 6)
If you work with the List class frequently, you may prefer using ::: as a way to create a new list from two existing lists:

scala> val c = a ::: b
c: List[Int] = List(1, 2, 3, 4, 5, 6)
The concat method on the List object also works:

scala> val c = List.concat(a, b)
c: List[Int] = List(1, 2, 3, 4, 5, 6)
Discussion
Perhaps because I come from a Java background, I don’t work with the List class too often, so I can’t remember some of its custom methods without looking at its Scaladoc. As a result, I prefer the ++ method, because it’s consistently used across immutable collections.

However, keep in mind what the List class is good at. As its Scaladoc states, “This class is optimal for last-in-first-out (LIFO), stack-like access patterns. If you need another access pattern, for example, random access or FIFO, consider using a collection more suited to this than List.” See Recipe 10.4, “Understanding the Performance of Collections” for a discussion of List class performance.



============ How to use the Scala Stream class, a lazy version of List ========

Problem
You want to use a collection that works like a List but invokes its transformer methods (map, filter, etc.) lazily.

Solution
A Scala Stream is like a List, except that its elements are computed lazily, in a manner similar to how a view creates a lazy version of a collection. Because Stream elements are computed lazily, a Stream can be long ... infinitely long. Like a view, only the elements that are accessed are computed. Other than this behavior, a Stream behaves similar to a List.

Just like a List can be constructed with ::, a Stream can be constructed with the #:: method, using Stream.empty at the end of the expression instead of Nil:

scala> val stream = 1 #:: 2 #:: 3 #:: Stream.empty
stream: scala.collection.immutable.Stream[Int] = Stream(1, ?)
The REPL output shows that the stream begins with the number 1 but uses a ? to denote the end of the stream. This is because the end of the stream hasn’t been evaluated yet. For example, given a Stream:

scala> val stream = (1 to 100000000).toStream
stream: scala.collection.immutable.Stream[Int] = Stream(1, ?)
you can attempt to access the head and tail of the stream. The head is returned immediately:

scala> stream.head
res0: Int = 1
but the tail isn’t evaluated yet:

scala> stream.tail
res1: scala.collection.immutable.Stream[Int] = Stream(2, ?)
The ? symbol is the way a lazy collection shows that the end of the collection hasn’t been evaluated yet.

As discussed in Recipe 10.24, “Creating a Lazy View on a Collection”, transformer methods are computed lazily, so when transformers are called, you see the familiar ? character that indicates the end of the stream hasn’t been evaluated yet:

scala> stream.take(3)
res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)

scala> stream.filter(_ < 200)
res1: scala.collection.immutable.Stream[Int] = Stream(1, ?)

scala> stream.filter(_ > 200)
res2: scala.collection.immutable.Stream[Int] = Stream(201, ?)

scala> stream.map { _ * 2 }
res3: scala.collection.immutable.Stream[Int] = Stream(2, ?)
However, be careful with methods that aren’t transformers. Calls to the following strict methods are evaluated immediately and can easily cause java.lang.OutOfMemoryError errors:

stream.max
stream.size
stream.sum
Transformer methods are collection methods that convert a given input collection to a new output collection, based on an algorithm you provide to transform the data. This includes methods like map, filter, and reverse. When using these methods, you’re transforming the input collection to a new output collection. Methods like max, size, and sum don’t fit that definition, so they attempt to operate on the Stream, and if the Stream requires more memory than you can allocate, you’ll get the java.lang.OutOfMemoryError.

As a point of comparison, if I had attempted to use a List in these examples, I would have encountered a java.lang.OutOfMemory error as soon as I attempted to create the List:

val list = (1 to 100000000).toStream
Using a Stream gives you a chance to specify a huge list, and begin working with its elements:

stream(0)  // returns 1
stream(1)  // returns 2
// ...
stream(10)  // returns 11

=========
Given a list: val list1 = List(1,3,4,0,-1,6)

1. Filter
The filter operator takes as operands a list of type List[T] and one function of type T => Boolean called predicate. This operator returns a new list with all elements of the original list for which the predicate is true.

scala> val list2 = list1 filter (_ > 0)
res0: List[Int] = List(1, 3, 4, 6)

2. Find
Returns the first element for which the predicate is true.

scala> list1 find (_ > 0)
res1: Option[Int] = Some(1)

3. Partition
The partition operator returns a pair of lists. The first one includes all elements that satisfies the predicate.

scala> list1 partition (_ > 0)
res3: (List[Int], List[Int]) = (List(1, 3, 4, 6),List(0, -1))

4. TakeWhile
The takeWhile operator iterates the list until it finds one element that doesn’t satisfy the predicate.
It returns the longest prefix such that every element satisfies the predicate.

scala> list1 takeWhile (_ > 0)
res4: List[Int] = List(1, 3, 4)

5. DropWhile
The dropWhile operator iterates the list until it finds one element that doesn’t satisfy the predicate,
It drops the longest prefix such that every element satisfies the predicate.

scala> list1 dropWhile (_ > 0)
res5: List[Int] = List(0, -1, 6)

6. Convert List[Option[T]] to List[T]
There is an implicit conversion from Option[A] to Iterable[A].

scala> val list1 = List(Some(1), None, Some(2))
scala> val list2 = list1.flatten
res5: List[Int] = List(1,2)

7. Pattern Matching
Match the list with unknown length.


object Names {
    def unapplySeq(name: String): Option[(String, String, Seq[String])] = {
        val names = name.trim.split("")
        if (names.size < 2) None
        else Some((names.last, names.head, names.drop(1).dropRight(1)))
    }
}


def greet(fullName: String) = fullName match {
    case Names(lastName, firstName, _*) = firstName + " " + lastName
    case _ = "Welcome"
}


==========================================================================================
Scala Note 25: Lists

==========================================================================================

Lists are immutable.
Elements of a list cannot be changed by assignment.
Lists have a recursive structure, whereas arrays are flat.
Lists support more operations than arrays
All lists are built from two more fundamental constructors, Nil and :: (pronounced “cons”). Nil represents an empty list. The infix operator ::expresses list extension.The ‘::’ operation associates to the right: A :: B :: C is interpreted as A :: (B :: C).

List is an abstract class and is co-variant in this parameter, which means that List[S] <: List[T] for all types S and T such that S <: T.


Higher-Order Methods
xs is a List

xs map (x => x * factor)
xs foreach (x => println(x))
xs filter (x => x > 0)

def isPrime(n: Int) = List.range(2, n) forall (x => n % x != 0)

reduceLeft expand to left-leaning trees. This method inserts a given binary operator between
adjacent elements of a given list.

def sum(xs: List[Int]) = (0 :: xs) reduceLeft {(x, y) => x + y}
def product(xs: List[Int]) = (1 :: xs) reduceLeft {(x, y) => x * y}


===========================================================================================
Map, Flatten, FlatMap in Scala
===========================================================================================
1. passing map a function, an anonymous function,to transform each element.
Think of an if statement(guard) as being a filter, so the correct solution is to first filter the collection, and then call map

scala> val fruits = List("apple", "banana", "lime", "orange", "raspberry")
scala> fruits.filter(_.length < 6).map(_.toUpperCase)
res1: List[String] = List(APPLE, LIME)

2. Use the flatten method to convert a list of lists into a single list.

scala> val list = List("Hello", "world")
scala> list.flatten
res0: List[Char] = List(H, e, l, l, o, w, o, r, l, d)

3. Use flatMap in situations where you run map followed by flatten
You’re using map (or a for/yield expression) to create a new collection from an existing collection. The resulting collection is a list of lists.
You call flatten immediately after map.  When you’re in this situation, you can use flatMap instead.
flatMap does both the mapping(invoking the provided function, passing in each element)
and the flattening of the result(extracting out the values from Some and throwing out the None)
scala> def subWords(word: String) = List(word, word.tail, word.take(word.length-1))
scala> words.flatMap(subWords)
res2: List[String] = List(band, and, ban, start, tart, star, then, hen, the)
val l = List(1, "this", 2, 4.4, 'c')
l.flatMap{
   case i:Int => Some(i)
   case _ => None
}
res1: List[Int] = List(1,2)
 */
}
