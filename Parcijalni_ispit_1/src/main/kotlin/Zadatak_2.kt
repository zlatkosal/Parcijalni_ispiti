fun ispišiBrojeve(prviBroj: Int, drugiBroj: Int) {
    var manjBroj = minOf(prviBroj, drugiBroj)
    var veciBroj = maxOf(prviBroj, drugiBroj)
    for (i in manjBroj..veciBroj) {
        print("$i\t")
    }
    println()
}
