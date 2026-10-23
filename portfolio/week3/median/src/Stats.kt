
fun median(data: List<Double>): Double{
    require(data.isNotEmpty()){
        "Dataset must be not empty"
    }

    val sorted = data.sorted()
    val middle = sorted.size/2

    return if (sorted.size % 2 == 1){
        sorted[middle]
    }
    else{
        (sorted[middle - 1]+ sorted[middle]) / 2.0
    }
}
