package pe.edu.upc.easystore.features.auth.domain

data class User(
    val id: Int,
    val username: String,
    val firstName: String,
    val lastName: String,
    val image: String
)
