import java.util.*

fun main(args: Array<String>) {
    println("Hello World, ${args.first()}")
    dayOfWeek()
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
