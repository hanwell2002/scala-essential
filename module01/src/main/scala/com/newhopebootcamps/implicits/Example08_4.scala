package com.newhopebootcamps.implicits

object Example08_4 extends App{


  // They cannot take multiple non-implicit arguments:

  /* implicit def meters2centimeters(meters: Meters, secondArg: Boolean): Centimeters =
   Centimeters(meters.value * 100)

  val centimeters: Centimeters = Meters(2.5)
 */

  /**
   * However , having an additional  implicit argument is not a problem:
   */


 implicit val boolean = true
  implicit def meters2centimeters(meters: Meters)(implicit secondArg: Boolean): Centimeters =
    Centimeters(meters.value * 100)

  val centimeters: Centimeters = Meters(2.5)

  println(centimeters)

  // We cannot chain multiple implicit conversions:
  /*
  implicit def kilometers2meters(kilometers: Kilometers): Meters =
    Meters(kilometers.value * 1000)
  implicit def meters2centimeters(meters: Meters): Centimeters =
    Centimeters(meters.value * 100)

  val centimeters: Centimeters = Kilometers(2.5)
*/

}