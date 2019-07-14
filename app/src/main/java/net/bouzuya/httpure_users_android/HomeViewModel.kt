package net.bouzuya.httpure_users_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _message = MutableLiveData<String>()

    val message: LiveData<String> = _message

    fun countUp() {
        _message.value = (_message.value ?: "") + "!"
    }
}
