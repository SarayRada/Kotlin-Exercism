class Matrix(private val matrixAsString: String) {


    fun column(colNr: Int): List<Int> {
        val matrixSplit = matrixAsString.split("\n")
        val nextList = mutableListOf<Int>()
        for (numbers in matrixSplit){
            val newValue = numbers.split(" ")
            nextList.add(newValue[colNr-1].toInt())
        }
        return nextList
    }

    fun row(rowNr: Int): List<Int> {
        val matrixSplit = matrixAsString.split("\n")
        val takeARow = matrixSplit[rowNr-1].split(" ")
        return takeARow.map { it.toInt() }
    }
}
