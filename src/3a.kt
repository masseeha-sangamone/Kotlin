
import kotlin.math.abs

fun main(){
    var minuteAngle = 0.0
    var hourAngle = 0.0
    var angle = 0.0


    for(hour in 9..20){
        for(minute in 0..55 step 5) {
            minuteAngle = minute * 6.0
            hourAngle = (hour % 12) * 30 + (minute * 0.5)
            angle = abs(hourAngle - minuteAngle)
            if (angle > 180) {
                angle = 360 - angle
            }
            var minute1= minute.toString().padStart(2,'0')
            println("${hour%12}:$minute1 - $angle degrees")
        }
        println()
    }
}



