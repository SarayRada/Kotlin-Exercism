object WordCount {
    fun phrase(phrase: String): MutableMap<String, Int>{
        val newPhrase = makePhrase(phrase)
        newPhrase.removeIf{it == ""}
        return makeAmap(newPhrase)
    }
}
fun testerFirstChar(phrase: String):String{
    if (phrase.first() == ','){
        return phrase.substring(1, (phrase.length-1))
    }
    return phrase
}
fun testerLastChar(phrase: String):String{
    var newPhrase = ""
    return when (phrase.last()){
        '.' -> phrase.substring(0, (phrase.length-1))
        '\''-> phrase.substring(0, (phrase.length-1))
        else -> phrase
    }
}
fun splitThePhrase(phrase:String):MutableList<String>{
    return phrase.lowercase()
        .trim()
        .replace(", ", ",")
        .replace(". ", ",")
        .replace(": ", ":")
        .replace(" '",",")
        .replace("' ", ",")
        .replace("   ", ",")
        .split(' ', ',', ':','.','\n')
        .toMutableList()
}
fun makePhrase (phrase:String): MutableList<String>{
    var newPhraseList = testerFirstChar(phrase)
    newPhraseList = testerLastChar(newPhraseList)
    return splitThePhrase(newPhraseList)

}
fun makeAmap (list:MutableList<String>): MutableMap<String, Int>{
    val returnMap: MutableMap<String, Int> = mutableMapOf()
    for (words in list) {
        var cantidad = 0
        for (word in list){
            if (word == words) cantidad++
        }
        returnMap[words.strip()
            .takeWhile{
                it.isLetterOrDigit()||
                        (it==('\''))}] = cantidad
    }
    return returnMap
}