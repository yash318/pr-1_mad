fun main(){
    print("enter number: ")
    val num=readln().toInt()

    print("factorial of given number is : ")
    println(fact(num))
}

fun fact(n:Int):Int{
    if(n==0 || n==1)
        return 1
    else
        return fact(n-1) * n
}