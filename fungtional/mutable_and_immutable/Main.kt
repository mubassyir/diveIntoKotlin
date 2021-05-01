package fungtional.mutable_and_immutable
fun main(){
    val main = Main()
    main.main()
}
class Main {
    fun main(){
        val namaDepan = "Ahmad" //->immutable
        var namaBelakang = "Mubassyir" //->mutable
        println("$namaDepan $namaBelakang")

        namaBelakang = "Mubarok"
        println("$namaDepan $namaBelakang")
    }
}