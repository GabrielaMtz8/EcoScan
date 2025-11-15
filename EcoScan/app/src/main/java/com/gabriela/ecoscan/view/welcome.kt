package com.gabriela.ecoscan.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gabriela.ecoscan.R
import com.gabriela.ecoscan.navigation.screen

@Composable
fun welcome(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.fondoplantas),
            contentDescription = "Fondo plantas",
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.1f)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.logoredondo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(220.dp) // más grande
                    .padding(bottom = 24.dp)
            )

            Text(
                text = "EcoScan te ayuda a identificar ingredientes de tus alimentos y descubrir alternativas más saludables y ecológicas.",
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 32.dp)
            )


            Button(
                onClick = { navController.navigate(screen.Login.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text("Iniciar Sesión")
            }
            OutlinedButton(
                onClick = { navController.navigate(screen.Registrar.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text("Registrarse")
            }
        }
    }
}
