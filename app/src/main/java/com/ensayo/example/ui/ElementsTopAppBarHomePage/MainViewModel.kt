package com.example.barradenavegacion.ui.theme

import androidx.lifecycle.ViewModel
import com.example.barradenavegacion.data.SearchWidgetState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MainViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(UiStateCurrent())
    val uiState: StateFlow<UiStateCurrent> = _uiState

    fun updateSearchWidgetState(newValue: SearchWidgetState){
        _uiState.update {
            it.copy(
                stateSearchBar = newValue
            )
        }
    }

    fun updateSearchTextState(newValue: String){
       _uiState.update {
           it.copy(
               searchTextState = newValue
           )
       }
    }

//    fun updateisTextFieldActive(isTextFieldActive: Boolean ){
//        _uiState.update {
//            it.copy(
//                isTextFieldActive = isTextFieldActive
//            )
//        }
//    }

}