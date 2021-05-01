package oop.polymorphism_inheritance_and_abstract_class

/*
kelas harus bersifat open agar dapat diwariskan
secara default class di kotlin bersifat final
 */

open class Pegawai(val name: String) {
    open fun sapa(nama: String) {
        println("Hallo $nama, nama saya adalah ${this.name} bekerja sebagai pegawai")
    }
}

open class Manager(nama: String) : Pegawai(nama) {
     override fun sapa(nama: String) {
        println("Hallo $nama, nama saya adalah ${this.name} bekerja sebagai manager")
    }
}

class VP(name: String) : Pegawai(name) {
    override fun sapa(nama: String) {
        println("Hallo $nama,nama saya adalah ${this.name} bekerja sebagai VP")
    }
}

abstract class Employee(){
    open fun cetak(name:String, friend:String){
        println("Hallo $friend,nama saya adalah $name bekerja sebagai Security")
    }
    abstract fun ajakMakan(nama: String,friend: String)
}

class Security() : Employee() {
    override fun ajakMakan(nama: String, friend: String) {
        println("Hallo $friend,nama saya adalah $nama yok makan siang bareng")
    }
    override fun cetak(name:String,friend: String){
        super.cetak(name, friend)
    }
}
