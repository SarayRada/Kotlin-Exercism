object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val listOfSignals = mutableListOf<Signal>()
        val integerToBinary = Integer.toBinaryString(number)
        when (integerToBinary.last()) {
            '1' -> listOfSignals.add(Signal.WINK)
        }
        if ((integerToBinary.length > 1) && integerToBinary.takeLast(2).first() == '1')
            listOfSignals.add(Signal.DOUBLE_BLINK)
        if ((integerToBinary.length > 2) && integerToBinary.takeLast(3).first() == '1')
            listOfSignals.add(Signal.CLOSE_YOUR_EYES)
        if ((integerToBinary.length > 3) && integerToBinary.takeLast(4).first() == '1')
            listOfSignals.add(Signal.JUMP)
        if ((integerToBinary.length > 4) && integerToBinary.takeLast(5).first() == '1')
            listOfSignals.reverse()
        return listOfSignals.toList()
    }
}
