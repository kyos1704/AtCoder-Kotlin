fun convert(element: Int): Char {
    return if (element == 0) {
        '.'
    } else {
        ('A'.toInt() + element - 1).toChar()
    }
}

fun main() {
    val (H, W) = readLine()!!.split(" ").map { it.toInt() }
    val A = List(H) { readLine()!!.split(" ").map { it.toInt() } }

    //println("H: $H, W: $W")
    //println(A)

    A.forEach { r ->
        val result = StringBuilder()
        r.forEach { e -> result.append(convert(e)) }
        println(result.toString())
    }

}
