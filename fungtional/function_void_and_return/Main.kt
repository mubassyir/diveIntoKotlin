package fungtional.function_void_and_return
fun main(){
    val main = Main()
    main.voidFunction()
    println(main.returnedFunction())
}
class Main {
    fun voidFunction(){
        println("ini void function, tidak mengembalikan nilai")
    }
    fun returnedFunction():String{
        return "Ini returned function, dimana ketika di invoke akan mengembalikan nilai tertentu"
    }
}