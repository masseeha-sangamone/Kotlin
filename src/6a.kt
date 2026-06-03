import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

fun main() {

    val cities = listOf(
        "San Francisco",
        "New York",
        "London",
        "Dubai",
        "Bangalore",
        "Singapore",
        "Tokyo",
        "Sydney",
        "Wellington"
    )

    val hours = listOf(-7, -4, 1, 4, 5, 8, 9, 10, 12)
    val minutes = listOf(0, 0, 0, 0, 30, 0, 0, 0, 0)

    val utcTime = LocalTime.now(ZoneOffset.UTC)
    val formatter = DateTimeFormatter.ofPattern("HH:mm")

    for (i in cities.indices) {
        val cityTime = utcTime
            .plusHours(hours[i].toLong())
            .plusMinutes(minutes[i].toLong())

        println("${cities[i]} : ${cityTime.format(formatter)}")
    }
}