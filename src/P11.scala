package com.wibblr.ninety_nine_scala_problems

//  P11 (*) Modified run-length encoding.
//  Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
//
//  Example:
//
//  scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

object P11 {
  val versions = List[List[Any] => List[Any]](encodeModified)

  def encodeModified[T](l: List[T]): List[Any] = {
      def packed = P09.pack(l)
      packed.map(sublist => sublist match {
        case singleElement :: Nil => singleElement
        case _ => (sublist.length, sublist(0))
      })
  }
}