fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toDouble() }
    // 座標A,Bへ0,0から距離1移動したときの座標a,bを求める
    val len = Math.sqrt(A*A+B*B)
    val a = A / len
    val b = B / len
    println("$a $b")
}
