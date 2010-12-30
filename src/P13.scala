package com.wibblr.ninety_nine_scala_problems

//  P13 (**) Run-length encoding of a list (direct solution).
//  Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
//
//  Example:
//
//  scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

object P13 {
  val versions = List[List[Any] => List[Pair[Int, Any]]](encodeDirect)

  def encodeDirect[T](l: List[T]): List[Pair[Int, T]] = {

      // Use a tail-recursive function that takes a list of symbols, and prepends the next compressed symbol to a list
      // It then returns the original list (without the now-compressed symbols) and the current compressed list.
      // e.g. 1st call: List(), List('a, 'a, 'b, 'b, 'c, 'c) => List( (2, 'a) ), List('b, 'b, 'c, 'c)
      //      2nd call: List(2, 'a), List('b, 'b, 'c, 'c) => List( (2, 'b), (2, 'a) ), List('c, 'c)
      def encodeReverse(encoded: List[Pair[Int, T]], remaining: List[T]):  (List[Pair[Int, T]], List[T]) = {
        if (remaining.isEmpty) return (encoded, remaining)

        val (a, b) = remaining.span(_ == remaining.head)
        encodeReverse((a.length, a(0)) +: encoded, b)
      }

      val(a, b) = encodeReverse(List[Pair[Int, T]](), l)
      a.reverse
    }
}