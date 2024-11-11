package org.example.lesson1

fun main() {
    val secondsTotal = 6480
    val timeHours = (secondsTotal / 3600)
    val timeMinute = (secondsTotal % 3600) / 60
    val timeSeconds = secondsTotal % 60

    println(
        "Время полета Гагарина ${timeHours.toString().padStart(2, '0')}:${
            timeMinute.toString().padStart(2, '0')
        }:${timeSeconds.toString().padStart(2, '0')}"
    )
}
