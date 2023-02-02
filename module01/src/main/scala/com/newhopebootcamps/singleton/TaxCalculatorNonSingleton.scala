package com.newhopebootcamps.singleton

// A simple Scala program to illustrate
// the concept of singleton object
//单例概念演示－－之非单例模式
class TaxCalculatorNonSingleton {

  // Variables
  var rates = 0.13;


  // Method which gives the area of the rectangle
  def computeTax(amount: Double): Double = {
    val hst = amount * rates
    println(s"Tax for $amount: $hst");

    hst
  }
}

// singleton object
object TaxCal {
  def main(args: Array[String]) {

    // Creating object of TaxCalculatorNonSingleton class
    var obj = new TaxCalculatorNonSingleton();
    val tax = obj.computeTax(100.0);

    println(s"tax = $tax")
  }
}