package xml

import scala.xml.XML

case class Part(ITEM: String, MANUFACTURER: String, MODEL: String, COST: Double)
//val xml = scala.xml.XML.loadString(<your xml as string>)
//val xml = scala.xml.XML.loadFile("C:/var/data/data/Posts.xml")


object Main {
  def main(args: Array[String]): Unit = {
    println(" *** XML Parser example!! *** ")
    xmlparser()
  }

  def xmlparser(): Unit = {

    val currentDirectory = new java.io.File(".").getCanonicalPath
    println("Current Path: " + currentDirectory)

    // val xmlDoc = XML.loadFile("data/Posts.xml")
    // val xml = XML.loadFile("C:\\var\\data\\data\\Posts.xml")
    val xmlDoc = XML.loadFile("C:/var/data/data/Posts.xml")

    /**
     * Let’s have a look at how we can decipher it. XPath is a strong tool for querying the contents of an XML file.
     * Scala includes a query capability that is similar to XPath, with a few minor differences.
     * In XPath, we employ forward slashes “/” and “//” to query the XML documents. However,
     * in Scala, the “/” symbol is used as a division operator, whereas the “//” symbol is used to remark code.
     * When interacting with an XML document, Scala likes to utilize the reverse slashes “” and “.”
     *
     */

    // scala.xml.NodeSeq
    val parts = xmlDoc \ "PART"
    println(parts)

    println("-----parts \\ \"ITEM\"----------")
    val items = parts \ "ITEM"
    println(items)
    println("-----parts \\\\ \"ITEM\"----------")
    val items2 = parts \\ "ITEM"
    println(items2)

    // val names = items.map(_.text)   // convert to a new Seq[String]
    val names = for (e <- items if e.length < 4) yield e.text.toUpperCase
    println(names)

    val costs = parts \ "COST"
    val prices = for (f <- costs) yield f.text.toDouble
    println(prices)

    // items.foreach(item=>println(item.text))
    // costs.foreach(item=>println(item.text))

    println(s"Cost = $costs")
    import scala.collection._
    val name_price_map = (names zip prices) //(breakOut): Map[A, B]
    println(name_price_map)


    println("----------------------Map traverse----------------------------------")
    // Use Tuples
    name_price_map.foreach(pair => println(s"Key: ${pair._1}, Value: ${pair._2}"))
    println("--------------------------------------------------------------------")
    // case Pattern
    name_price_map.foreach { case (key, value) => println(s"Key: $key, Value: $value") }

    println("--------------------------------------------------------------------")

    //for Iteration
    for (pair <- name_price_map)
      println(s"${pair._1} : ${pair._2}")
    println("--------------------------------------------------------------------")

    for ((key, value) <- name_price_map)
      println(s"$key : $value")
    println("--------------------------------------------------------------------")

    // path \\ -->
    val itms = xmlDoc \\ "ITEM"
    val jiage = xmlDoc \\ "COST"

    println(itms)
    println(jiage)


  }


  def tbd(): Unit = {
    val Details =
      """
      <Name>
        <Add>
          <title>This is the add detail</title>
          <item>
            <title>Here is the add</title>
            <add hno="5" lane="xyz" city="abc" country="India" code="29" />
          </item>
        </Add>
      </Name>
    """
  }
}