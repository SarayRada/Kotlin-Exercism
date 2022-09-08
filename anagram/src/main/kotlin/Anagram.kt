@Suppress("UNUSED_EXPRESSION")
class Anagram(private var word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val lettersInput = word
            .lowercase()
            .toCharArray()
            .apply { sort() }
        var wordAnagram: Set<String> = setOf()
        for (words in anagrams) {
            val anagramLetters = words
                .lowercase()
                .toCharArray()
                .apply { sort() }
            if (!word.equals(words, ignoreCase = true) && anagramLetters.contentEquals(lettersInput)) {
                wordAnagram = wordAnagram + words
            }
        }
        return wordAnagram
    }
}

