class StringFilter {
    fun containsInString(str: String): Boolean {
        return str.contains("%")
    }
    fun filterNumber(str: String, number: Int): List<String> {
        return str
            .split(",")
            .filter { Integer.parseInt(it) > number }
            .map { it }
    }
}