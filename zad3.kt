fun main(){
    try {
        println("введите свой возраст")
        var a = readLine()!!.toInt()
        when (a) {
            in 0..2 -> println("младенец")
            in 3..7 -> println("дошкольный возраст")
            in 8..13 -> println("школьный возраст")
            in 14..17 -> println("юность")
            in 18..39 -> println("молодость")
            in 40..60 -> println("зрелость")
            else -> println("старость")
        }
    }catch (e:Exception) {println("неверный формат")}
}