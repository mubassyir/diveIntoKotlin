package fungtional.enum_sealed_data_class

sealed class Operasi(val name:String)
class Plus : Operasi("Plus")
class Minus : Operasi("Minus")

fun operasi(params1:Int,params2:Int,operasi: Operasi):Int{
    return when(operasi){
        is Plus -> params1 + params2
        is Minus -> params1 - params2
    }
}

fun main(){
    println(operasi(4,5,Plus()))
    println(operasi(4,2,Minus()))
}


