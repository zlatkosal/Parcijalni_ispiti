class Automobil(boja: String, godiste: Int) : Vozilo(boja, godiste) {
    companion object {
        val listaAutomobila = mutableListOf<Automobil>()
        fun prosjecnoGodiste(): Double {
            return listaAutomobila.map { it.godiste }.average()
        }

        fun najmanjeGodiste(): Int {
            return listaAutomobila.map { it.godiste }.min()
        }

        fun najveceGodiste(): Int {
            return listaAutomobila.map { it.godiste }.max()
        }
    }

    init {
        listaAutomobila.add(this)
    }

    override fun vozi() {
        println("Automobil vozi.")
    }

    override fun parkiraj() {
        println("Automobil parkiran.")
    }
}