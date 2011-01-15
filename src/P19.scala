package com.wibblr.ninety_nine_scala_problems

//  P19 (**) Rotate a list N places to the left.
//  Examples:
//
//  scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//  scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

object P19 {
  val versions = List[(Int, List[Any]) => List[Any]](rotate)

  def rotate[T](n: Int, l: List[T]): List[T] = {
    if (n == 0)
      return l

    val (a, b) = l.splitAt(
      if (n > 0)
        n
      else
        n + l.size
    )

    b ::: a
  }

}