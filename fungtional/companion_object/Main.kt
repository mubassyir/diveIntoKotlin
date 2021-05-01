package fungtional.companion_object

fun main(){
    val main = Main()
    main.fungsiYangLain()
    Main.fungsiYangAkanDipanggil()
    println(Main.sebuahInteger)
}

class Main {
    companion object {
        val sebuahInteger:Int = 12
        fun fungsiYangAkanDipanggil(){
            println("yey fungsi dapat dipanggil tanpa instansiasi")
        }
    }
    fun fungsiYangLain(){
        println("Fungsi dipanggil")
    }
}