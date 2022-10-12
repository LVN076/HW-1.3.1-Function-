package ru.netology

val oldTime = 1
val minConvert = minutesConverter(oldTime)
val hourConvert = hoursConverter(oldTime)

fun main() {

    agoToTex(oldTime)

}

fun agoToTex(oldTime: Int) {

    when (oldTime) {
        in 0..60 -> println("только что")
        in 61..3600 -> minConvert.toString()
        in 3601..86424 -> hourConvert.toString()
        in 86425..172800 -> println("вчера")
        in 172801..259200 -> println("позавчера")
        else -> println("давно")
    }

}

fun minutesConverter(oldTime: Int) {
    if (oldTime in 61..3600) {
        val minCon = (oldTime / 60)
        if (minCon % 10 == 1)
            println("$minCon минуту назад")
        if (minCon % 10 == 4)
            println("$minCon минуты назад")
        else
            println("$minCon минут назад")

    }
}

fun hoursConverter(oldTime: Int) {
    if (oldTime in 3601..86424) {
        val hourCon = (oldTime / 3600)
        if (hourCon % 10 == 1)
            println("$hourCon час назад")
        else if (hourCon % 10 == 2 || hourCon % 10 == 4)
            println("$hourCon часа назад")
        else
            println("$hourCon часов назад")
    }
}

