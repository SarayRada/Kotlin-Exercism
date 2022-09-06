import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length == rightStrand.length) {
            var difference = 0
            for (item in leftStrand.indices) {
                if ((leftStrand[item] != rightStrand[item])) {
                    difference += 1
                }
            }
            return difference
        }
        throw IllegalArgumentException("left and right strands must be of equal length")
    }
}