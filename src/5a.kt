import java.io.File

fun main() {

    val lines = File("9.txt").readLines()
    val count = lines.size

    val subjects = listOf(
        "English", "Maths", "Physics", "Chemistry", "Biology"
    )

    val maxMarks = MutableList(5) { 0 }
    val toppers = MutableList(5) { mutableListOf<String>() }

    var highestTotal = 0
    var goldMedalist = ""

    for (i in 0 until count) {

        val parts = lines[i].split(',')
        val name = parts[0]
        var total = 0

        for (j in 3..7) {
            val mark = parts[j].substringAfter(":").toInt()
            if (mark > maxMarks[j - 3]) {
                maxMarks[j - 3] = mark
                toppers[j - 3].clear()
                toppers[j - 3].add(name)

            } else if (mark == maxMarks[j - 3]) {
                toppers[j - 3].add(name)
            }
            total += mark
        }
        if (total > highestTotal) {
            highestTotal = total
            goldMedalist = name
        }
    }
    println()
    println("SUBJECT TOPPERS")
    for (i in 0..4) {
        println("${subjects[i]} : ${toppers[i]} - ${maxMarks[i]}")
    }
    println()
    println("GOLD MEDALIST")
    println("$goldMedalist - $highestTotal")
}