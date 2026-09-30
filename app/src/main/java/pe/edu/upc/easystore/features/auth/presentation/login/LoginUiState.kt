package pe.edu.upc.easystore.features.auth.presentation.login

import pe.edu.upc.easystore.features.auth.domain.User

data class LoginUiState(
    val username: String = "",
    val password: String = "",
    val isPasswordHidden: Boolean = true,
    val user: User? = null,
    val isAuthenticated: Boolean = false,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
