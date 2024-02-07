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

fun main() {
    collections()
}