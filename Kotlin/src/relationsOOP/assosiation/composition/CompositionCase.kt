package relationsOOP.assosiation.composition

fun main() {
    val selebgram = ArrayList<User>()
    selebgram.add(User("456", "Thea Bernice", Address(12, "Jakarta Utara")))
    selebgram.add(User("342", "Kezia Clarita", Address(43, "Jakarta Utara")))
    selebgram.add(User("174", "Brigitta Tiffany", Address(69, "Tangerang")))
    selebgram.add(User("353", "Gabriella Eka Putri", Address(21, "Jakarta Pusat")))
    selebgram.add(User("908", "Amarissa Florencia", Address(90, "Bekasi")))

    selebgram.forEach {
        println(it.name+" \t "+it.address.location)
    }
}