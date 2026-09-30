package pe.edu.upc.easystore.features.auth.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import pe.edu.upc.easystore.features.auth.application.LoginUseCase
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val signIn: LoginUseCase) : ViewModel() {
    private val _state = MutableStateFlow(LoginUiState())
    val state: StateFlow<LoginUiState> = _state.asStateFlow()

    fun login() {
        viewModelScope.launch(Dispatchers.IO) {

            _state.update { currentState ->
                currentState.copy(isLoading = true)
            }
            val result = signIn(_state.value.username, _state.value.password)

            result
                .onSuccess { user ->
                    _state.update { currentState ->
                        currentState.copy(
                            isLoading = false,
                            user = user,
                            isAuthenticated = true
                        )
                    }
                }
                .onFailure { exception ->
                    _state.update { currentState ->
                        currentState.copy(
                            isLoading = false,
                            errorMessage = exception.message
                        )
                    }
                }
        }
    }

    fun onUsernameChange(username: String) {
        _state.update { currentState ->
            currentState.copy(username = username)
        }
    }

    fun onPasswordChange(password: String) {
        _state.update { currentState ->
            currentState.copy(password = password)
        }
    }

    fun togglePasswordVisibility() {
        _state.update { currentState ->
            currentState.copy(isPasswordHidden = !currentState.isPasswordHidden)
        }
    }
}