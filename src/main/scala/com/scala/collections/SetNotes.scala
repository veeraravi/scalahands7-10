package com.scala.collections

object SetNotes {
/*
* ======= How to add elements to a Set in Scala (operators, methods) =====

Problem
You want to add elements to a mutable set, or create a new set by adding elements to an immutable set.

Solution
Mutable and immutable sets are handled differently, as demonstrated in the following examples.

Mutable set
Add elements to a mutable Set with the +=, ++=, and add methods:

// use var with mutable
scala> var set = scala.collection.mutable.Set[Int]()
set: scala.collection.mutable.Set[Int] = Set()

// add one element
scala> set += 1
res0: scala.collection.mutable.Set[Int] = Set(1)

// add multiple elements
scala> set += (2, 3)
res1: scala.collection.mutable.Set[Int] = Set(2, 1, 3)

// notice that there is no error when you add a duplicate element
scala> set += 2
res2: scala.collection.mutable.Set[Int] = Set(2, 6, 1, 4, 3, 5)

// add elements from any sequence (any TraversableOnce)
scala> set ++= Vector(4, 5)
res3: scala.collection.mutable.Set[Int] = Set(2, 1, 4, 3, 5)

scala> set.add(6)
res4: Boolean = true

scala> set.add(5)
res5: Boolean = false
The last two examples demonstrate a unique characteristic of the add method on a set: It returns true or false depending on whether or not the element was added to the set. The other methods silently fail if you attempt to add an element that’s already in the set.

You can test to see whether a set contains an element before adding it:

set.contains(5)
But as a practical matter, I use += and ++=, and ignore whether the element was already in the set.

Whereas the first example demonstrated how to create an empty set, you can also add elements to a mutable set when you declare it, just like other collections:

scala> var set = scala.collection.mutable.Set(1, 2, 3)
set: scala.collection.mutable.Set[Int] = Set(2, 1, 3)
Immutable set
The following examples show how to create a new immutable set by adding elements to an existing immutable set.

First, create an immutable set:

scala> val s1 = Set(1, 2)
s1: scala.collection.immutable.Set[Int] = Set(1, 2)
Create a new set by adding elements to a previous set with the + and ++ methods:

// add one element
scala> val s2 = s1 + 3
s2: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

// add multiple elements (+ method has a varargs field)
scala> val s3 = s2 + (4, 5)
s3: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

// add elements from another sequence
scala> val s4 = s3 ++ List(6, 7)
s4: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3, 4)
I showed these examples with immutable variables just to be clear about how the approach works. You can also declare your variable as a var, and reassign the resulting set back to the same variable:

scala> var set = Set(1, 2, 3)
set: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> set += 4

scala> set
res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)


======== How to delete elements from Sets in Scala (operators, methods) ======
-------------------------------------------------------------------------------
Problem
You want to remove elements from a mutable or immutable set.

Solution
Mutable and immutable sets are handled differently, as demonstrated in the following examples.

Mutable Sets
When working with a mutable Set, remove elements from the set using the -= and --= methods, as shown in the following examples:

scala> var set = scala.collection.mutable.Set(1, 2, 3, 4, 5)
set: scala.collection.mutable.Set[Int] = Set(2, 1, 4, 3, 5)

// one element
scala> set -= 1
res0: scala.collection.mutable.Set[Int] = Set(2, 4, 3, 5)

// two or more elements (-= has a varags field)
scala> set -= (2, 3)
res1: scala.collection.mutable.Set[Int] = Set(4, 5)

// multiple elements defined in another sequence
scala> set --= Array(4,5)
res2: scala.collection.mutable.Set[Int] = Set()
You can also use other methods like retain, clear, and remove, depending on your needs:

// retain
scala> var set = scala.collection.mutable.Set(1, 2, 3, 4, 5)
set: scala.collection.mutable.Set[Int] = Set(2, 1, 4, 3, 5)

scala> set.retain(_ > 2)

scala> set
res0: scala.collection.mutable.Set[Int] = Set(4, 3, 5)

// clear
scala> var set = scala.collection.mutable.Set(1, 2, 3, 4, 5)
set: scala.collection.mutable.Set[Int] = Set(2, 1, 4, 3, 5)

scala> set.clear

scala> set
res1: scala.collection.mutable.Set[Int] = Set()

// remove
scala> var set = scala.collection.mutable.Set(1, 2, 3, 4, 5)
set: scala.collection.mutable.Set[Int] = Set(2, 1, 4, 3, 5)

scala> set.remove(2)
res2: Boolean = true

scala> set
res3: scala.collection.mutable.Set[Int] = Set(1, 4, 3, 5)

scala> set.remove(40)
res4: Boolean = false
As shown, the remove method provides feedback as to whether or not any elements were removed.

Immutable Sets
By definition, when using an immutable Set you can’t remove elements from it, but you can use the - and -- operators to remove elements while assigning the result to a new variable:

scala> val s1 = Set(1, 2, 3, 4, 5, 6)
s1: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)

// one element
scala> val s2 = s1 - 1
s2: scala.collection.immutable.Set[Int] = Set(5, 6, 2, 3, 4)

// multiple elements
scala> val s3 = s2 - (2, 3)
s3: scala.collection.immutable.Set[Int] = Set(5, 6, 4)

// multiple elements defined in another sequence
scala> val s4 = s3 -- Array(4, 5)
s4: scala.collection.immutable.Set[Int] = Set(6)
You can also use all of the filtering methods shown in Chapter 10. For instance, you can use the filter or take methods:

scala> val s1 = Set(1, 2, 3, 4, 5, 6)
s1: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)

scala> val s2 = s1.filter(_ > 3)
s2: scala.collection.immutable.Set[Int] = Set(5, 6, 4)

scala> val firstTwo = s1.take(2)
firstTwo: scala.collection.immutable.Set[Int] = Set(5, 1)

===== How to use sortable Sets in Scala (SortedSet, TreeSet, LinkedHashSet) ========
-------------------------------------------------------------------------------
Problem
You want to be able to store and retrieve items from a set in a sorted order.

Solution
To retrieve values from a set in sorted order, use a SortedSet. To retrieve elements from a set in the order in which elements were inserted, use a LinkedHashSet.

A SortedSet returns elements in a sorted order:

scala> val s = scala.collection.SortedSet(10, 4, 8, 2)
s: scala.collection.SortedSet[Int] = TreeSet(2, 4, 8, 10)

scala> val s = scala.collection.SortedSet("cherry", "kiwi", "apple")
s: scala.collection.SortedSet[String] = TreeSet(apple, cherry, kiwi)
A LinkedHashSet saves elements in the order in which they were inserted:

scala> val s = scala.collection.mutable.LinkedHashSet(10, 4, 8, 2)
s: scala.collection.mutable.LinkedHashSet[Int] = Set(10, 4, 8, 2)
Discussion
The SortedSet is available only in an immutable version. If you need a mutable version, use the java.util.TreeSet. The LinkedHashSet is available only as a mutable collection.

The examples shown in the Solution work because the types used in the sets have an implicit Ordering. Custom types won’t work unless you also provide an implicit Ordering. For example, the following code won’t work because the Person class is just a basic class:

class Person (var name: String)
import scala.collection.SortedSet
val aleka = new Person("Aleka")
val christina = new Person("Christina")
val molly = new Person("Molly")
val tyler = new Person("Tyler")

// this won't work
val s = SortedSet(molly, tyler, christina, aleka)
In the REPL, the last line of code fails with this error:

scala> val s = SortedSet(molly, tyler, christina, aleka)
<console>:17: error: No implicit Ordering defined for Person.
       val s = SortedSet(molly, tyler, christina, aleka)
                        ^
To solve this problem, modify the Person class to extend the Ordered trait, and implement a compare method:

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
With this new Person class definition, sorting works as desired:
-------------------------------------------------------------------------------

scala> val s = SortedSet(molly, tyler, christina, aleka)
s: scala.collection.SortedSet[Person] = TreeSet(Aleka, Christina, Molly, Tyler)
For more information about the Ordered and Ordering traits, see Recipe 10.28, “Sorting a Collection” and the links in the See Also section.


* */
}
