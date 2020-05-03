package relationsOOP.assosiation.kardinalitas.one_to_many

fun main() {
    val user = ArrayList<User>()

    // Add User 1
    val sellerUser01 = ArrayList<Seller>()
    sellerUser01.add(Seller(1, "Potato 1 Kg"))
    sellerUser01.add(Seller(2, "Fresh Milk 1 L"))
    sellerUser01.add(Seller(3, "Chicken 500 g"))
    user.add(User("2314", "Kelvin Herwanda Tandrio", sellerUser01))

    // Add User 2
    val sellerUser02 = ArrayList<Seller>()
    sellerUser02.add(Seller(1, "Chitato 5 Pack"))
    sellerUser02.add(Seller(2, "PotaBee 3 Pack"))
    user.add(User("4532", "Andre Kurniawan", sellerUser02))

    // Add User 3
    val sellerUser03 = ArrayList<Seller>()
    sellerUser03.add(Seller(1, "Apple 1 Kg"))
    sellerUser03.add(Seller(2, "Orange 1 Kg"))
    sellerUser03.add(Seller(3, "Dragon Fruit 2 Kg"))
    sellerUser03.add(Seller(4, "Lemon 500 g"))
    user.add(User("2156", "Thea Bernice", sellerUser03))

    user.forEach {
        print(it.name+" \t ")
        it.sellers.forEach { seller ->
            print(seller.name+" | ")
        }
        println()
    }
}