package com.newhopebootcamps.singleton

import scala.math.{Pi, pow}

case class Circle(radius: Double) {
  import Circle._
  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}


object CircleRunner extends App {
  val circle1 = Circle(5.0)
  val circle1_1 = Circle(5.0)

  val circle2 = Circle(7.0);

  println(circle1.hashCode())
  println(circle2.hashCode())

}

