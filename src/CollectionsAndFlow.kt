fun types(): String {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
    return "Different Types: $a, $b, $c, $d, $e, $f"
}

fun collections() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("${greenNumbers.size + redNumbers.size}")

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("$n is spelt as ${number2word[n]}")
}

fun controlFlow() {
    print("please enter a number: ")
    val userNumber: String = readlnOrNull() ?: "0"

    val realNum = try {
        userNumber.toInt()
    } catch (e: Exception) {
        0
    }

    when (realNum) {
        in 0..9 -> println("Number is 1st order of magnitude")
        in 10..99 -> println("Number is 2nd order of magnitude")
        in 100..999 -> println("Number is 3rd order of magnitude")
        else -> println("Number is HUGE!")
    }

    // fizzbuzz

    for (i in 1..100) {
        val numOrString: String = when {
            i % 3 == 0 && i % 5 == 0 -> "fizzbuzz"
            i % 3 == 0 -> "fizz"
            i % 5 == 0 -> "buzz"
            else -> i.toString()
        }
        println(numOrString)
    }

    // filter words
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    val startWithL = words.filter { it.startsWith("l") }
    for (word in startWithL) {
        println(word)
    }
}

