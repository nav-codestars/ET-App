package com.example.emergingtechnology

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.emergingtechnology.ui.theme.EmergingTechnologyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmergingTechnologyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    fun onNavigate(route:String) = navController.navigate(route)
                    NavHost(
                        startDestination = "login",
                        navController = navController,
                    ) {
                        composable("login") { SignUp(onNavigate = ::onNavigate) }
                        composable("tlist") {
                            TechnologyList(::onNavigate)
                        }
                        composable("tpage/{id}", arguments = listOf(navArgument("id") { type = NavType.IntType})) {
                            val id = it.arguments?.getInt("id") ?: 0
                            TechnologyPage(id)
                        }
                    }
                }
            }
        }
    }
}
