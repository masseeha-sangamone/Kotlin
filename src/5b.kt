import java.io.File
fun main() {

    val lines = File("9.txt").readLines()

    val names = mutableListOf<String>()

    var subject1 = ""
    var subject2 = ""
    var subject3 = ""
    var subject4 = ""
    var subject5 = ""

    val sub1 = mutableListOf<Int>()
    val sub2 = mutableListOf<Int>()
    val sub3 = mutableListOf<Int>()
    val sub4 = mutableListOf<Int>()
    val sub5 = mutableListOf<Int>()

    val totalmarks = mutableListOf<Int>()

    val toppersSub1 = mutableListOf<String>()
    val toppersSub2 = mutableListOf<String>()
    val toppersSub3 = mutableListOf<String>()
    val toppersSub4 = mutableListOf<String>()
    val toppersSub5 = mutableListOf<String>()

    val topper = mutableListOf<String>()

    for (i in lines.indices) {

        val parts = lines[i].split(",")

        names.add(parts[0])

        val list2 = parts[3].split(":")
        subject1 = list2[0]
        sub1.add(list2[1].toInt())

        val list3 = parts[4].split(":")
        subject2 = list3[0]
        sub2.add(list3[1].toInt())

        val list4 = parts[5].split(":")
        subject3 = list4[0]
        sub3.add(list4[1].toInt())

        val list5 = parts[6].split(":")
        subject4 = list5[0]
        sub4.add(list5[1].toInt())

        val list6 = parts[7].split(":")
        subject5 = list6[0]
        sub5.add(list6[1].toInt())

        val total = sub1[i] + sub2[i] + sub3[i] + sub4[i] + sub5[i]

        totalmarks.add(total)
    }

    val maxSub1 = sub1.max()
    val maxSub2 = sub2.max()
    val maxSub3 = sub3.max()
    val maxSub4 = sub4.max()
    val maxSub5 = sub5.max()

    val maxTotal = totalmarks.max()

    for (i in names.indices) {

        if (sub1[i] == maxSub1) {
            toppersSub1.add(names[i])
        }

        if (sub2[i] == maxSub2) {
            toppersSub2.add(names[i])
        }

        if (sub3[i] == maxSub3) {
            toppersSub3.add(names[i])
        }

        if (sub4[i] == maxSub4) {
            toppersSub4.add(names[i])
        }

        if (sub5[i] == maxSub5) {
            toppersSub5.add(names[i])
        }

        if (totalmarks[i] == maxTotal) {
            topper.add(names[i])
        }
    }

    println()
    println("SUBJECT TOPPERS")
    println(" $subject1 : ${toppersSub1.joinToString(",")} with marks $maxSub1")
    println(" $subject2 : ${toppersSub2.joinToString(", ")} with marks $maxSub2")
    println(" $subject3 : ${toppersSub3.joinToString(", ")} with marks $maxSub3")
    println(" $subject4 : ${toppersSub4.joinToString(", ")} with marks $maxSub4")
    println(" $subject5 : ${toppersSub5.joinToString(", ")} with marks $maxSub5")

    println()
    println("GOLD MEDALIST is: ${topper[0]} with total marks $maxTotal")
}