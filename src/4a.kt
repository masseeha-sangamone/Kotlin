fun main() {
    val count = 100
    val prisons = MutableList(count) { "C" }
    val lucky = mutableListOf<Int>()

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
    }
    println("$lucky are the lucky prisoners")
}