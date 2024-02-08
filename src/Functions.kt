import kotlin.math.PI

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// ex 1
fun circleArea(r: Int): Double {
    return PI * r * r
}

// ex 2
fun circleAreaSingleLine(r: Int): Double = PI * r * r

// ex 3
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds

// Lambda Expressions

val upperCaseString = { string: String -> string.uppercase() }

val numbers = listOf(1, -2, 3, -4, 5, -6)

// filter
val positives = numbers.filter { x -> x > 0 } // could also be written { it > 0 }
val negatives = numbers.filter { x -> x < 0 } // could also be written { it < 0 }

// map
val doubled = numbers.map { x -> x * 2 } // could also be { it * 2 }
val tripled = numbers.map { x -> x * 3 } // could also be { it * 3 }

// ex 1 for lambdas
fun ex1() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { x -> "$prefix/$id/$x" }
    println(urls)
}

// ex 2 for lambdas
fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}
