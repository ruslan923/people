package ru.netology

fun main() {
    val likes = readLine()
    val remainderOfDivision = likes!!.toInt() % 100
    val result: String = when {
        likes.toInt() == 0 -> {
            "Пока никому не понравилось"
        }
        likes.toInt() == 1 -> {
            "Понравилось $likes человеку"
        }
        remainderOfDivision == 1 -> {
            "Понравилось $likes человеку"
        }
        remainderOfDivision in 2..9 -> {
            "Понравилось $likes человекам"
        }
        else -> {
            "Понравилось $likes людям"
        }
    }
    print(result)
}
