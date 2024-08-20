import kotlin.math.PI

fun circleArea(r : Int) : Double {
    return PI * r * r
}

fun circleArea2(r : Int) = PI * r * r

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes)*60 +seconds

fun main() {
    println(circleArea(2))
    println(circleArea2(2))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes =  1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes =  10))
    println(intervalInSeconds(hours = 1, seconds = 1))


}