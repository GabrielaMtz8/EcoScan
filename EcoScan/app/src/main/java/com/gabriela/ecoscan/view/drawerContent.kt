package com.gabriela.ecoscan.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gabriela.ecoscan.R
import com.gabriela.ecoscan.navigation.screen

@Composable
fun drawerContent(navController: NavController, closeDrawer: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.5f)
            .background(Color(0x8032CD32))
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.logoredondo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(8.dp)
        )

        Spacer(Modifier.height(20.dp))

        TextButton(onClick = { navController.navigate(screen.Scan.route); closeDrawer() }) {
            Text("Escanear", color = Color.Black)
        }
        TextButton(onClick = { navController.navigate(screen.Historial.route); closeDrawer() }) {
            Text("Historial", color = Color.Black)
        }
        TextButton(onClick = { navController.navigate(screen.Alternativas.route); closeDrawer() }) {
            Text("Alternativas", color = Color.Black)
        }

        Spacer(Modifier.weight(1f))

        TextButton(onClick = { navController.navigate(screen.Login.route); closeDrawer() }) {
            Text("Cerrar Sesión", color = Color.Black)
        }
    }
}
