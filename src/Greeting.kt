import java.util.*

fun main(args: Array<String>) {
    print(if (args.first().toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
}


fun dayOfWeek(){
    println("What day is it today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (day) {
        0 -> println("Sunday")
        1 -> println("Monday")
        Calendar.THURSDAY -> println("Thursday")
        else -> println("Some day")
    }
}