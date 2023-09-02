fun main() {
    val n = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map { it.toInt() }

    // println(n)
    // println(A)

    A.forEachIndexed { i,  a ->
        if (a % 2 == 0) {
            print(a)
            if (i != A.size - 1) {
                print(" ")
            }
        }
    }
    println()
}