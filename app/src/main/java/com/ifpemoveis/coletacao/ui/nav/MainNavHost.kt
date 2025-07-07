package com.ifpemoveis.coletacao.ui.nav


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ifpemoveis.coletacao.ui.HomePage
import com.ifpemoveis.coletacao.ui.MapaPage
import com.ifpemoveis.coletacao.ui.PerfilPage
import com.ifpemoveis.coletacao.ui.SolicitaPage
import com.ifpemoveis.coletacao.ui.main.MainViewModel


@Composable
fun MainNavHost(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(navController, startDestination = Route.Home) {
        composable<Route.Home>     { HomePage()     }
        composable<Route.Solicita> { SolicitaPage() }
        composable<Route.Map>      { MapaPage()     }
        composable<Route.Perfil>   { PerfilPage()   }
    }
}