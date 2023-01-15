package com.newhopebootcamps.implicits

//  Implicit Parameter Example
object Example04 extends App {

/*
  val factor = 10;
  def multiply(implicit by: Int) = by * factor

  implicit val multiplier = 2

  println(multiply)
*/
def increament(implicit a: Int) = a + 1

/*
  val s = "5"
  implicit def stringToInt: Int  = {
    Some(s.toInt).getOrElse(0)
  }

  val result = increament

  println(result)
*/

  val s = "5"
  implicit def sToInt: Int = Some(s.toInt).getOrElse(0)

  val result = increament

  println(result)
}

