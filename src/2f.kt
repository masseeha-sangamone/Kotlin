import java.io.File

fun main() {

    val lines = File("1.txt").readLines()

    val start = lines[0].toInt()
    val end = lines[1].toInt()
    var output = ""

    for (i in start..end) {
        output += "Multiplication table of $i\n"
        for (j in 1..10) {
            output += "$i x $j = ${i * j}\n"
        }
        File("$i.txt").writeText(output)
        output = ""
    }
    println("Files created successfully")
}