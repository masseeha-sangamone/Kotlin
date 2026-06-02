import java.io.File

fun main(){
    val lines=File("1.txt").readLines()
    val start= lines[0].toInt()
    val end= lines[1].toInt()

    var output=""

    for(i in start..end){
        output+="Multiplication table of $i \n\n"
        for(j in 1..10){
            output+="$i x $j = ${i*j} \n"
        }
        output+="\n\n"
        println(output)
        File("out1.txt").writeText(output)
    }
    println("Output written into out1.txt")
}
