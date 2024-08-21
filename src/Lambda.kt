fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { s -> prefix + "/" + id + "/" + s }
    val urls2 = actions.map { s -> "$prefix/$id/$s" }
    println(urls)
    println(urls2)

    repeatN(5, { println("Hello") })

    repeatN(5) { println("Hi") }
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}