package com.newhopebootcamps.implicits

// implicit parameter and scope demo, Note: A method can only contain one implicit keyword.
/**
 Syntax:
  def func1(implicit x : Int) // x is implicit
  def func2(implicit x : Int, y : Int) // x and y both are implicit
  def func3(x : Int)(implicit y : Int) // only y is implicit
 */
object Example01_2 {

  // mixed implicit and default parameter
  def speaker(name: String)(implicit language: String = "French") = {
    println(s"$name can speak $language")
  }

  def speakerOne() {
    implicit val english = "English"
    speaker("Sam")
  }

  def speakerTwo() {
    implicit val mandarin = "Mandarin"
    speaker("Peter")
  }

  def speakerThree() {
    speaker("Macron")
  }

  def main(args: Array[String]) {
    println("Implicit Demo")

    println("------call speaker ----------")
    speaker("Sarkozy")

    println("------call speakerOne ----------")
    speakerOne

    println("------call speakerTwo ----------")
    speakerTwo

    println("------call speakerThree ----------")
    speakerThree

  }

}
