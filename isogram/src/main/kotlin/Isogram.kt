object Isogram {
    fun isIsogram(input: String): Boolean {
        val myInputToChar = input.lowercase().toCharArray().filter { it -> it.isLetter() }
        val myInputWithNotRepeatable = myInputToChar.distinct()
        return myInputToChar.size == myInputWithNotRepeatable.size
    }
}
fun main(){
    println(Isogram.isIsogram("ghsyhhs"))
}
