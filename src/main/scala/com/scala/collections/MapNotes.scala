package com.scala.collections

class MapNotes {
/*
===== How to create Maps in Scala (Scala Map class examples)=====
Problem
You want to use a mutable or immutable Map in a Scala application.

Solution
To use an immutable map, you don’t need an import statement, just create a Map:

scala> val states = Map("AL" -> "Alabama", "AK" -> "Alaska")
states: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska)
This expression creates an immutable Map with type Map[String, String]. For the first element, the string AL is the key, and Alabama is the value.

As noted, you don’t need an import statement to use a basic, immutable Map. The Scala Predef object brings the immutable Map trait into scope by defining a type alias:

type Map[A, +B] = immutable.Map[A, B]
val Map         = immutable.Map
To create a mutable map, either use an import statement to bring it into scope, or specify the full path to the scala.collection.mutable.Map class when you create an instance.

You can define a mutable Map that has initial elements:

scala> var states = collection.mutable.Map("AL" -> "Alabama")
states: scala.collection.mutable.Map[String,String] = Map(AL -> Alabama)
You can also create an empty, mutable Map initially, and add elements to it later:

scala> var states = collection.mutable.Map[String, String]()
states: scala.collection.mutable.Map[String,String] = Map()

scala> states += ("AL" -> "Alabama")
res0: scala.collection.mutable.Map[String,String] = Map(AL -> Alabama)
Discussion
Like maps in other programming languages, maps in Scala are a collection of key/value pairs. If you’ve used maps in Java, dictionaries in Python, or a hash in Ruby, Scala maps are straightforward. You only need to know a couple of new things, including the methods available on map classes, and the specialty maps that can be useful in certain situations, such as having a sorted map.

Note that the syntax that’s used inside parentheses in a map creates a Tuple2:

"AL" -> "Alabama"
Because you can also declare a Tuple2 as ("AL", "Alabama"), you may also see maps created like this:

scala> val states = Map( ("AL", "Alabama"), ("AK", "Alaska") )
states: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska)
Use whichever style you prefer.

When I want to be clear that I’m using a mutable map, I normally specify the full path to the mutable Map class when I create the instance, as shown in the Solution. Another technique you can use it to give the mutable Map an alias when you import it, and then refer to it using that alias, as shown here:

import scala.collection.mutable.{Map => MMap}

object Test extends App {
    // MMap is really scala.collection.mutable.Map
    val m = MMap(1 -> 'a')
    for((k,v) <- m) println(s"$k, $v")
}
This technique is described more in Recipe 7.3, “Renaming Members on Import”.


========== Map Implimentation ===
Problem
You need to choose a Scala Map class for a particular problem.

Solution
Scala has a wealth of map types to choose from, and you can even use Java map classes. If you’re looking for a basic map class, where sorting or insertion order doesn’t matter, you can either choose the default, immutable Map, or import the mutable Map, as shown in the previous recipe.

If you want a map that returns its elements in sorted order by keys, use a SortedMap:

scala> import scala.collection.SortedMap
import scala.collection.SortedMap

scala> val grades = SortedMap("Kim" -> 90,
     | "Al" -> 85,
     | "Melissa" -> 95,
     | "Emily" -> 91,
     | "Hannah" -> 92
     | )
grades: scala.collection.SortedMap[String,Int] = Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)
If you want a map that remembers the insertion order of its elements, use a LinkedHashMap or ListMap. Scala only has a mutable LinkedHashMap, and it returns its elements in the order you inserted them:

scala> import scala.collection.mutable.LinkedHashMap
import scala.collection.mutable.LinkedHashMap

scala> var states = LinkedHashMap("IL" -> "Illinois")
states: scala.collection.mutable.LinkedHashMap[String,String] = Map(IL -> Illinois)

scala> states += ("KY" -> "Kentucky")
res0: scala.collection.mutable.LinkedHashMap[String,String] = Map(IL -> Illinois, KY -> Kentucky)

scala> states += ("TX" -> "Texas")
res1: scala.collection.mutable.LinkedHashMap[String,String] = Map(IL -> Illinois, KY -> Kentucky, TX -> Texas)
Scala has both mutable and immutable ListMap classes. They return elements in the opposite order in which you inserted them, as though each insert was at the head of the map (like a List):

scala> import scala.collection.mutable.ListMap
import scala.collection.mutable.ListMap

scala> var states = ListMap("IL" -> "Illinois")
states: scala.collection.mutable.ListMap[String,String] = Map(IL -> Illinois)

scala> states += ("KY" -> "Kentucky")
res0: scala.collection.mutable.ListMap[String,String] = Map(KY -> Kentucky, IL -> Illinois)

scala> states += ("TX" -> "Texas")
res1: scala.collection.mutable.ListMap[String,String] = Map(TX -> Texas, KY -> Kentucky, IL -> Illinois)
The LinkedHashMap implements a mutable map using a hashtable, whereas a ListMap is backed by a list-based data structure. (Personally, I don’t use the List class very often, so I prefer the LinkedHashMap.)

Discussion
Table 11-1 shows a summary of the basic Scala map classes and traits, and provides a brief description of each.

Table 11-1. Basic map classes and traits

Class or trait	Description
collection.immutable.Map	This is the default, general-purpose immutable map you get if you don’t import anything.
collection.mutable.Map	A mutable version of the basic map.
collection.mutable.LinkedHashMap	All methods that traverse the elements will visit the elements in their insertion order.
collection.immutable.ListMap
collection.mutable.ListMap	Per the Scaladoc, “implements immutable maps using a list-based data structure.” As shown in the examples, elements that are added are prepended to the head of the list.
collection.SortedMap	Keys of the map are returned in sorted order. Therefore, all traversal methods (such as foreach) return keys in that order.
Although those are the most commonly used maps, Scala offers even more map types. They are summarized in Table 11-2.

Table 11-2. More map classes and traits

Class or trait	Description
collection.immutable.HashMap	From the Scaladoc, “implements immutable maps using a hash trie.”
collection.mutable.ObservableMap	From the Scaladoc: “This class is typically used as a mixin. It adds a subscription mechanism to the Map class into which this abstract class is mixed in.”
collection.mutable.MultiMap	From the Scaladoc: “A trait for mutable maps with multiple values assigned to a key.”
collection.mutable.SynchronizedMap	From the Scaladoc: This trait “should be used as a mixin. It synchronizes the map functions of the class into which it is mixed in.”
collection.immutable.TreeMap	From the Scaladoc: “implements immutable maps using a tree.”
collection.mutable.WeakHashMap	A wrapper around java.util.WeakHashMap, “a map entry is removed if the key is no longer strongly referenced.”
But wait, there’s still more. Beyond these types, Scala also offers several more map types that have parallel/concurrent implementations built into them:

collection.parallel.immutable.ParHashMap
collection.parallel.mutable.ParHashMap
collection.concurrent.TrieMap


========= Scala: How to add, update, and remove elements with a mutable Map =======

Problem
You want to add, remove, or update elements in a mutable map.

Solution
Add elements to a mutable map by simply assigning them, or with the += method. Remove elements with -= or --=. Update elements by reassigning them.

Given a new, mutable Map:

scala> var states = scala.collection.mutable.Map[String, String]()
states: scala.collection.mutable.Map[String,String] = Map()
You can add an element to a map by assigning a key to a value:

scala> states("AK") = "Alaska"
You can also add elements with the += method:

scala> states += ("AL" -> "Alabama")
res0: scala.collection.mutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska)
Add multiple elements at one time with +=:

scala> states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
res1: scala.collection.mutable.Map[String,String] = Map(AL -> Alabama, AR -> Arkansas, AK -> Alaska, AZ -> Arizona)
Add multiple elements from another collection using ++=:

scala> states ++= List("CA" -> "California", "CO" -> "Colorado")
res2: scala.collection.mutable.Map[String,String] = Map(CO -> Colorado,
  AZ -> Arizona, AL -> Alabama, CA -> California, AR -> Arkansas,
  AK -> Alaska)
Remove a single element from a map by specifying its key with the -= method:

scala> states -= "AR"
res3: scala.collection.mutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska, AZ -> Arizona)
Remove multiple elements by key with the -= or --= methods:

scala> states -= ("AL", "AZ")
res4: scala.collection.mutable.Map[String,String] = Map(AK -> Alaska)

// remove multiple with a List of keys
scala> states --= List("AL", "AZ")
res5: scala.collection.mutable.Map[String,String] = Map(AK -> Alaska)
Update elements by reassigning their key to a new value:

scala> states("AK") = "Alaska, A Really Big State"

scala> states
res6: scala.collection.mutable.Map[String,String] = Map(AK -> Alaska, A Really Big State)
There are other ways to add elements to maps, but these examples show the most common uses.



Discussion
The methods shown in the Solution demonstrate the most common approaches. You can also use put to add an element (or replace an existing element); retain to keep only the elements in the map that match the predicate you supply; remove to remove an element by its key value; and clear to delete all elements in the map. These methods are shown in the following examples:

scala> val states = collection.mutable.Map(
     |   "AK" -> "Alaska",
     |   "IL" -> "Illinois",
     |   "KY" -> "Kentucky"
     | )
states: collection.mutable.Map[String,String] = Map(KY -> Kentucky, IL -> Illinois, AK -> Alaska)

scala> states.put("CO", "Colorado")
res0: Option[String] = None

scala> states.retain((k,v) => k == "AK")
res1: states.type = Map(AK -> Alaska)

scala> states.remove("AK")
res2: Option[String] = Some(Alaska)

scala> states
res3: scala.collection.mutable.Map[String,String] = Map()

scala> states.clear

scala> states
res4: scala.collection.mutable.Map[String,String] = Map()
As shown, the remove method returns an Option that contains the value that was removed. It’s not shown in the example, but if the element put into the collection by put replaced another element, that value would be returned. Because this example didn’t replace anything, it returned None.


===== Scala: How to add, update, and remove elements with immutable Maps =======

Problem
You want to add, update, or delete elements when working with an immutable map.

Solution
Use the correct operator for each purpose, remembering to assign the results to a new map.

To be clear about the approach, the following examples use an immutable map with a series of val variables. First, create an immutable map as a val:

scala> val a = Map("AL" -> "Alabama")
a: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama)
Add one or more elements with the + method, assigning the result to a new Map variable during the process:

// add one element
scala> val b = a + ("AK" -> "Alaska")
b: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska)

// add multiple elements
scala> val c = b + ("AR" -> "Arkansas", "AZ" -> "Arizona")
c: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska, AR -> Arkansas, AZ -> Arizona)
To update a key/value pair with an immutable map, reassign the key and value while using the + method, and the new values replace the old:

scala> val d = c + ("AR" -> "banana")
d: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska, AR -> banana, AZ -> Arizona)
To remove one element, use the - method:

scala> val e = d - "AR"
e: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska, AZ -> Arizona)
To remove multiple elements, use the - or -- methods:

scala> val f = e - "AZ" - "AL"
f: scala.collection.immutable.Map[String,String] = Map(AK -> Alaska)
Discussion
You can also declare an immutable map as a var. Doing so has a dramatic difference on how you can treat the map:

scala> var x = Map("AL" -> "Alabama")
x: scala.collection.mutable.Map[String,String] = Map(AL -> Alabama)

// add one element
scala> x += ("AK" -> "Alaska"); println(x)
Map(AL -> Alabama, AK -> Alaska)

// add multiple elements
scala> x += ("AR" -> "Arkansas", "AZ" -> "Arizona"); println(x)
Map(AZ -> Arizona, AL -> Alabama, AR -> Arkansas, AK -> Alaska)

// add a tuple to a map (replacing the previous "AR" key)
scala> x += ("AR" -> "banana"); println(x)
Map(AZ -> Arizona, AL -> Alabama, AR -> banana, AK -> Alaska)

// remove an element
scala> x -= "AR"; println(x)
Map(AZ -> Arizona, AL -> Alabama, AK -> Alaska)

// remove multiple elements (uses varargs method)
scala> x -= ("AL", "AZ"); println(x)
Map(AK -> Alaska)

// reassign the map that 'x' points to
scala> x = Map("CO" -> "Colorado")
x: scala.collection.mutable.Map[String,String] = Map(CO -> Colorado)
It’s important to understand that when you create an immutable map as a var, you still have an immutable map. For instance, you can’t reassign an element in the map:

scala> x("AL") = "foo"
<console>:9: error: value update is not a member of scala.collection.immutable.Map[String,String]
              x("AL") = "foo"
              ^
What’s really happening in the previous examples is that because x was defined as a var, it’s being reassigned during each step in the process. This is a subtle but important distinction to understand. See Recipe 10.6, “Understanding Mutable Variables with Immutable Collections” for more information.

========== Scala - Understanding mutable variables with immutable collections =======

Problem
You may have seen that mixing a mutable variable (var) with an immutable collection causes surprising behavior. For instance, when you create an immutable Vector as a var, it appears you can somehow add new elements to it:

scala> var sisters = Vector("Melinda")
sisters: collection.immutable.Vector[String] = Vector(Melinda)

scala> sisters = sisters :+ "Melissa"
sisters: collection.immutable.Vector[String] = Vector(Melinda, Melissa)

scala> sisters = sisters :+ "Marisa"
sisters: collection.immutable.Vector[String] = Vector(Melinda, Melissa, Marisa)

scala> sisters.foreach(println)
Melinda
Melissa
Marisa
How can this be?

Solution
Though it looks like you’re mutating an immutable collection, what’s really happening is that the sisters variable points to a new collection each time you use the :+ method.

The sisters variable is mutable — like a non-final field in Java — so it’s actually being reassigned to a new collection during each step. The end result is similar to these lines of code:

var sisters = Vector("Melinda")
sisters = Vector("Melinda", "Melissa")
sisters = Vector("Melinda", "Melissa", "Marisa")
In the second and third lines of code, the sisters reference has been changed to point to a new collection.

You can demonstrate that the Vector itself is immutable. Attempting to mutate one of its elements — which doesn’t involve reassigning the variable — results in an error:

scala> sisters(0) = "Molly"
<console>:12: error: value update is not a member of
scala.collection.immutable.Vector[String]
              sisters(0) = "Molly"
              ^
Summary
When you first start working with Scala, the behavior of a mutable variable with an immutable collection can be surprising. To be clear about variables and values:

A mutable variable (var) can be reassigned to point at new data.
An immutable variable (val) is like a final variable in Java; it can never be reassigned.
To be clear about collections:

The elements in a mutable collection (like ArrayBuffer) can be changed.
The elements in most immutable collections (like Vector and List) cannot be changed.
The Array does not obey the second statement about collections, so I used the word “most” in that sentence rather than “all.” Because the Scala Array is backed by a Java array, the elements in an Array can be changed after the Array is first created. You can’t make the Array longer or shorter, but you can re-assign an element, like this: elements(0) = "foo"

========= How to access Map values in Scala =======

Problem
You want to access individual values stored in a map. You may have tried this and run into an exception when a key didn’t exist, and want to see how to avoid that exception.

Solution
Given a sample map:

scala> val states = Map("AL" -> "Alabama", "AK" -> "Alaska", "AZ" -> "Arizona")
states: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama, AK -> Alaska, AZ -> Arizona)
Access the value associated with a key in the same way you access an element in an array:

scala> val az = states("AZ")
az: String = Arizona
However, be careful, because if the map doesn’t contain the requested key, a java.util.NoSuchElementException exception is thrown:

scala> val s = states("FOO")
java.util.NoSuchElementException: key not found: FOO
One way to avoid this problem is to create the map with the withDefaultValue method. As the name implies, this creates a default value that will be returned by the map whenever a key isn’t found:

scala> val states = Map("AL" -> "Alabama").withDefaultValue("Not found")
states: scala.collection.immutable.Map[String,String] = Map(AL -> Alabama)

scala> states("foo")
res0: String = Not found
Another approach is to use the getOrElse method when attempting to find a value. It returns the default value you specify if the key isn’t found:

scala> val s = states.getOrElse("FOO", "No such state")
s: String = No such state
You can also use the get method, which returns an Option:

scala> val az = states.get("AZ")
az: Option[String] = Some(Arizona)

scala> val az = states.get("FOO")
az: Option[String] = None
To loop over the values in a map, see the next recipe.

See Also
Recipe 11.21, “Testing for the Existence of a Key or Value in a Map”
Recipe 20.6, “Using the Option/Some/None Pattern” shows how to work with Option, Some, and None values

====== How to traverse a Map in Scala (for loop, foreach) ========

Problem
You want to iterate over the elements in a Scala Map, such as to print all of the key and value elements in the Map.

Solution: Looping over Map values
There are several different ways to iterate over the elements in a Map. Given a sample Map:

val ratings = Map(
    "Lady in the Water"-> 3.0,
    "Snakes on a Plane"-> 4.0,
    "You, Me and Dupree"-> 3.5
)
my preferred way to loop over all of the map elements is with this for loop syntax:

for ((k,v) <- ratings) println(s"key: $k, value: $v")
Using a match expression with the foreach method is also very readable:

ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
}
The following approach shows how to use the Tuple syntax to access the key and value fields of the Map:

ratings.foreach(x => println(s"key: ${x._1}, value: ${x._2}"))
If you just want to use the keys in the map, the keys method returns an Iterable you can use:

ratings.keys.foreach((movie) => println(movie))
For simple examples like this, that expression can be reduced as follows:

ratings.keys.foreach(println)
In the same way, use the values method to iterate over the values in the map:

ratings.values.foreach((rating) => println(rating))
Note: Those are not my movie ratings. They are taken from the book, Programming Collective Intelligence (O’Reilly), by Toby Segaran.

Operating on Map values (mapValues, transform)
If you want to traverse the Map to perform an operation on its values, the mapValues method may be a better solution. It lets you perform a function on each map value, and returns a modified Map:

scala> var x = collection.mutable.Map(1 -> "a", 2 -> "b")
x: scala.collection.mutable.Map[Int,String] = Map(2 -> b, 1 -> a)

scala> val y = x.mapValues(_.toUpperCase)
y: scala.collection.Map[Int,String] = Map(2 -> B, 1 -> A)
The transform method gives you another way to create a new Map from an existing Map. Unlike mapValues, it lets you use both the key and value to write a transformation method:

scala> val map = Map(1 -> 10, 2 -> 20, 3 -> 30)
map: scala.collection.mutable.Map[Int,Int] = Map(2 -> 20, 1 -> 10, 3 -> 30)

scala> val newMap = map.transform((k,v) => k + v)
newMap: map.type = Map(2 -> 22, 1 -> 11, 3 -> 33)
See Also
Recipe 10.27, Scala Tuples, for when you just need a bag of things

======= How to get the keys or values from a Scala Map =========

Problem
You want to get all of the keys or values from a Scala Map.

Solution
To get the keys, use keySet to get the keys as a Set, keys to get an Iterable, or keysIterator to get the keys as an iterator:

scala> val states = Map("AK" -> "Alaska", "AL" -> "Alabama", "AR" -> "Arkansas")
states: scala.collection.immutable.Map[String,String] = Map(AK -> Alaska, AL -> Alabama, AR -> Arkansas)

scala> states.keySet
res0: scala.collection.immutable.Set[String] = Set(AK, AL, AR)

scala> states.keys
res1: Iterable[String] = Set(AK, AL, AR)

scala> states.keysIterator
res2: Iterator[String] = non-empty iterator
To get the values from a map, use the values method to get the values as an Iterable, or valuesIterator to get them as an Iterator:

scala> states.values
res0: Iterable[String] = MapLike(Alaska, Alabama, Arkansas)

scala> states.valuesIterator
res1: Iterator[String] = non-empty iterator
As shown in these examples, keysIterator and valuesIterator return an iterator from the map data. I tend to prefer these methods because they don’t create a new collection; they just provide an iterator to walk over the existing elements.

====== How to reverse keys and values in a Scala Map ====

Problem
You want to reverse the contents of a Scala Map, so the values become the keys, and the keys become the values.

Solution
You can reverse the keys and values of a map with a for-comprehension, being sure to assign the result to a new variable:

val reverseMap = for ((k,v) <- map) yield (v, k)
But be aware that values don’t have to be unique and keys must be, so you might lose some content. As an example of this, reversing the following map — where two values are $5.00 — results in one of the items being dropped when the keys and values are reversed:

scala> val products = Map(
     |   "Breadsticks" -> "$5",
     |   "Pizza" -> "$10",
     |   "Wings" -> "$5"
     | )
products: scala.collection.mutable.Map[String,String] = Map(Wings -> $5, Pizza -> $10, Breadsticks -> $5)

scala> val reverseMap = for ((k,v) <- products) yield (v, k)
reverseMap: scala.collection.mutable.Map[String,String] = Map($5 -> Breadsticks, $10 -> Pizza)
As shown, the $5 wings were lost when the values became the keys, because both the breadsticks and the wings had the String value $5.

See Also
Recipe 3.4, “Creating a For Comprehension (for/yield Combination)”
Recipe 10.13, “Transforming One Collection to Another with for/yield”

====== How to test for the existence of a key or value in a Scala Map ===========
Problem
You want to test whether a Scala Map contains a given key or value.

Solution
To test for the existence of a key in a Map, use the contains method:

scala> val states = Map(
     |     "AK" -> "Alaska",
     |     "IL" -> "Illinois",
     |     "KY" -> "Kentucky"
     | )
states: scala.collection.immutable.Map[String,String] = Map(AK -> Alaska, IL -> Illinois, KY -> Kentucky)

scala> if (states.contains("FOO")) println("Found foo") else println("No foo")
No foo
To test whether a value exists in a map, use the valuesIterator method to search for the value using exists and contains:

scala> states.valuesIterator.exists(_.contains("ucky"))
res0: Boolean = true

scala> states.valuesIterator.exists(_.contains("yucky"))
res1: Boolean = false
This works because the valuesIterator method returns an Iterator:

scala> states.valuesIterator
res2: Iterator[String] = MapLike(Alaska, Illinois, Kentucky)
and exists returns true if the function you define returns true for at least one element in the collection. In the first example, because at least one element in the collection contains the String literal ucky, the exists call returns true.

Discussion
When chaining methods like this together, be careful about intermediate results. In this example, I originally used the values methods to get the values from the map, but this produces a new collection, whereas the valuesIterator method returns a lightweight iterator.

See Also
Recipe 11.17, “Accessing Map Values” shows how to avoid an exception while accessing a map key
Recipe 11.19, “Getting the Keys or Values from a Map” demonstrates the values and valuesIterator methods



======= How to filter a Scala Map (filterKeys, retain, transform) =====

Solution
Use the retain method to define the elements to retain when using a mutable map, and use filterKeys or filter to filter the elements in a mutable or immutable map, remembering to assign the result to a new variable.

Mutable maps
You can filter the elements in a mutable map using the retain method to specify which elements should be retained:

scala> var x = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
x: scala.collection.mutable.Map[Int,String] = Map(2 -> b, 1 -> a, 3 -> c)

scala> x.retain((k,v) => k > 1)
res0: scala.collection.mutable.Map[Int,String] = Map(2 -> b, 3 -> c)

scala> x
res1: scala.collection.mutable.Map[Int,String] = Map(2 -> b, 3 -> c)
As shown, retain modifies a mutable map in place. As implied by the anonymous function signature used in that example:

(k,v) => ...
your algorithm can test both the key and value of each element to decide which elements to retain in the map.

In a related note, the transform method doesn’t filter a map, but it lets you transform the elements in a mutable map:

scala> x.transform((k,v) => v.toUpperCase)
res0: scala.collection.mutable.Map[Int,String] = Map(2 -> B, 3 -> C)

scala> x
res1: scala.collection.mutable.Map[Int,String] = Map(2 -> B, 3 -> C)
Depending on your definition of “filter,” you can also remove elements from a map using methods like remove and clear, which are shown in Recipe 11.16.

Mutable and immutable maps
When working with a mutable or immutable map, you can use a predicate with the filterKeys methods to define which map elements to retain. When using this method, remember to assign the filtered result to a new variable:

scala> val x = Map(1 -> "a", 2 -> "b", 3 -> "c")
x: scala.collection.mutable.Map[Int,String] = Map(2 -> b, 1 -> a, 3 -> c)

scala> val y = x.filterKeys(_ > 2)
y: scala.collection.Map[Int,String] = Map(3 -> c)
The predicate you supply should return true for the elements you want to keep in the new collection and false for the elements you don’t want.

If your algorithm is longer, you can define a function (or method), and then use it in the filterKeys call, rather than using an anonymous function. First define your method, such as this method, which returns true when the value the method is given is 1:

scala> def only1(i: Int) = if (i == 1) true else false
only1: (i: Int)Boolean
Then pass the method to the filterKeys method:

scala> val x = Map(1 -> "a", 2 -> "b", 3 -> "c")
x: scala.collection.mutable.Map[Int,String] = Map(2 -> b, 1 -> a, 3 -> c)

scala> val y = x.filterKeys(only1)
y: scala.collection.Map[Int,String] = Map(1 -> a)
In an interesting use, you can also use a Set with filterKeys to define the elements to retain:

scala> var m = Map(1 -> "a", 2 -> "b", 3 -> "c")
m: scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b, 3 -> c)

scala> val newMap = m.filterKeys(Set(2,3))
newMap: scala.collection.immutable.Map[Int,String] = Map(2 -> b, 3 -> c)
You can also use all of the filtering methods that are shown in Chapter 10. For instance, the Map version of the filter method lets you filter the map elements by either key, value, or both. The filter method provides your predicate a Tuple2, so you can access the key and value as shown in these examples:

scala> var m = Map(1 -> "a", 2 -> "b", 3 -> "c")
m: scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b, 3 -> c)

// access the key
scala> m.filter((t) => t._1 > 1)
res0: scala.collection.immutable.Map[Int,String] = Map(2 -> b, 3 -> c)

// access the value
scala> m.filter((t) => t._2 == "c")
res1: scala.collection.immutable.Map[Int,String] = Map(3 -> c)
The take method lets you “take” (keep) the first N elements from the map:

scala> m.take(2)
res2: scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b)
See the filtering recipes in Chapter 10 for examples of other methods that you can use, including takeWhile, drop, slice, and more.



=========== How to sort a Scala Map by key or value (sortBy, sortWith) =====

Problem
You have an unsorted map and want to sort the elements in the map by the key or value.

Solution
Given a basic, immutable Map:

scala> val grades = Map("Kim" -> 90,
     |     "Al" -> 85,
     |     "Melissa" -> 95,
     |     "Emily" -> 91,
     |     "Hannah" -> 92
     | )
grades: scala.collection.immutable.Map[String,Int] = Map(Hannah -> 92, Melissa -> 95, Kim -> 90, Emily -> 91, Al -> 85)
You can sort the map by key, from low to high, using sortBy:

scala> import scala.collection.immutable.ListMap
import scala.collection.immutable.ListMap

scala> ListMap(grades.toSeq.sortBy(_._1):_*)
res0: scala.collection.immutable.ListMap[String,Int] = Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)
You can also sort the keys in ascending or descending order using sortWith:

// low to high
scala> ListMap(grades.toSeq.sortWith(_._1 < _._1):_*)
res0: scala.collection.immutable.ListMap[String,Int] = Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)

// high to low
scala> ListMap(grades.toSeq.sortWith(_._1 > _._1):_*)
res1: scala.collection.immutable.ListMap[String,Int] = Map(Melissa -> 95, Kim -> 90, Hannah -> 92, Emily -> 91, Al -> 85)
You can sort the map by value using sortBy:

scala> ListMap(grades.toSeq.sortBy(_._2):_*)
res0: scala.collection.immutable.ListMap[String,Int] = Map(Al -> 85, Kim -> 90, Emily -> 91, Hannah -> 92, Melissa -> 95)
You can also sort by value in ascending or descending order using sortWith:

// low to high
scala> ListMap(grades.toSeq.sortWith(_._2 < _._2):_*)
res0: scala.collection.immutable.ListMap[String,Int] = Map(Al -> 85, Kim -> 90, Emily -> 91, Hannah -> 92, Melissa -> 95)

// high to low
scala> ListMap(grades.toSeq.sortWith(_._2 > _._2):_*)
res1: scala.collection.immutable.ListMap[String,Int] = Map(Melissa -> 95, Hannah -> 92, Emily -> 91, Kim -> 90, Al -> 85)
In all of these examples, you’re not sorting the existing map; the sort methods result in a new sorted map, so the output of the result needs to be assigned to a new variable.

Also, you can use either a ListMap or a LinkedHashMap in these recipes. This example shows how to use a LinkedHashMap and assign the result to a new variable:

scala> val x = collection.mutable.LinkedHashMap(grades.toSeq.sortBy(_._1):_*)
x: scala.collection.mutable.LinkedHashMap[String,Int] =
    Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)

scala> x.foreach(println)
(Al,85)
(Emily,91)
(Hannah,92)
(Kim,90)
(Melissa,95)
Discussion
To understand these solutions, it’s helpful to break them down into smaller pieces. First, start with the basic immutable Map:

scala> val grades = Map("Kim" -> 90,
     |   "Al" -> 85,
     |   "Melissa" -> 95,
     |   "Emily" -> 91,
     |   "Hannah" -> 92
     | )
grades: scala.collection.immutable.Map[String,Int] = Map(Hannah -> 92, Melissa -> 95, Kim -> 90, Emily -> 91, Al -> 85)
Next, this is what grades.toSeq looks like:

scala> grades.toSeq
res0: Seq[(String, Int)] = ArrayBuffer((Hannah,92), (Melissa,95), (Kim,90), (Emily,91), (Al,85))
You make the conversion to a Seq because it has sorting methods you can use:

scala> grades.toSeq.sortBy(_._1)
res0: Seq[(String, Int)] = ArrayBuffer((Al,85), (Emily,91), (Hannah,92), (Kim,90), (Melissa,95))

scala> grades.toSeq.sortWith(_._1 < _._1)
res1: Seq[(String, Int)] = ArrayBuffer((Al,85), (Emily,91), (Hannah,92), (Kim,90), (Melissa,95))
Once you have the map data sorted as desired, store it in a ListMap to retain the sort order:

scala> ListMap(grades.toSeq.sortBy(_._1):_*)
res0: scala.collection.immutable.ListMap[String,Int] = Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)
The LinkedHashMap also retains the sort order of its elements, so it can be used in all of the examples as well:

scala> import scala.collection.mutable.LinkedHashMap
import scala.collection.mutable.LinkedHashMap

scala> LinkedHashMap(grades.toSeq.sortBy(_._1):_*)
res0: scala.collection.mutable.LinkedHashMap[String,Int] = Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)
There are both mutable and immutable versions of a ListMap, but LinkedHashMap is only available as a mutable class. Use whichever is best for your situation.

About that _*
The _* portion of the code takes a little getting used to. It’s used to convert the data so it will be passed as multiple parameters to the ListMap or LinkedHashMap. You can see this a little more easily by again breaking down the code into separate lines. The sortBy method returns a Seq[(String, Int)], i.e., a sequence of tuples:

scala> val x = grades.toSeq.sortBy(_._1)
x: Seq[(String, Int)] = ArrayBuffer((Al,85), (Emily,91), (Hannah,92), (Kim,90), (Melissa,95))
You can’t directly construct a ListMap with a sequence of tuples, but because the apply method in the ListMap companion object accepts a Tuple2 varargs parameter, you can adapt x to work with it, i.e., giving it what it wants:

scala> ListMap(x: _*)
res0: scala.collection.immutable.ListMap[String,Int] = Map(Al -> 85, Emily -> 91, Hannah -> 92, Kim -> 90, Melissa -> 95)
Attempting to create the ListMap without using this approach results in an error:

scala> ListMap(x)
<console>:16: error: type mismatch;
 found   : Seq[(String, Int)]
 required: (?, ?)
              ListMap(x)
                      ^
Another way to see how _* works is to define your own method that takes a varargs parameter. The following printAll method takes one parameter, a varargs field of type String:

def printAll(strings: String*) {
    strings.foreach(println)
}
If you then create a List like this:

// a sequence of strings
val fruits = List("apple", "banana", "cherry")
you won’t be able to pass that `List` into printAll; it will fail like the previous example:

scala> printAll(fruits)
<console>:20: error: type mismatch;
 found   : List[String]
 required: String
              printAll(fruits)
                       ^
But you can use _* to adapt the List to work with printAll, like this:

// this works
printAll(fruits: _*)
If you come from a Unix background, it may be helpful to think of _* as a “splat” operator. This operator tells the compiler to pass each element of the sequence to printAll as a separate argument, instead of passing fruits as a single List argument.

See Also
The immutable ListMap class
The immutable ListMap companion object
The mutable ListMap class
The mutable LinkedHashMap class

======== How to find the largest key or value in a Scala Map ========

Solution
Use the max method on the map, or use the map’s keysIterator or valuesIterator with other approaches, depending on your needs.

For example, given this map:

val grades = Map("Al" -> 80, "Kim" -> 95, "Teri" -> 85, "Julia" -> 90)
the key is type String, so which key is “largest” depends on your definition. You can find the “largest” key using the natural String sort order by calling the max method on the map:

scala> grades.max
res0: (String, Int) = (Teri,85)
Because the “T” in “Teri” is farthest down the alphabet in the names, it is returned. You can also call keysIterator to get an iterator over the map keys, and call its max method:

scala> grades.keysIterator.max
res1: String = Teri
You can find the same maximum by getting the keysIterator and using reduceLeft:

scala> grades.keysIterator.reduceLeft((x,y) => if (x > y) x else y)
res2: String = Teri
This approach is flexible, because if your definition of “largest” is the longest string, you can compare string lengths instead:

scala> grades.keysIterator.reduceLeft((x,y) => if (x.length > y.length) x else y)
res3: String = Julia
Because the values in the map are of type Int in this example, you can use this simple approach to get the largest value:

scala> grades.valuesIterator.max
res4: Int = 95
You can also use the reduceLeft approach, if you prefer:

scala> grades.valuesIterator.reduceLeft(_ max _)
res5: Int = 95
You can also compare the numbers yourself, which is representative of what you may need to do with more complex types:

scala> grades.valuesIterator.reduceLeft((x,y) => if (x > y) x else y)
res6: Int = 95
To find minimum keys and values, just reverse the algorithms in these examples.



 */
}
