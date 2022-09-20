import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month

class Gigasecond() {
    lateinit var date: LocalDateTime
    constructor(localDate: LocalDate) : this() {
        date = localDate.atStartOfDay().plusSeconds(1_000_000_000)
    }

    constructor(localDateTime: LocalDateTime) : this() {
        date = localDateTime.plusSeconds(1_000_000_000)
    }
}

fun main(){
    var localDate: Gigasecond= Gigasecond(LocalDate.of(1977, Month.JUNE, 13))
    println(localDate.date)

}