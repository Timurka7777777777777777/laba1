package Laba1

fun main(args: Array<String>) {
    println("Введите число лайков: ")
    val amount = readln().toInt()
    if (amount%10==1) println("Понравилось человеку")
    else println("Понравилось людям")
}