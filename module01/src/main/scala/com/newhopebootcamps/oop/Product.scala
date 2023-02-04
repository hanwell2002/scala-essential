package com.newhopebootcamps.oop

import scala.collection.mutable.ListBuffer

case class Product(name: String, price: Double)

class Order(code: Int) {
 // var products: List[Product] = List.empty[Product]
  // var products: List[Product] = List.empty
  var products: List[Product] = List[Product]()

  var prodList = new ListBuffer[Product]()

  val orderNumber = code
  var total = 0.0
  var sum: Double = 0.0

  def addToCart(item: Product): Unit = {
    products :+= item
  }
  def addToOrder(item: Product): Unit = {
    prodList += item
  }
  def printOrder = {
    println("Order No.: " + orderNumber)

    products.foreach {
      item => println(s"Product = ${item.name}: Price: ${item.price}")
    }

   val sum = products.map(_.price).sum


    println("-----------------------Sum = "  + sum)
  }

  def printRecipt = {
    println("Order No.: " + orderNumber)
    // println(prodList.toList)
    prodList.toList.foreach {
      item => println(s"Product = ${item.name}: Price: ${item.price}")
    }

    total = prodList.toList.foldLeft(0.0)(_ + _.price)

    // def sum [B >: A] (implicit num: Numeric[B]): B
    println(f"-----------------------Total = $total%.2f")

    println("%s: $%.2f".format("-----------------------Total", total))
  }
}

object Shopping extends App {
  val watch = Product("Watch", 499.0)
  val pc = Product("Lenovo", 1499.0)
  val keyboard = Product("Cherry", 399.0)

  val order = new Order(100001)

  order.addToCart(watch)
  order.addToCart(pc)
  order.addToCart(keyboard)

  order.printOrder

  //--------------------------------------------
  val laptop = Product("Laptop", 2499.0)
  val mouse = Product("Mouse", 127.99)
  val bag = Product("Bag", 57.99)


  val order2 = new Order(100002)
  order2.addToOrder(laptop)
  order2.addToOrder(mouse)
  order2.addToOrder(bag)


  order2.printRecipt
}

//scala> val m = Map("one"->1,"two"->2,"three"->3)
//m: scala.collection.immutable.Map[java.lang.String,Int] = Map(one -> 1, two -> 2, three -> 3)
//scala> m.foldLeft(0)(_+_._2)
