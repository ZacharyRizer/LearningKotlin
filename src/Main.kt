fun main() {
    val action: () -> Unit = { println("hello") }
    repeatN(5, action)
}