import kotlin.properties.Delegates

data class Year(val year: Int) {
    var isLeap: Boolean = year%4 == 0 &&
            (year%100 != 0 ||
                    (year%100 == 0
                            && year%400 == 0))
}
