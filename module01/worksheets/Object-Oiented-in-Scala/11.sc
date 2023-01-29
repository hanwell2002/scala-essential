class Employee( var f: String, val l: String, s: Int) {
  private val first: String = f
  private val last: String = l
  private val stocks: Int = s

  def getFirst = first
  def getLast = last
  def getStocks = stocks

  def awardMoreStocks(numberOfStocks: Int): Employee = Employee(first, last, stocks + numberOfStocks)

  override def toString: String = first + " " + last + " " + stocks
}

val bobMartin =new Employee("Bob", "Martin", 10)

// bobMartin.awardMoreStocks(25)

class Manager( var ff: String, val ll: String, ss: Int) extends Employee{

}

bobMartin.f
bobMartin.f = "1243"

