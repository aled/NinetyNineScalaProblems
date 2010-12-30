package com.wibblr.ninety_nine_scala_problems

//  P14 (*) Duplicate the elements of a list.
//  Example:
//
//  scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

object P14 {
  val versions = List[List[Any] => List[Any]](duplicate)

  def duplicate[T](l: List[T]): List[T] = {
    l.foldLeft(List[T]()){
      (acc, item) => item :: item :: acc
    }.reverse
  }
}