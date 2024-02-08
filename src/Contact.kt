import kotlin.random.Random

class Contact(val id: Int, var email: String) {
    var category: String = "Work"

    fun printInfo() {
        println("Id: $id -- Email: $email -- Category: $category")
    }
}

data class User(val name: String, val id: Int)

// ex1
data class Employee(val name: String, var salary: Int)

// ex2
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("Tom", "Sally", "Bob", "Megan", "Zach", "Nina")

    fun generateEmployee(): Employee {
        val randName = names.random()
        val randomSalary = Random.nextInt(minSalary, maxSalary)
        return Employee(randName, randomSalary)
    }

}


