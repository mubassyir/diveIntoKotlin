package fungtional.array_and_list

fun main(){
    val main = Main()
    main.main()
}
class Main {
    fun main(){
//        arrayOf
        val daftarMakanan = arrayOf("Nasi Goreng","nasi rames","bakso")
        daftarMakanan.forEachIndexed {index,element->
            println("$index , $element")
        }
        daftarMakanan[2] = "nasi padang"
        daftarMakanan.forEachIndexed { index, element ->
            println("$index, $element")
        }

//        listOf
        val daftarMinuman = listOf("pepsi","Cola","es jeruk")
        daftarMinuman.forEachIndexed { index, element ->
            println("$index, $element")
        }
//        daftarMinuman[2]="air putih" -> error, element bersifat fix

    }
}