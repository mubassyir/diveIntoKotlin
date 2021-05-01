package fungtional.variables_and_data_type

fun main(){
    val main = Main()
    println(main.tipeDataFloat)
    println(main.tipeDataFloat)
    println(main.tipeDataString)
    main.tipeDataFloat = 3.7
    println(main.tipeDataFloat)
}
class Main {
    //variable dan tipe data
       val tipeDataString:String = "asd"
       val tipeDataInteger = 123
       var tipeDataFloat = 0.1 // -> mutable variable
}