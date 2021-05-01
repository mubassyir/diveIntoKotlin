package oop.encapsulation


fun main(){
    val pubicClass =PublicClass()
    pubicClass.publicFunctionInOpenClass()
    /*
    tidak dapat diakses
    openClass.privateFunctionInOpenClass()
    openClass.protectedFunctionInsideOpenFunction()
     */

    //Kelas private hanya dapat diakses dari file yang sama
    val privateClass = PrivateClass()
    privateClass.publicFunctionInPrivateClass()
//    val independentPrivateClass = IndependentPrivateClass()

    //Internal dapat diakses dari mana saja kecuali dari modul yang berbeda
    val internalClass = InternalClass()
    internalClass.publicFunctionInsideInternalClass()

    val other = Other()
    other.testing()
}

open class PublicClass{

    //fungsi dan kelas dapat diakses dari luar
    fun publicFunctionInOpenClass(){
        println("ini adalah fungsi openFunctionInOpenClass")
    }
    private fun privateFunctionInOpenClass(){
        println("ini adalah fungsi privateFunctionInOpenClass")
    }

    protected fun protectedFunctionInsideOpenFunction(){
        println("ini adalah fungsi protectedFunctionInsideOpenFunction")
    }
}

private class PrivateClass{

    init {
        //Semua fungsi dapat dipanggil dalam kelas yang sama
        publicFunctionInPrivateClass()
        privateFunctionInPrivateClass()
    }
    fun publicFunctionInPrivateClass(){
        println("ini adalah openFunctionInPrivateClass ")
    }
    private fun privateFunctionInPrivateClass(){
        println("ini adalah privateFunctionInPrivateClass")
    }
}

internal class InternalClass{
    fun publicFunctionInsideInternalClass(){
        println("ini adalah openFunctionInsideInternalClass")
    }
}

open class Modifier(){
    protected val protectedVariable = "Protected variable"
    private val privateVariable = "private variable"
    internal val internalVariable = "internalVariable"
}

class Other:Modifier(){
    fun testing(){
        //semua modifier dapat diakses kecuali private
        println(protectedVariable)
//        println(privateVariable)
        println(internalVariable)
        println(protectedVariable)
    }
}