package com.shegs.profiledetails.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shegs.profiledetails.ui.screens.GithubWebViewScreen
import com.shegs.profiledetails.ui.screens.ProfileScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "profileScreen"){
        composable("profileScreen"){
            ProfileScreen(navController)
        }

        composable("githubScreen"){
            GithubWebViewScreen()
        }
    }


}
