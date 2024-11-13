package org.example.lesson1

fun main() {
    val secondInHour = 3600
    val secondInMinute = 60
    val secondsTotalFly = 6480
    val timeHours = (secondsTotalFly / secondInHour)
    val timeMinute = (secondsTotalFly % secondInHour) / secondInMinute
    val timeSeconds = secondsTotalFly % secondInMinute
    println("Время полета Гагарина ${String.format("%02d:%02d:%02d", timeHours, timeMinute, timeSeconds)}")
}
