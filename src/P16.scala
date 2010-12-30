package com.wibblr.ninety_nine_scala_problems

//  P16 (**) Drop every Nth element from a list.
//  Example:
//
//  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

object P16 {
  val versions = List[(Int, List[Any]) => List[Any]](drop1, drop2)

  def drop1[T](n: Int, l: List[T]): List[T] = {
    var i: Int = 0
    l.foldLeft(List[T]()){
      (acc, item) =>
      i += 1
      if (i % n == 0)
        acc
      else
        item :: acc
    }.reverse
  }

  // try and do it without a var
  def drop2[T](n: Int, l: List[T]): List[T] = {

    // same as List.tail(), but returns Nil for an empty list.
    def safeTail(l: List[T]): List[T] = l match {
      case Nil => Nil
      case _ => l.tail
    }

    // e.g.  (List(), List(1, 2, 3, 4, 5, 6, 7) => List(2, 1), List(4, 5, 6, 7))
    //  then (List(2, 1), List(4, 5, 6, 7) => List(5, 4, 2, 1), List(7)
    def dropInner(acc: List[T], remaining: List[T]): (List[T], List[T]) = {
      if (remaining.isEmpty) return (acc, remaining)
      val (a, b) = remaining.splitAt(n - 1)
      dropInner(a.reverse ++ acc, safeTail(b))
    }

    // drop the next element
    val (a, b) = dropInner(List[T](), l)
    a.reverse
  }
}