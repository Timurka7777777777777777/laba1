package Laba1

fun main(args: Array<String>) {
println("Введите сумму подписки: ")
   val summ = readln().toInt()
    if (summ<=1000)
    {
       println(summ)
    }
    if (summ>1000 && summ<=10000 )
    {
        var amount = summ-100
        println(amount)
    }
    else
    {
        var amount = (summ*5)/100
        println(amount)
    }
}