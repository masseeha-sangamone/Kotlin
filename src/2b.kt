/**Take input from the keyboard and generate the same result
start = input ("Enter first number")
end = input ("Enter second number")**/

fun main(){
    println("Enter first number: ")
    val start = readln().toInt()
    println("Enter second number: ")
    val end = readln().toInt()

    for(i in start..end){
        println("Multiplication Table of $i")
        for(j in 1..10){
            println("$i x $j = " +i*j)
        }
        println()
    }
}