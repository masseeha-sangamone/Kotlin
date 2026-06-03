import java.io.File

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
    File("pm.txt").writeText("Respected PM,$lucky are the lucky prisoners")
    File("jailer.txt").writeText("Dear Jailer,$unlucky are the unlucky prisoners that will be released after 4 weeks")
}