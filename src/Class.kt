import kotlin.random.Random

fun main() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    val persion = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())

}

data class Employee(val name: String, var salary: Int)
data class Name(val firstName :String, val familyName : String)
data class City(val name : String, val contryCode: String)
data class Address(val street: String, val city : City)
data class Person(val name : Name, val address : Address, val ownsAPet:Boolean)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary : Int ) {
    val potentialNames = listOf("Yamada", "Abe")

    fun generateEmployee() : Employee{
        return Employee(potentialNames.random(),Random.nextInt(minSalary, maxSalary) )
    }
}