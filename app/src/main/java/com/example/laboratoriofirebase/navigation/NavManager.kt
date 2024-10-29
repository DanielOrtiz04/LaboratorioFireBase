package com.example.laboratoriofirebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.laboratoriofirebase.view.login.TabsView
import com.example.laboratoriofirebase.view.notas.HomeView
import com.example.laboratoriofirebase.viewmodel.LoginViewModel


@Composable
fun NavManager (loginViewModel : LoginViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            TabsView(navController = navController, loginViewModel = loginViewModel )
        }
        composable("register"){
            HomeView(navController = navController)

        }
    }
}

