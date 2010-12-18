package com.wibblr.ninety_nine_scala_problems

//  P04 (*) Find the number of elements of a list.
//  Example:
//
//  scala> length(List(1, 1, 2, 3, 5, 8))
//  res0: Int = 6

object P04 {
  def versions = List[List[Any] => Any] (length1)

  // Pretty trivial
  def length1(l: List[Any]): Any = l.size
}