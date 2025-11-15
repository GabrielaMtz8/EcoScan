package com.gabriela.ecoscan.viewModel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class appViewModel : ViewModel() {

    // Estado de sesión
    var isLoggedIn by mutableStateOf(false)
        private set

    // Datos del usuario
    var nombre by mutableStateOf("")
        private set
    var apellido by mutableStateOf("")
        private set
    var correo by mutableStateOf("")
        private set

    // Login simulado (en una app real iría a Firebase o API)
    fun login(email: String, password: String): Boolean {
        return if (email.isNotBlank() && password.isNotBlank()) {
            correo = email
            isLoggedIn = true
            true
        } else {
            false
        }
    }

    // Registro simulado
    fun registrar(nombre: String, apellido: String, correo: String, password: String): Boolean {
        return if (nombre.isNotBlank() && apellido.isNotBlank() && correo.isNotBlank() && password.isNotBlank()) {
            this.nombre = nombre
            this.apellido = apellido
            this.correo = correo
            isLoggedIn = true
            true
        } else {
            false
        }
    }

    // Cerrar sesión
    fun logout() {
        isLoggedIn = false
        nombre = ""
        apellido = ""
        correo = ""
    }
}
