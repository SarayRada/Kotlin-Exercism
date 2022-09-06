object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var difference: Int = 0
        for (item in leftStrand){
           if ((leftStrand[item] != rightStrand[item]) && (leftStrand.length == rightStrand.length)) {
               var += 1
           } else if (leftStrand.length != rightStrand.length){
               return "left and right strands must be of equal length"
           }
       }
        return difference
    }
}
