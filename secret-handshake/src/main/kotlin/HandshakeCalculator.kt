object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val listOfSignals = mutableListOf<Signal>()
        val integerToBinary = Integer.toBinaryString(number)
        if (integerToBinary.length == 1 && integerToBinary.last() == '1') {
            listOfSignals.add(Signal.WINK)
        } else if (integerToBinary.length == 2) {
            when (integerToBinary.last()) {
                '1' -> listOfSignals.add(Signal.WINK)
            }
            when (integerToBinary.first()) {
                '1' -> listOfSignals.add(Signal.DOUBLE_BLINK)
            }

        } else if (integerToBinary.length == 3) {
            when (integerToBinary.last()) {
                '1' -> listOfSignals.add(Signal.WINK)
            }
            when (integerToBinary[1]) {
                '1' -> listOfSignals.add(Signal.DOUBLE_BLINK)
            }
            when (integerToBinary.first()) {
                '1' -> listOfSignals.add(Signal.CLOSE_YOUR_EYES)
            }
        } else if (integerToBinary.length == 4) {
            when (integerToBinary.last()) {
                '1' -> listOfSignals.add(Signal.WINK)
            }
            when (integerToBinary[2]) {
                '1' -> listOfSignals.add(Signal.DOUBLE_BLINK)
            }
            when (integerToBinary[1]) {
                '1' -> listOfSignals.add(Signal.CLOSE_YOUR_EYES)
            }
            when (integerToBinary.first()) {
                '1' -> listOfSignals.add(Signal.JUMP)
            }
        } else if (integerToBinary.length == 5) {
            when (integerToBinary.last()) {
                '1' -> listOfSignals.add(Signal.WINK)
            }
            when (integerToBinary[3]) {
                '1' -> listOfSignals.add(Signal.DOUBLE_BLINK)
            }
            when (integerToBinary[2]) {
                '1' -> listOfSignals.add(Signal.CLOSE_YOUR_EYES)
            }
            when (integerToBinary[1]) {
                '1' -> listOfSignals.add(Signal.JUMP)
            }
            when (integerToBinary.first()) {
                '1' -> listOfSignals.reverse()
            }
        }
        return listOfSignals.toList()
    }
}
fun main(){
    println(HandshakeCalculator.calculateHandshake(2))
}
