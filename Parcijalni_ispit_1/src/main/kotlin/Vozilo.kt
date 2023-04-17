open class Vozilo(val boja: String, val godiste: Int) {
    open fun vozi() {
        println("Vozilo vozi.")
    }

    open fun parkiraj() {
        println("Vozilo parkirano.")
    }

    open fun ubrzaj() {
        println("Vozilo ubrzava.")
    }

    open fun zaustavi() {
        println("Vozilo zaustavljeno.")
    }
}