package fungtional.enum_sealed_data_class

fun main(){
    val dataClass= DataClass(1,"John","programmer")
    print(dataClass)
}
fun print (dataClass: DataClass){
    println(dataClass)
}

data class DataClass(
    val id:Int=0,
    val name:String?=null,
    val job:String?=null
)
