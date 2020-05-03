package relationsOOP.assosiation.kardinalitas.one_to_many

data class User (
    private val id: String,
    val name: String,
    val sellers: ArrayList<Seller>
)