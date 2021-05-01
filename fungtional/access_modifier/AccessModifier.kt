package fungtional.access_modifier

fun main(){
    val accessModifier = AccessModifier()
//    println(accessModifier.private)
//    println(accessModifier.protected)
    println(accessModifier.public)
}
open class AccessModifier {
    private val private = "variable private"
    protected val protected = " variable protected"
    val public = "variable public"
}