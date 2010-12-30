package com.wibblr.ninety_nine_scala_problems

//  P12 (**) Decode a run-length encoded list.
//  Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//
//  Example:
//
//  scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//  res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

object P12 {
  // Not sure how to declare this so that decode1 and decode2 can both go in this list
  val versions = List[List[Any] => List[Any]](decode1)

  // Could use this if the signature of the method was List[Any]
  def decode1[T](l: List[Any]): List[T] = {
   l.foldLeft(List[T]())((acc, item) => item match {
      case p: Pair[Int, T] => (List.fill(p._1)(p._2)) ++ acc
      case _ => throw new Exception()
    }).reverse
  }

  def decode2[T](l: List[Pair[Int, T]]): List[T] = {
    l.foldLeft(List[T]())((acc, item) => List.fill(item._1)(item._2) ++ acc).reverse
  }
}