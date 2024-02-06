fun main(){
    try {
        println("введите трехзначное число")
        var a = readLine()!!.toInt()
        if (a>99 && a<1000){
            var b = a/100
            var c = a%10
            when{
                (b==c) -> println("цифры равны, ${b} = ${c}")
                else -> println("цифры не равны")
            }
        }
        else println("введите трехзначное число!!!!")
    } catch (e:Exception){ println("неверный формат")}
}