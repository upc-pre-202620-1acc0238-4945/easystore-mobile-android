package pe.edu.upc.easystore.features.cart.presentation.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import pe.edu.upc.easystore.features.cart.application.GetCartUseCase
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(private val getCart: GetCartUseCase) : ViewModel() {

    private val _state = MutableStateFlow(CartUiState())
    val state: StateFlow<CartUiState> = _state.asStateFlow()

    init {
        loadCart()
    }

    fun loadCart() {
        viewModelScope.launch(Dispatchers.IO) {

            _state.update { currentState ->
                currentState.copy(isLoading = true)

            }
            val result = getCart()

            result
                .onSuccess { cart ->
                    _state.update { currentState ->
                        currentState.copy(isLoading = false, cart = cart)
                    }
                }
                .onFailure { exception ->
                    _state.update { currentState ->
                        currentState.copy(isLoading = false, errorMessage = exception.message)
                    }

                }
        }

    }

}