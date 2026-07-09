fun main(){
    val arr=arrayOf(5,12,2,7,3)
    var max=0;
    for(j in 0 until 5){
        if(arr[j]>max){
            max = arr[j];
        }
    }
    println(max)
}