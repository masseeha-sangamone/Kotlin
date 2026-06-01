fun main(){
    for(i in 3..20){
        println("Multiplication table of $i")
        for(j in 1..10){
            println("$i x $j = "+ i*j)
        }
        println()
    }
}