package com.wibblr.ninety_nine_scala_problems

//  P03 (*) Find the Kth element of a list.
//  By convention, the first element in the list is element 0.
//
//  Example:
//
//  scala> nth(2, List(1, 1, 2, 3, 5, 8))
//  res0: Int = 2

object P03 {
  def versions = List[(Int, List[Any]) => Any] (kth1)

  // This one seems too easy...
  def kth1(k: Int, l: List[Any]): Any = l(k)
}