open class Car (var model:String="") {
    var price:Double=0.0
    constructor(p:Double,m:String):this(m){
        price=p
    }
}
class Suzuki(m:String):Car(m){

}
fun main(){
    val c1=Car(p=7000000.0,m="BMW")
    println("car model is : ${c1.model}")
    println("car price is : ${c1.price}")

    val s1=Suzuki("c1")
    println("s1 model is : ${s1.model}")
}