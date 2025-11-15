package com.gabriela.ecoscan.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.gabriela.ecoscan.view.*
import com.gabriela.ecoscan.viewModel.appViewModel

@Composable
fun nav(navController: NavHostController = rememberNavController(), appViewModel: appViewModel) {
    NavHost(navController = navController, startDestination = screen.Welcome.route) {
        composable(screen.Welcome.route) { welcome(navController) }
        composable(screen.Login.route) { login(navController, appViewModel) }
        composable(screen.Registrar.route) { registrar(navController, appViewModel) }
        composable(screen.Scan.route) { scan(navController) }
        composable(screen.ResultScan.route) { resultScan(navController) }
        composable(screen.Historial.route) { historial(navController) }
        composable(screen.Alternativas.route) { alternativas(navController) }
    }
}

