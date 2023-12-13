package Laba1

fun main(args: Array<String>) {

    print("Введите число: ")
    val amount = readln().toInt()
    val result = (amount*0.75)/100
    println("Комиссия:" + " " +result)
}