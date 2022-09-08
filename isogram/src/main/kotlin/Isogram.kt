object Isogram {
    fun isIsogram(input: String): Boolean {
        val onlyLetters = input
            .lowercase()
            .toCharArray()
            .filter { it.isLetter() }
        val nonRepeatedLetters = onlyLetters.distinct()
        return onlyLetters.size == nonRepeatedLetters.size
    }
}
