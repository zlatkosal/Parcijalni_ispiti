fun main(args: Array<String>) {

    //Zadatak_1 Kreiraj funkciju koja kao parametre prima ime i prezime i ispisuje rezultat u formatu: ime + prezime
    println("-------------Zadatak_1----------------")
    imeIPrezime("Zlatko", "Salitrežić")

    //Zadatak_2 Kreiraj funkciju koja prima dva broja i ispisuje sve brojeve od manjeg primljenog broja do većeg
    println("-------------Zadatak_2----------------")
    ispišiBrojeve(2,12)

    //Zadatak_3 Kreiraj klasu "Vozilo" koja ima svojstva boja i godište te funkcije "vozi", "parkiraj", "ubrzaj"
    // i "zaustavi se" koje nemaju  definirano ponašanje. kreiraj klase "automobil" i "kamion" koje nasljeđuju
    // klasu "Vozilo" i definiraj proizvoljno sve metode koje su potrebne. na klasi "automobil" kreiraj funkcije
    // koje izračunavaju prosječno, najmanje i najveće godište svih kreiranih automobila. kreiraj 5 automobila i ispiši
    // prosječno, najmanje i najveće godište kreiranih automobila
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

    //Zadatak_4 Kreiraj sučelje "Divable" koje ima dvije apstraktne klase "vozi" i "stani". Kreiraj klase "Romobil"
    // i "Bicikl" koje implementiraju sučelje "Drivable" i njegove metode. Metode trebaju ispisati naziv klase +
    // "vozi/zaustavljaj" se  ovisno o klasi koja implemetira sučelje
    println("-------------Zadatak_4----------------")
    val romobil = Romobil()
    val bicikl = Bicikl()

    romobil.vozi()
    bicikl.stani()

    //Zadatak_5 Kreiraj polje i inicijaliziraj ga sa prvih 100 parnih brojeva. ispiši zbroj svih brojeva. ispiši
    // srednju vrijednost prvih 100 parnih brojeva
    println("-------------Zadatak_5----------------")
    val brojeviDoSto = IntArray(100) { (it+1) * 2 }
    val zbrojBrojeva = brojeviDoSto.sum()
    val prosjekBrojeva = brojeviDoSto.average()

    println("Zbroj prvih 100 parnih brojeva: $zbrojBrojeva")
    println("Prosjek prvih 100 parnih brojeva: $prosjekBrojeva")

}