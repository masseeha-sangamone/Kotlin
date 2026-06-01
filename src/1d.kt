import kotlin.math.pow

/**Create a function calc2(n1, n2) to take the 2 input values,
create a list list1, append all results to this list and
return this list to the main program list1.append(sum1) list1.append(dif1)
list1.append(prd1) list1.append(div1) list1.append(div2)
list1.append(rem1) list1.append(exp1) return list1**/

fun calc2(n1:Int ,n2:Int ):MutableList<Number>{

    val sum1=n1+n2
    val dif1=n1-n2
    val prd1=n1*n2
    val div1=n1.toDouble()/n2.toDouble()
    val div2=n1/n2
    val rem1=n1% n2
    val exp1=n1.toDouble().pow(n2.toDouble())

    val list1=mutableListOf<Number>()

    list1.add(sum1)
    list1.add(dif1)
    list1.add(prd1)
    list1.add(div1)
    list1.add(div2)
    list1.add(rem1)
    list1.add(exp1)

    return list1
}

fun main(){

    println("Enter the value of 1st number: ")
    val n1 = readln().toInt()
    println("Enter the value of 2nd number: ")
    val n2 = readln().toInt()

    val list= calc2(n1,n2)
    println(list)
}