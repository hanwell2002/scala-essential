package map

object ListToIndexMap {

  def main(args: Array[String]) {

    val parts = List("Motherboard", "Video Card", "Sound Card", "32 inch Monitor")

    val map = parts.zipWithIndex.map { case (v, i) => (i, v) }.toMap

    println("The Indexed of map : " + map)
  }

}