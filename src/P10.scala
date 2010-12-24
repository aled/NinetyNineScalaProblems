package com.wibblr.ninety_nine_scala_problems

//  P10 (*) Run-length encoding of a list.
//  Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
//
//  Example:
//
//  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

object P10 {
  val versions = List[List[Any] => List[Pair[Int, Any]]](encode)

  def encode[T](l: List[T]): List[Pair[Int, T]] = {
    def packed = P09.pack(l)
    packed.map(sublist => (sublist.length, sublist(0)))
  }
}