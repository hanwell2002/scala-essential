package com.newhopebootcamps.singleton

// illustrate the concept of singleton object
//单例概念演示－－单例模式(lazyly)
object TaxCalculatorSingleton {
  // Variables
  val rates = 0.13;

  // Method which gives the area of the rectangle
  def computeTax(amount: Double): Double = {
    val hst = amount * rates
    //  println(s"Tax for $amount: $hst");
    hst
  }

  //functional concise
  def calculateTax(amount: Double): Double = amount * rates

  override def toString: String = "" + rates;
}

// singleton object
object POS {
  def main(args: Array[String]) {
    println(TaxCalculatorSingleton)

    // Creating object of TaxCalculatorNonSingleton class
    val tax = TaxCalculatorSingleton.computeTax(200.0);
    println(s"tax = $tax")
  }
}