fun types(): String {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
    return "Different Types: $a, $b, $c, $d, $e, $f"
}

fun main() {
    println(types())
}