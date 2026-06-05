import java.io.File

fun main() {
    val lines = File("gk1.txt").readLines()
    val countries = mutableListOf<String>()
    val capitals = mutableListOf<String>()
    val answer = mutableListOf<String>()
    val score  = mutableListOf<Double>()
    var question = ""
    for (i in 0..9) {
        val parts = lines[i].trim().split(",")
        var part1 = parts[0]
        var part2 = parts[1]
        countries.add(part1)
        capitals.add(part2)
    }

    for (i in 0 .. 9) {
        println("What is the capital of " + "${countries.random()}")
        val answer1 = readln()
        answer.add(answer1)
    }
    println()

    for (i in 0..9) {
        if (answer[i].trim().lowercase() == capitals[i].trim().lowercase()) {
            score.add(10.00)
        } else {
            score.add(0.00)
        }
    }

    println()

    val total = score.sum()
    println("Total marks: "+ total)
    println("Wrongly Answered Questions:")
    for (i in 0.. 9) {
        if (score[i]== 0.00) {
            println("What is the capital of "  +countries[i]+ "?")
            println("Correct answer: "+ capitals[i])
        }
    }
}






