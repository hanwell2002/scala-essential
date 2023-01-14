package com.newhopebootcamps.implicits

//  Implicit Parameter Example
object Example04 extends App {

  val factor = 10;
  def multiply(implicit by: Int) = by * factor

  implicit val multiplier = 2

  println(multiply)

}

