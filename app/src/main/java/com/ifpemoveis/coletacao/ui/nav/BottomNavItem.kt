package com.ifpemoveis.coletacao.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Home : Route
    @Serializable
    data object Solicita : Route
    @Serializable
    data object Map : Route
    @Serializable
    data object Perfil : Route
}
sealed class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: Route)
{
    data object HomeButton :
        BottomNavItem("Início", Icons.Default.Home, Route.Home)
    data object SolicitaButton :
        BottomNavItem("Solicitação", Icons.Default.AddCircle, Route.Solicita)
    data object MapButton :
        BottomNavItem("Mapa", Icons.Default.LocationOn, Route.Map)
    data object PerfilButton :
        BottomNavItem("Perfil", Icons.Default.AccountCircle, Route.Perfil)

}