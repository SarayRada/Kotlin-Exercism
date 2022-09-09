object PigLatin {
    fun translator(phrase: String): String {
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
        if (vowelsSound.any { phrase.startsWith(it) } ||
            phrase.startsWith("xr") ||
            phrase.startsWith("yt")) {
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

        }
        initialConsonants = phrase.takeWhile { consonant.contains(it) && it != 'y' }
        wordsLast = phrase.substringAfter(initialConsonants)
        return "${wordsLast}${initialConsonants}ay"


    }

    fun translate(phrase: String): String {
        if (!phrase.contains(" ")){
            return translator(phrase)
        } else {
            val phraseSeparated = phrase.split(" ")
            var phrasePigLatin: String = ""
            var word: String
            for (eachWord in phraseSeparated) {
                if (eachWord == phraseSeparated.last()){
                    word = translator(eachWord)
                    phrasePigLatin += word
                } else {
                    word = translator(eachWord)
                    phrasePigLatin += "$word "
                }
            }
            return phrasePigLatin
        }
    }
}
fun main (){
    println(PigLatin.translate("quick"))
}