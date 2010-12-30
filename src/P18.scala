package com.wibblr.ninety_nine_scala_problems

//  P18 (**) Extract a slice from a list.
//  Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
//
//  Example:
//
//  scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('d, 'e, 'f, 'g)
//

object P18 {
  val versions = List[(Int, Int, List[Any]) => List[Any]](slice)

  def slice[T](i: Int, k: Int, l: List[T]): List[T] = {
    l.slice(i, k)
  }

}
