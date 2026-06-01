import kotlin.math.pow

fun calc3(n1:Int, n2:Int){
    val sum1 = n1+n2
    val dif1 = n1-n2
    val prd1 = n1*n2
    val div1 = n1.toDouble()/n2.toDouble()
    val div2 = n1/n2
    val rem1 = n1%n2
    val exp1 = n1.toDouble().pow(n2.toDouble())

    return
}
fun main(){
    println("Enter num1: ")
    val n1 = readln().toInt()
    println("Enter num2: ")
    val n2 = readln().toInt()

    val result = calc1(8,4)
    println(result)

}