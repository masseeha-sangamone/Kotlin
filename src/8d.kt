import java.io.File

data class countriesandcapital(
    val country : String,
    val capital : String
)

fun main() {
    val lines = File("gk1.txt").readLines()
    val questions = mutableListOf<countriesandcapital>()
    val answers = mutableListOf<String>()
    var score=0
    for (i in 0..9) {
        val parts = lines[i].trim().split(",")
        questions.add(countriesandcapital(parts[0], parts[1]))

    }

    questions.shuffle()
    for(i in 0..9){
        print("What is the capital of ${questions[i].country}")
        answers.add(readln())
        println()
    }

    println("Wrongly answered questions:")
    for(i in 0..9){
        if(answers[i].trim().lowercase()==questions[i].capital.trim().lowercase()){
            score+=10
        }
        else{

            print("Capital of ${questions[i].country}: ")
            println("${questions[i].capital}")
        }

    }
    println("Score: $score")
}
