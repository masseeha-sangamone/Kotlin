import java.io.File

fun main(){

    val lines=File("1.txt").readLines()

    val start= lines[0].toInt()
    val end= lines[1].toInt()

    for(i in start..end){
        println("Multiplication table of $i: ")
        for(j in 1..10){
            println("$i x $j = " +i*j)
        }
        println()
    }
}