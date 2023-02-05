package xml

import scala.xml.XML
import com.github.tototoshi.csv._
import java.io.FileWriter

case class Part(ITEM: String, MANUFACTURER: String, MODEL: String, COST: Double)
//val xml = scala.xml.XML.loadString(<your xml as string>)
//val xml = scala.xml.XML.loadFile("C:/var/data/data/Posts.xml")


object Main {
  def main(args: Array[String]): Unit = {
    println(" *** XML Parser example!! *** ")
    // xmlparser()
    traverse
    loadXmlFromString
    println("")
  }


  //example-1
  def xmlparser(): Unit = {
    val currentDirectory = new java.io.File(".").getCanonicalPath

    println("Current Path: " + currentDirectory)

    // val xmlDoc = XML.loadFile("data/Posts.xml")
    // val xml = XML.loadFile("C:\\var\\data\\data\\Posts.xml")
    val xmlDoc = XML.loadFile("C:/var/data/data/Posts.xml")
    //val xmlDoc = XML.loadFile("/opt/appname/data/Posts.xml")

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

    // items.foreach(country=>println(country.text))
    // costs.foreach(country=>println(country.text))

    println(s"Cost = $costs")
    //import scala.collection._
    val name_price_map = names zip prices //(breakOut): Map[A, B]
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
    //also case pattern match
    for ((key, value) <- name_price_map)
      println(s"$key : $value")
    println("--------------------------------------------------------------------")

    // path \\ -->
    val itms = xmlDoc \\ "ITEM"
    val jiage = xmlDoc \\ "COST"

    println(itms)
    println(jiage)
  }


  // Example-2
  def traverse: Unit = {

    val xml = XML.loadFile("C:/var/data/data/Posts.xml")

    val partList: List[Part] = (xml \ "PART" map { node =>
      Part((node \ "ITEM").text, (node \ "MANUFACTURER").text, (node \ "MODEL").text, (node \ "COST").text.toDouble)
    }).toList

    val filePath = "C:/var/output/part-csv-writer3.csv"
    val csvWriter = CSVWriter.open(new FileWriter(filePath))
    csvWriter.writeAll(toStringList(partList))

    println("-- Processing finished successfully. --")
  }

  private def toStringList(parts: List[Part]) = {
    var records: List[List[String]] = List.empty
    // adding header record
    records :+= List("ITEM", "MANUFACTURER", "MODEL", "COST")
    // adding all part one by one
    for (e <- parts) {
      records :+= List(e.ITEM, e.MODEL, e.MODEL, String.format("%.2f", e.COST))
    }
    // you can convert Double to String by :  String.format("%.2f", e.COST) or simply ""+12.34

    // returns a List[List[String]]
    records
  }

  // Example - 3
  def loadXmlFromString(): Unit = {
    val xmlCountries =
      """
      <Countries>
        <Continent>
          <title>America</title>
          <country>
            <title>Brazil</title>
            <info region="South America" population="170115000" city="Brasília" country="Brazil" code="BRA" />
          </country>
          <country>
          <title>United States</title>
            <info region="North America" population="278357000" city="Washington" country="USA" code="USA" />
        </country>
        </Continent>
        <Continent>
         <title>Asia</title>
         <country>
           <title>Prathet Thai</title>
           <info region="Southeast Asia" population="61399000" city="Bangkok" country="Thailand" code="THA" />
         </country>
         <country>
           <title>People's republic of China</title>
           <info region="Eastern Asia" population="1277558000" city="Beijing" country="China" code="CHN" />
       </country>
       </Continent>
      </Countries>
    """

    // Load xml from a string
    val xml = scala.xml.XML.loadString(xmlCountries)

    val titles = xml \ "Continent" \ "country"
    println(titles)

    titles.foreach {
      c =>
        println("Title: " + c.text)
    }

    val info = xml \ "Continent" \ "country" \ "info"
    println(info)

    info.foreach {
      a =>
        val population = a \@ "population"
        val code = a \@ "code"
        println(s"code = ${code}, ${population.toInt}")
    }

  }


}