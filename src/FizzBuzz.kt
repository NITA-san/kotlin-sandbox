fun main() {
    for (number in 1..100) {
        if (number % 3 == 0 && number % 5 == 0) println("fizzbuzz")
        else if (number % 3 == 0) println("fizz")
        else if (number % 5 == 0) println("buzz")
        else println("$number")
    }

    println("-----")

    for (number in 1..100) {
        println(
            when {
                number % 3 == 0 && number %5 == 0 -> "fizz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }

}
