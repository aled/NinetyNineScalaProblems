package com.wibblr.ninety_nine_scala_problems

//  P01 (*) Find the last element of a list.
//  Example:
//
//  scala> last(List(1, 1, 2, 3, 5, 8))
//  res0: Int = 8

object P01 {
  val versions = List[List[Any] => Any] (last1, last2, last3, last4, last5, last6, last7)

  // first attempt
  def last1(l: List[Any]): Any = l(l.length - 1)

  // using generics
  def last2[T](l: List[T]): T = l(l.length - 1)

  // avoid 'length' call - but gives compiler warning
  def last3[T](l: List[T]): T = l match {
    case first :: Nil => first
    case first :: rest => last3(rest)
  }

  // remove compiler warning. Also can use wildcard.
  def last4[T](l: List[T]): T = l match {
    case first :: Nil => first
    case _ :: rest => last4(rest)
    case _ => throw new Exception()
  }

  // avoid pattern matching - use a for loop
  def last5(l: List[Any]) = {
    var next: Any = Nil
    l.foreach { next = _}
    next
  }

  // reduceLeft method
  def last6[T](l: List[T]) = l.reduceLeft((acc, item) => item)

  // foldLeft method
  def last7[T](l: List[T]) = l.foldLeft(l.head)((acc, item) => item)
}