fun main(){
    var (x, y) = List(3) { 
        val (xi, yi) = readLine()!!.split(" ").map { it.toInt() }
        Pair(xi, yi)
    }.unzip()

    //println(x)
    //println(y)
    
    
    var ansX = 0
    x.groupingBy { it}.eachCount().forEach{(v,c)->
        if(c==1){
            ansX = v
        }
    }
    var ansY = 0
    y.groupingBy { it }.eachCount().forEach{(v,c)->
    if(c==1){
        ansY = v
    }}

    println(ansX.toString() + " " + ansY.toString())

}