package com.almiga.chirp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.almiga.chirp.navigation.DeepLinkListener
import com.almiga.chirp.navigation.NavigationRoot
import com.almiga.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    DeepLinkListener(navController)

    ChirpTheme {
        NavigationRoot(navController)
    }
}