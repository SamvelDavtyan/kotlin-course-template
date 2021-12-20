enum class PhoneType {
    HOME,
    WORK,
    PERSONAL
}

sealed class Contact {
    data class PhoneNumber(val number: String, val type: PhoneType) : Contact()
    data class Email(val email: String) : Contact()
    data class Messenger(val name: String, val id: Int) : Contact()
}

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val contactList: List<Contact>
)

fun main() {
    val user1 = User("Самвел", "Давтян", 20, listOf(
        Contact.PhoneNumber("+78005553535", PhoneType.PERSONAL),
        Contact.Email("s.davtyan11@mail.ru"),
        Contact.Messenger("Самвел", 1)
    ))
    val user2 = User("Станислав", "Черчесов",45, listOf(
        Contact.PhoneNumber("4335587", PhoneType.HOME),
        Contact.Email("cherches@gmail.com"),
        Contact.Messenger("Станислав", 2)
    ))
    val user3 = User("Арсений", "Нагайцев", 26, listOf(
        Contact.PhoneNumber("+79999999999", PhoneType.WORK),
        Contact.Email("buratino@mail.ru"),
        Contact.Messenger("Арсений", 3)
    ))
    val users: List<User> = listOf(user1, user2, user3)

    println(users)
}