import java.util.*

object Pangram {
    fun isPangram(input: String): Boolean {
        if (input.isEmpty()) return false
        var hasTheLetter: Boolean = false
        val compare = input
            .toCharArray()
            .apply {sort()}
            .filterNot { it == '"'}
            .filterNot { it == ' ' }
        val abecedary = "abcdefghijklmnopqrstuvwxyz".toCharArray()
        for (letter in abecedary){
            for (letters in compare) {
                hasTheLetter = false
                if (letters.lowercaseChar() == letter) {
                    hasTheLetter = true
                    break
                }
            }
            if (!hasTheLetter) return hasTheLetter
        }
        return hasTheLetter
    }
}

fun main (){
    println(Pangram.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""))

}