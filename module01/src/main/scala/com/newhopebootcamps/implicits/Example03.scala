package com.newhopebootcamps.implicits

  /**
   *  Implicit Function Example
   */
  object  Example03 extends App {
    val i = 1

    val intAddition = Seq(i).map { n => n + 1 }
    println(intAddition)

    implicit def intToSeq(i: Int): Seq[Int] = Seq(i)
    println(i + 10)
    println(i.map(_ + 2))

  }
