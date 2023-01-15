package com.newhopebootcamps.implicits

  /**
   *  Implicit Function Example
   */
  object  Example03 extends App {
    val i = 1

    val intAddition  =  Seq(i).map { n => n + 1 }

    println(intAddition)

    implicit def intToSeq(i: Int): Seq[Int] = Seq(i)

    //won't work due to mismatch return type
    //implicit def intToSeq(i: Int): String = "Step" + i

    println(i + 10)
    println(i.map(_ + 2))

  }


// Seq(1,3,5,7) ==> Seq(2,4,6,8)