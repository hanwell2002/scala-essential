package com.newhopebootcamps.implicits

object Example01_1 extends App {

  val monday = false
  def doubleInt(implicit x: Int) = x * 2

  //comment out first to demo implicit
  // implicit val value = 5

  //implicit def decider = if (monday) 4 else 2

  val result = doubleInt
  println(result)


}
