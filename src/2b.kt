/**Take input from the keyboard and generate the same result
start = input ("Enter first number")
end = input ("Enter second number")**/

fun main(){
    println("Enter num1: ")
    val n1 = readln().toInt()
    println("Enter num2: ")
    val n2 = readln().toInt()

    for(i in n1..n2){
        println("Multiplication Table of $i")
        for(j in 1..10){
            println("$i x $j = " +i*j)
        }
        println()
    }
}