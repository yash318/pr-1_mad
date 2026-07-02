fun main(){
    print("enter number1: ")
    val num1=readln().toInt()

    print("enter number2: ")
    val num2=readln().toInt()

    print("addation of two num is : ")
    println(add(num1,num2))

    print("substraction of two num is : ")
    println(sub(num1,num2))

    print("multiplaction of two num is : ")
    println(mult(num1,num2))

    print("divition of two num is : ")
    println(div(num1,num2))

}
fun add(num1:Int,num2:Int) : Int{return num1+num2}
fun sub(num1:Int,num2:Int) : Int{return num1-num2}
fun mult(num1:Int,num2:Int) : Int{return num1*num2}
fun div(num1:Int,num2:Int) : Int{return num1/num2}