package org.example.lesson1

fun main() {
    val secondInHour = 3600
    val secondInMinute = 60
    val secondsTotalFly = 6480
    val timeHours = (secondsTotalFly / secondInHour)
    val timeMinute = (secondsTotalFly % secondInHour) / secondInMinute
    val timeSeconds = secondsTotalFly % secondInMinute
    val textTime = String.format("%02d", timeHours) + ":" +
            String.format("%02d", timeMinute) + ":" +
            String.format("%02d", timeSeconds)
    println(
        "Время полета Гагарина $textTime"
    )
}
