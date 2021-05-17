package ru.netology

fun main() {
    val likes = 56
    val likestToString = likes.toString()
    if (likes == 0) {
        print("Пока никому не понравилось")
    } else {
        if (likestToString.endsWith("1")) {
            print("Понравилось $likes человеку")
        } else {
            print("Понравилось $likes людям")
        }
    }
}
