package com.wibblr.ninety_nine_scala_problems

//  P22 (*) Create a list containing all integers within a given range.
//  Example:
//
//  scala> range(4, 9)
//  res0: List[Int] = List(4, 5, 6, 7, 8, 9)

object P22 {
  val versions = List[(Int, Int) => List[Int]](range)

  def range(start: Int, end: Int): List[Int] = {

    def inner(l: List[Int]): List[Int] = {
      if (start == l.head)
        return l

      return inner((l.head - 1) :: l)
    }

    inner(List(end))
  }
}
