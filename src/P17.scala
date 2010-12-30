package com.wibblr.ninety_nine_scala_problems

//  P17 (*) Split a list into two parts.
//  The length of the first part is given. Use a Tuple for your result.
//
//  Example:
//
//  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

object P17 {
  val versions = List[(Int, List[Any]) => (List[Any], List[Any])](split)

  def split[T](len: Int, l: List[T]): (List[T], List[T]) = {
    l.splitAt(len)
  }

}
