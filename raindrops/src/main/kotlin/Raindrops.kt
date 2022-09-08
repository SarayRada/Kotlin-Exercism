object Raindrops {

    fun convert(n: Int): String {
        if ((n%7) == 0 && (n%5) == 0 && (n%3) == 0){
            return "PlingPlangPlong"
        } else if ((n%7) == 0 && (n%5) == 0 ){
            return "PlangPlong"
        } else if ((n%7) == 0 && (n%3) == 0 ){
            return "PlingPlong"
        } else if ((n%5) == 0 && (n%3) == 0){
            return "PlingPlang"
        } else if ((n%5) == 0){
            return "Plang"
        } else if (n%3 == 0){
            return "Pling"
        } else if (n%7 == 0){
            return "Plong"
        } else {
            return  "$n"
        }
    }
}
