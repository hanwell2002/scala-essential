package com.newhopebootcamps.implicits

object Example01 extends App {

  //val value = 10
  //implicit val multiplier = 3

  def multiply(implicit by: Int) = 5 * by

  // Implicit parameter will be passed here
  val result = multiply

  // It will print 30 as a result
  println(result)

}