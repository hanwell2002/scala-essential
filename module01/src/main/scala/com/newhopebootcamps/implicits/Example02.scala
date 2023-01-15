package com.newhopebootcamps.implicits

/**
 * Implicit parameter example
 */
object Example02 extends App{

    val message = "Hello "
    implicit val name = "world!"
    def disp(implicit nm : String) = message + nm

    // Implicit parameter will be passed here
    println(">> With Implicit parameters:")

    val result = disp
    println(result)

    // Implicit parameters will not be passed, due to passing a real parameter "Scala"
    println(">>Without Implicit parameters:")
    val result2 = disp("Scala!")
    println(result2)
}