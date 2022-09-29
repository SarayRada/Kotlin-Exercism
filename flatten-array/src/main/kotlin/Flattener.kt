object Flattener {

    fun flatten(source: Collection<Any?>): List<Any> {
        val newSource = mutableListOf<Any>()
        for (element in source) {
            if (element is Int) newSource.add(element)
            if (element is List<*>){
                val newList =flatten(element)
                    flatten(element)
                for (each in newList) newSource.add(each)
            }
        }
        return newSource
    }
}

