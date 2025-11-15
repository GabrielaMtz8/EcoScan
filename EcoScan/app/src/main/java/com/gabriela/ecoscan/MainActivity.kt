package com.gabriela.ecoscan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.gabriela.ecoscan.navigation.nav
import com.gabriela.ecoscan.ui.theme.EcoScanTheme
import com.gabriela.ecoscan.viewModel.appViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoScanTheme {
                val appViewModel: appViewModel = viewModel()
                Surface(color = MaterialTheme.colorScheme.background) {
                    nav(appViewModel = appViewModel)
                }
            }
        }
    }
}


