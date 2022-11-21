class Robot {

    var name: String
    init {
        name = createNewName()
    }

    companion object {
        private var robotNameSaver = mutableListOf<String>()
    }

    fun reset() {
        name = createNewName()
    }

    private fun createNewName():String{
        name = RandomName().getRandomString()
        if (robotNameSaver.contains(name)) createNewName()
        else robotNameSaver.add(name)
        return name
    }
}

class RandomName (){
    companion object{
        private var robotNameSaver = mutableListOf<String>()
    }
    fun getRandomString() : String {
        val allowedCharsLetter = ('A'..'Z')
        val allowInt = ('0'..'9')
        val newName = (1..2)
            .map { allowedCharsLetter.random() }+
                (1..3).map { allowInt.random() }

        return newName.joinToString  ("")
    }
}







