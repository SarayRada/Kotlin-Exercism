object PigLatin {
    fun translate(phrase: String): String {
        val vowelsSound: List<String> = listOf("a", "e", "i", "o", "u", "xr", "yt")
        val consonant: List<Char> = listOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')
        if (vowelsSound.any { phrase.startsWith(it)}) {
            return "${phrase}ay"
        } else if (vowelsSound.any{phrase.}){
            return "ay"
        } else if (consonant.any{phrase.startsWith(it)}){
            val phraseNotFirst = phrase.substring(1, phrase.length)
            return "${phraseNotFirst}${phrase.first()}ay"
        }

        return "lullaby"
    }
}
fun main (){
    println(PigLatin.translate("rala"))
}