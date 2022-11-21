class Robot {

    var name: String
    init {
        name = returnNewName()
    }

    companion object {
        private val robotNameSaver = mutableListOf<String>()
    }

    fun reset() {
        name = returnNewName()
    }

    private fun returnNewName():String{
        name = createARandomName()
        if (robotNameSaver.contains(name)) returnNewName()
        else robotNameSaver.add(name)
        return name
    }
    private fun createARandomName() : String {
        val allowedCharsLetter = ('A'..'Z')
        val allowInt = ('0'..'9')
        val newName = (1..2)
            .map { allowedCharsLetter.random() }+
                (1..3).map { allowInt.random() }

        return newName.joinToString  ("")
    }
}








