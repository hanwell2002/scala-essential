def increament(implicit a: Int) = a + 1
def log(msg: String )=println(msg)

def stringToInt(s: String): Int  = {
  log(">>calling stringToInt......")
  try {
    s.toInt
  }catch {
    case e: Exception => 0
  }
}

val s = "5"
implicit def strToInt: Int = {
  log(">>calling implicit function")
   //Some(s.toInt).getOrElse(0)
  stringToInt(s)
}


//call increament function
val result = increament

println("> " + result)
