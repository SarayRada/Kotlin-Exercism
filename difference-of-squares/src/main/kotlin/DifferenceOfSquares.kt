class Squares(n:Int) {
    private var number:Int = n
    fun sumOfSquares(): Int {
        var result: Int = 0
        for (number in number downTo 1) {
            result += (number * number)
        }
        return result
    }

    fun squareOfSum(): Int {
        var result: Int = 0
        for (number in number downTo 1) {
            result += number
        }
        return result * result
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

}
