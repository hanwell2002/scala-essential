package com.newhopebootcamps.implicits
/**
 * Implicit Conversions
 *
 */

//case classes already defined in Example08_1.scala
/*
case class Centimeters(value: Double) extends AnyVal
case class Meters(value: Double) extends AnyVal
case class Kilometers(value: Double) extends AnyVal
*/

/**
 * Extension Methods
  隐式转换还可用于向现有类添加其他方法。
  让我们在Double中添加厘米、米和公里方法来创建长度单位:
 */
class LengthSyntax(value: Double) {
  def centimeters = Centimeters(value)
  def meters = Meters(value)
  def kilometers = Kilometers(value)
}


object Example08_3 extends App {
  implicit def double2richSyntax(value: Double): LengthSyntax = new LengthSyntax(value)

  val length: Double = 2.5

  println(length.centimeters) //  length.centimeters shouldBe Centimeters(length)
  println(length.meters)      //  length.meters shouldBe Meters(length)
  println(length.kilometers)  //  length.kilometers shouldBe Kilometers(length)



}

/**
 * In this case, the compiler is looking for an implicit conversion
 * that converts Double into anything that has centimeters, meters, or kilometers methods.
 * Therefore we provided an implicit double2richSyntax method, and the compiler knows what to do.
 *
 */
