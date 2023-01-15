package com.newhopebootcamps.implicits

object Example01 extends App {

  val value = 8
  implicit val multiplier = 3
  //implicit val anotherInt = 10
  def multiply(implicit by: Int) = value * by
  def multiply80(implicit by: Int) = 80 * by

  println(result)

  // Implicit parameter will be passed here
  val result = multiply
  //val result2 = multiply(20)
  val result80 =multiply80



  // It will print 30 as a result
  println(result)

}