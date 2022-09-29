object Flattener {

    fun flatten(source: Collection<Any?>): List<Any> {
        val newSource = mutableListOf<Any>()
        for (element in source) {
            if (element is Int) newSource.add(element)
            if (element is List<*>){
                for (each in flatten(element)) newSource.add(each)
            }
        }
        return newSource
    }
}

