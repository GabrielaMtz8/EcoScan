package com.gabriela.ecoscan.navigation

sealed class screen(val route: String) {
    object Welcome : screen("welcome")
    object Login : screen("login")
    object Registrar : screen("registrar")
    object Scan : screen("scan")
    object ResultScan : screen("resultScan")
    object Historial : screen("historial")
    object Alternativas : screen("alternativas")
}
