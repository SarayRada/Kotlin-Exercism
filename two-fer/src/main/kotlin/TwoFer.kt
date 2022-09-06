fun twofer(name: String): String {
    return if (name.isEmpty()){
        "One for you, one for me."
    } else {
        "One for $name, one for me."
    }
}
