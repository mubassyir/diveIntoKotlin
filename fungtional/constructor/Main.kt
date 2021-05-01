package fungtional.constructor

fun main(){
    val main = Main("Assyir",27)

    //constructor dapat dipanggil sebagai sebuah properti dai class yang lain
    val marucup = Main("Ucup",27)
    println(marucup.usia)
    println(marucup.nama)
}

class Main(val nama: String = "Ahamd", val usia: Int = 21){
}