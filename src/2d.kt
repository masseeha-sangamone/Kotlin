import java.io.File

fun main(){

    val line=File("2.txt").readText()

    val parts = line.split(",")

    val start= parts[0].toInt()
    val end= parts[1].toInt()

    for(i in start..end){
        println("Multiplication table of $i")
        for(j in 1..10){
            println("$i x $j = " + i*j)
        }
        println()
    }

}