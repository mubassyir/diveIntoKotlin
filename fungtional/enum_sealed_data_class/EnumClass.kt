package fungtional.enum_sealed_data_class

enum class EnumClass() {
    EASY,
    MEDIUM,
    HARD,
    EXPERT;
}

fun main(){
    val easy = EnumClass.valueOf("EASY")
    println(easy)
}

