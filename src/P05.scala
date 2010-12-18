package com.wibblr.ninety_nine_scala_problems

//  P05 (*) Reverse a list.
//  Example:
//
//  scala> reverse(List(1, 1, 2, 3, 5, 8))
//  res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 {
  def versions = List[List[Any] => List[Any]] (reverse1)

  // Pretty trivial
  def reverse1(l: List[Any]): List[Any] = l.reverse
}