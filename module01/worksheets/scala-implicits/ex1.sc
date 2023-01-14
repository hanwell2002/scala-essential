//def add(a: Int, b:Int) = a + b
def increament(a: Int) = a + 1
implicit def stringToInt(s: String): Int  = {

  try {
    s.toInt
  }catch {
    case e: Exception => 0
  }
}

/*
 def strToInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: Exception => None
  }
}
*/



// add(10, 90)
increament("10")

