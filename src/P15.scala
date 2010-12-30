package com.wibblr.ninety_nine_scala_problems

//  P15 (**) Duplicate the elements of a list a given number of times.
//  Example:
//
//  scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

object P15 {
  val versions = List[(Int, List[Any]) => List[Any]](duplicateN)

  def duplicateN[T](n: Int, l: List[T]): List[T] = {
    l.foldLeft(List[T]()){
      (acc, item) => List.fill(n)(item) ++ acc
    }.reverse
  }
}