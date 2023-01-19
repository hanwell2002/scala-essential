package currydemo

object CurryDemo extends App{
  def product(a: Int, b: Int): Int = a * b


  product(10, 8)

  def productPartial(a: Int)(b: Int) : Int = a * b

  productPartial(10)(8)


  val m1 = productPartial(10) _

  val result = m1(8)

  println(result)
}
