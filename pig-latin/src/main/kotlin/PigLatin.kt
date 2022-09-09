object PigLatin {
    fun translate(phrase: String): String {
        val vowelsSound: List<String> = listOf("a", "e", "i", "o", "u")
        val consonant: List<Char> = listOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')

        if (vowelsSound.any { phrase.startsWith(it)} || phrase.startsWith("xr") || phrase.startsWith("yt")) {
            return "${phrase}ay"
        } else if (consonant.any{phrase.startsWith(it)|| phrase.startsWith("qu")}){
            val initialConsonants: String
            val wordsLast: String
                if (phrase.startsWith("qu")) {
                    initialConsonants = "qu"
                    wordsLast = phrase.substringAfter(initialConsonants)
                } else {
                    initialConsonants = phrase.takeWhile {consonant.contains(it)} 
                    wordsLast = phrase.substringAfter(initialConsonants)
                }
            return "${wordsLast}${initialConsonants}ay"
            }
        return "lullaby"
    }
}
fun main (){
    println(PigLatin.translate("ytry"))
}