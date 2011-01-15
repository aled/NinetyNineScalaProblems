package com.wibblr.ninety_nine_scala_problems

//  P20 (*) Remove the Kth element from a list.
//  Return the list and the removed element in a Tuple. Elements are numbered from 0.
//
//  Example:
//
//  scala> removeAt(1, List('a, 'b, 'c, 'd))
//  res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

object P20 {
  val versions = List[(Int, List[Any]) => (List[Any], Any)](removeAt)

  def removeAt[T](n: Int, l: List[T]): (List[T], T) = {
    val (a, b) = l.splitAt(n)

    (a ::: b.tail, b.head)
  }
}
