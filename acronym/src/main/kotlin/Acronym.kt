object Acronym {
    fun generate(phrase: String): String {
        val listOfWords= phrase.split(" ", "-", "_")
        var acronym: String = ""
        for (eachWord in listOfWords){
            if (eachWord.isEmpty()) acronym
            else acronym +=  eachWord[0]
        }
        return acronym.toUpperCase()
    }
}

fun main (){
    println(Acronym.generate("Something - I made up from thin air"))
}

