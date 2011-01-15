package com.wibblr.ninety_nine_scala_problems

//  P21 (*) Insert an element at a given position into a list.
//  Example:
//
//  scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
//  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

object P21 {
  val versions = List[(Any, Int, List[Any]) => List[Any]](insertAt)

  def insertAt[T](item: T, n: Int, l: List[T]): List[T] = {
    val (a, b) = l.splitAt(n)

    (a :+ item) ::: b
  }
}
