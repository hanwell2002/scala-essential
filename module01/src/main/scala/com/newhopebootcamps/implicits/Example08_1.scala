package com.newhopebootcamps.implicits

/**
 * Implicit Conversions
 *
 */

case class Centimeters(value: Double) extends AnyVal
case class Meters(value: Double) extends AnyVal
case class Kilometers(value: Double) extends AnyVal

object Example08_1 extends App{
  /**
   * If we want to use Meters in places where Centimeters are required,
   * we need to provide an implicit conversion from Meters into Centimeters.
   * We can do it by creating an implicit method, which takes Meters and returns Centimeters:
   *
   * @param meters
   * @return
   */
  implicit def meters2centimeters(meters: Meters): Centimeters = {
    Centimeters(meters.value * 100)
  }

  val centimeters: Centimeters = Meters(2.5)


  // centimeters should be Centimeters(250)
  println(centimeters)
}
