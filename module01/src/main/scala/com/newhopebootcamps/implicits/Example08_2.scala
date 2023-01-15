package com.newhopebootcamps.implicits


/**
 * Implicit Conversions
 *
 */


object Example08_2 extends App {

  // 隐式函数是提供隐式转换的另一种方式:
  implicit val kilometers2meters: Kilometers => Meters
                                  = kilometers => Meters(kilometers.value * 1000)

  val meters: Meters = Kilometers(2.5)

  println("meters should be> " + meters)


}
