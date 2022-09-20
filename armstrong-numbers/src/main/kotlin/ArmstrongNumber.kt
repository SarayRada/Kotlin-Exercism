object ArmstrongNumber {

    fun check(input: Int): Boolean {
        var total = 0.0
        val exponent: Int = input.toString().length
        for (number in input.toString()) {
            total += Math.pow(number.digitToInt().toDouble(), exponent.toDouble())
        }
        return total == input.toDouble()
    }
}

fun main(){
    println(ArmstrongNumber.check(153))
}
