package com.newhopebootcamps.implicits

object Example06 extends App {

  def demo2(implicit n : Int, msg : String): Unit = {
    println("The " + n + "th " + msg)
  }

  implicit val times : Int = 6

  implicit val message = "meets"

  demo2


}
