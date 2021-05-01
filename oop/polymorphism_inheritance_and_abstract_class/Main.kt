package oop.polymorphism_inheritance_and_abstract_class

fun main() {
    var pegawai: Pegawai = Pegawai("Amar")
    //Polymorphism
    pegawai.sapa("Budi")

    pegawai = Manager("Wahyu")
    pegawai.sapa("Budi")

    pegawai = VP("Eko")
    pegawai.sapa("Budi")

    //inheritance abstract class
   val security = Security()
    security.ajakMakan("ucup","udin")
    security.cetak("ucup","Udin")
}