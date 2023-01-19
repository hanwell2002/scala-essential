package currydemo

object LoopDemo extends  App{

  val nums = Seq(1,3,4,5,7 )


  // foreach(item: anyref){function}
  nums.foreach(println)

  nums.foreach { println(_)}


  nums.foreach {
    println("\n")
    item => println(item)
  }


}
