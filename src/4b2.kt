import java.io.File
import java.time.LocalDate

fun main() {
    val count = 100
    val prisons = MutableList(count) { "C" }
    val lucky = mutableListOf<Int>()
    val unlucky = mutableListOf<Int>()

    for (i in 0 until count) {
        prisons[i] = "O"
    }
    for (i in 1 until count step 2) {
        prisons[i] = "C"
    }
    for (j in 2 until count) {
        for (i in j until count step (j + 1)) {
            if (prisons[i] == "C") {
                prisons[i] = "O"
            } else {
                prisons[i] = "C"
            }
        }
    }
    for (i in 0 until count) {
        if (prisons[i] == "O") {
            lucky.add(i + 1)
        }
        else{
            unlucky.add(i + 1)
        }
    }

    val today = LocalDate.now()
    val releaseAfter4Weeks = today.plusWeeks(4)

    val letter1 = """
            Date: $today
            
            To,
            The Prime Minister of India
            
            Subject: List of Lucky Prisoners Released Today
            
            Respected Sir,
            
            The following prisoners have been identified as lucky prisoners and are released today:
            
            $lucky
            
            Release Date: $today
            
            Yours faithfully,
            Jailer
            Andaman Central Prison
        """.trimIndent()

    val letter2 = """
            Date: $today
            
            To,
            The Jailer
            Andaman Central Prison
            
            Subject: List of Unlucky Prisoners
            
            Dear Sir,
            
            The following prisoners are not eligible for release today and will be released after 4 weeks:
            
            $unlucky
            
            Scheduled Release Date: $releaseAfter4Weeks
            
            Yours faithfully,
            Prison Administration
        """.trimIndent()

    File("letter1.txt").writeText(letter1)
    File("letter2.txt").writeText(letter2)

    println("letter1.txt created")
    println("letter2.txt created")
    }