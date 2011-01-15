package com.wibblr.ninety_nine_scala_problems

import annotation.tailrec

//  P23 (**) Extract a given number of randomly selected elements from a list.
//  Example:
//
//  scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
//  res0: List[Symbol] = List('e, 'd, 'a)
//
//  Hint: Use the solution to problem P20


object P23 {
  val versions = List[(Int, List[Any]) => List[Any]](randomSelect1)

  // simple version; traverses the list n times (although each
  // traversal is on average len/2 elements). Use P20 as instructed.
  def randomSelect1[T](n: Int, l: List[T]): List[T] = {
    def random = new java.util.Random(0)
    val len = l.size

    def extractRandomEntriesIntoSecondList(firstList: List[T], firstListSize: Int, secondList: List[T], itemsRemaining: Int): List[T] = {
      if (firstList.isEmpty || itemsRemaining == 0)
        return secondList

      val (remainingItems, removedItem) = P20.removeAt(random.nextInt(firstListSize), firstList)

      extractRandomEntriesIntoSecondList(remainingItems, firstListSize - 1, removedItem :: secondList, itemsRemaining - 1)
    }

    extractRandomEntriesIntoSecondList(l, l.size, Nil, n)
  }

  // What we really want is to traverse the list exactly once, extracting
  // the selected elements as we go. Can't see how that is
  // possible though, as we need one traversal to get the length, and one to do
  // the extraction.
}
