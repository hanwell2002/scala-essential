package com.newhopebootcamps.implicits


object Example07 extends App {

  def twoImplicitParameters(implicit n : Int, n2 : Int): Unit = {
    println("The " + n + "th " + n2)
  }

  implicit val times : Int = 6

  implicit val second: Int = 7

  //call function by pass parameter value explicitly
  twoImplicitParameters(7, 8)

  //but implicit won't work for this case
  //twoImplicitParameters


}
