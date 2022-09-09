object PigLatin {
    fun translateEach(phrase: String): String {
        val vowelsSound: List<String> = listOf("a", "e", "i", "o", "u")
        val consonant: List<Char> = listOf(
            'b',
            'c',
            'd',
            'f',
            'g',
            'h',
            'j',
            'k',
            'l',
            'm',
            'n',
            'p',
            'q',
            'r',
            's',
            't',
            'v',
            'w',
            'x',
            'y',
            'z'
        )
        val initialConsonants: String
        val wordsLast: String
        if (vowelsSound.any { phrase.startsWith(it) } || phrase.startsWith("xr") || phrase.startsWith("yt")) {
            return "${phrase}ay"

        } else if (phrase.startsWith("qu")) {
            initialConsonants = "qu"
            wordsLast = phrase.substringAfter(initialConsonants)
            return "${wordsLast}${initialConsonants}ay"

        } else if (consonant.any { phrase.startsWith("${it}qu") }) {
            initialConsonants = "${phrase.takeWhile { consonant.contains(it) }}u"
            wordsLast = phrase.substringAfter(initialConsonants)
            return "${wordsLast}${initialConsonants}ay"

        } else if (consonant.any { phrase.startsWith('y') }) {
            initialConsonants = phrase.takeWhile { consonant.contains(it) }
            wordsLast = phrase.substringAfter(initialConsonants)
            return "${wordsLast}${initialConsonants}ay"

        } else if (consonant.any { phrase.startsWith(it) }) {
            initialConsonants = phrase.takeWhile { consonant.contains(it) && it != 'y' }
            wordsLast = phrase.substringAfter(initialConsonants)
            return "${wordsLast}${initialConsonants}ay"

        }
        return "i don't understand the word"
    }

    fun translate(phrase: String): String {
        if (!phrase.contains(" ")){
            return translateEach(phrase)
        } else {
            val eachWord = phrase.split(" ")
            var newPhrase: String = ""
            var word: String
            for (each in eachWord) {
                if (each == eachWord.last()){
                    word = translateEach(each)
                    newPhrase += word
                } else {
                    word = translateEach(each)
                    newPhrase += "$word "
                }
            }
            return newPhrase
        }
    }
}
fun main (){
    println(PigLatin.translate("quick"))
}