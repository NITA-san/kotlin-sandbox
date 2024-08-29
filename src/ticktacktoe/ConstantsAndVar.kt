package ticktacktoe

const val WATER_FREEZING_POINT = 0

fun main() {
    println("Enter temperature in Celsius:")
    val celsiusTemp = readLine()?.toDoubleOrNull() ?: return
    val fahrenheitTemp = (celsiusTemp * 9 / 5) + 32
    println("Temperature in Fahrenheit: $fahrenheitTemp°F\n")
}

const val SERVER_PORT = 80
const val DATABASE_URL = "http://a.b.c"
const val MAX_POOL_SIZE = 20

fun printConfig() {
    println("Server Port: $SERVER_PORT")
    println("Database URL: $DATABASE_URL")
    println("Max Pool Size: $MAX_POOL_SIZE")

}