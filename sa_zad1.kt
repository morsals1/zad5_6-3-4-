import kotlin.math.pow
fun main(){
    try{
        println("введите число")
        var x = readLine()!!.toDouble()
        when{
            (x>3.6) -> x = 45 * x.pow(2) + 5
            (x<=3) -> x = (5 * x)/(10 * x.pow(2) + 1)
        }
        println("результат: ${String.format("%.3f",x)}")
    } catch (e: Exception){ println("неверный формат")}
}