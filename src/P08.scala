package com.wibblr.ninety_nine_scala_problems

//  P08 (**) Eliminate consecutive duplicates of list elements.
//  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//
//  Example:
//
//  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

object P08 {
  val versions = List[List[Any] => List[Any]] (compress1)

  def compress1(l: List[Any]): List[Any] = {
    import scala.collection.mutable.ListBuffer

    val lb = new ListBuffer[Any]

    l.foreach(item =>
      if (lb.size == 0 || item != lb.last) {
        lb.append(item)
      }
    )
    lb.toList
  }
}