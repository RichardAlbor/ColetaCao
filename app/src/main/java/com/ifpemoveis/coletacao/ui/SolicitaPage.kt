package com.ifpemoveis.coletacao.ui
import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.border

import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.sp
import com.ifpemoveis.coletacao.ui.main.MainViewModel



// importes da tela
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import com.ifpemoveis.coletacao.ui.theme.PegaPetsColors


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("ContextCastToActivity")
@Preview(showBackground = true)
@Composable
fun SolicitaPage( viewModel: MainViewModel = MainViewModel()) {
    val modifier =  Modifier
    var dogDescription by remember { mutableStateOf(TextFieldValue("")) }
    var locationDescription by remember { mutableStateOf(TextFieldValue("")) }



    Scaffold(
        containerColor  = PegaPetsColors.TelaFundo  // <- COR DO FUNDO
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp) // espaço entre a borda e a borda da tela
                .border(2.dp, PegaPetsColors.TelaBorda, shape = RoundedCornerShape(16.dp))
                .padding(24.dp) // espaço interno
        ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {

            Button(
                onClick = { /* mock: selecionar imagem */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Tirar Foto do Animal")
            }

            OutlinedTextField(
                value = dogDescription,
                onValueChange = { dogDescription = it },
                label = { Text("Descrição do Animal") },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                value = locationDescription,
                onValueChange = { locationDescription = it },
                label = { Text("Descrição do Local") },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = { /* mock: obter localização */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Obter Geolocalização")
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { /* mock: registrar */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Registrar")
            }
        }
    }}}
