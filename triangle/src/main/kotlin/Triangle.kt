class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    private fun areBiggerThanZero():Boolean{
        if (a.toFloat() > 0 && b.toFloat() > 0 && c.toFloat() > 0 ) return true
        throw IllegalArgumentException ()
    }
    private fun areThreeSidesSameLength():Boolean{
        return a.toFloat() == b.toFloat() && b.toFloat() == c.toFloat()
    }
    private fun atLeastTwoSidesSameLength():Boolean{
        return (a.toFloat()==b.toFloat() || b.toFloat() == c.toFloat() || c.toFloat() ==a.toFloat())
    }
    private fun allSidesAreDifferent():Boolean{
       return a.toFloat() != b.toFloat() && b.toFloat() != c.toFloat()
    }
    private fun oneSideIsNotBiggerThanTheOthers():Boolean{
        if ((a.toFloat()+b.toFloat())> c.toFloat()
            && (c.toFloat()+b.toFloat())> a.toFloat()
            && (a.toFloat()+c.toFloat())> b.toFloat()) return true
        throw IllegalArgumentException ()
    }

    val isEquilateral: Boolean = areThreeSidesSameLength() && areBiggerThanZero() && oneSideIsNotBiggerThanTheOthers()
    val isIsosceles: Boolean = atLeastTwoSidesSameLength() && areBiggerThanZero() && oneSideIsNotBiggerThanTheOthers()
    val isScalene: Boolean = allSidesAreDifferent() && areBiggerThanZero() && oneSideIsNotBiggerThanTheOthers()

}
