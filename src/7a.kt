fun main() {
    print("Enter a word: ")
    val word = readln()

    println("\nRIGHT DIAMOND")
    rightDiamond(word)

    println("\nLEFT DIAMOND")
    leftDiamond(word)

    println("\nFULL DIAMOND")
    fullDiamond(word)
}

fun rightDiamond(word: String) {

    val n = word.length

    for (i in 1..n) {
        for (j in 0 until i) {
            print("${word[j]} ")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            print("${word[j]} ")
        }
        println()
    }
}

fun leftDiamond(word: String) {
    val n = word.length
    for (i in 1..n) {
        repeat((n - i)*2) {
            print(" ")
        }
        for (j in 0 until i) {
            print("${word[j]} ")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        repeat((n - i)*2) {
            print(" ")
        }
        for (j in 0 until i) {
            print("${word[j]} ")
        }
        println()
    }
}

fun fullDiamond(word: String) {

    val n = word.length

    for (i in 1..n) {
        repeat(n - i) {
            print("  ")
        }
        for (j in 0 until i) {
            print("${word[j]} ")
            print("  ")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        repeat(n - i) {
            print("  ")
        }

        for (j in 0 until i) {
            print("${word[j]} ")
            print("  ")
        }
        println()
    }
}