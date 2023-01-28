package com.newhopebootcamps.implicits

  /* Converting the receiver */
 object DollarsDemo extends App {
   case class Dollars(amount: Int) {
     def prettify: String = "$" + amount
   }

   implicit def doubleToDollars(d: Int): Dollars = Dollars(d)

   val customerBalance: Int = 10000

   println("---------------------")
  println(customerBalance.prettify)

   println(customerBalance)

 }