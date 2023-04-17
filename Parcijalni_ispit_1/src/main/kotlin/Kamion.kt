class Kamion(boja: String, godiste: Int) : Vozilo(boja, godiste) {
    override fun ubrzaj() {
        println("Kamion ubrzava.")
    }

    override fun zaustavi() {
        println("Kamion zaustavljen.")
    }
}