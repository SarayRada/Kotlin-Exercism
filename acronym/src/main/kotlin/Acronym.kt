object Acronym {
    fun generate(phrase: String): String {
        val listOfWords= phrase.split(" ", "-", "_")
        var acronym: String = ""
        for (eachWord in listOfWords){
            if (eachWord.isNotEmpty()) acronym += eachWord[0]
        }
        return acronym.toUpperCase()
    }
}

