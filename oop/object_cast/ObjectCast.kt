package oop.object_cast

class Laptop(val name: String)
open class HandPhone(val name: String)

fun smartCastingWithWhen(any: Any) {
    when (any) {
        is String -> println("casting string $any")
        is Int -> println("Casting integer $any")
        is Laptop -> println("Laptop merek ${any.name}")
        is HandPhone -> println("HandPhone merek ${any.name}")
        else -> println(any)
    }
}

fun main() {
    smartCastingWithWhen("Ucup")
    smartCastingWithWhen(1)
    smartCastingWithWhen(Laptop("Acer"))
    smartCastingWithWhen(HandPhone("Samsung"))
}