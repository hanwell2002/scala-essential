class Employee {
  val first: String = "Taylor"
  val last: String = "Swift"


}


var bobMartin = new Employee
println(bobMartin.first)
bobMartin.setLast("Jack")

// bobMartin.last = "Martin"



var taylorJackson = new Employee
taylorJackson.first
taylorJackson.last = "Jackson"



bobMartin = taylorJackson

bobMartin.first = "Jack"

case class Department(val name: String, val phone: String)

val hr = Department("Human resources", "416-123-4567")
