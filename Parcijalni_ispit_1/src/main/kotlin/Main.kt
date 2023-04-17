fun main(args: Array<String>) {

    //Zadatak_1
    println("-------------Zadatak_1----------------")
    imeIPrezime("Zlatko", "Salitrežić")

    //Zadatak_2
    println("-------------Zadatak_2----------------")
    ispišiBrojeve(2,12)

    //Zadatak_3
    println("-------------Zadatak_3----------------")
    val BMW = Automobil("bijela", 2015)
    val Audi = Automobil("žuta", 2011)
    val WV = Automobil("plava", 2016)
    val Mercedes = Automobil("crvena", 2008)
    val Alfa = Automobil("crna", 2013)

    Audi.vozi()
    Alfa.zaustavi()

    println("Prosječno godište auta: ${Automobil.prosjecnoGodiste()}")
    println("Najmanje godište auta: ${Automobil.najmanjeGodiste()}")
    println("Najveće godište auta: ${Automobil.najveceGodiste()}")

    //Zadatak_4
    println("-------------Zadatak_4----------------")
    val romobil = Romobil()
    val bicikl = Bicikl()

    romobil.vozi()
    bicikl.stani()

    //Zadatak_5
    println("-------------Zadatak_5----------------")
    val brojeviDoSto = IntArray(100) { it * 2 }
    val zbrojBrojeva = brojeviDoSto.sum()
    val prosjekBrojeva = brojeviDoSto.average()

    println("Zbroj prvih 100 parnih brojeva: $zbrojBrojeva")
    println("Prosjek prvih 100 parnih brojeva: $prosjekBrojeva")

}