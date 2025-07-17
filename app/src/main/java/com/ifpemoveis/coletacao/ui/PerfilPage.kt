package com.ifpemoveis.coletacao.ui


import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ifpemoveis.coletacao.ui.main.MainViewModel
import com.ifpemoveis.coletacao.ui.theme.PegaPetsColors

@SuppressLint("ContextCastToActivity")
@Preview(showBackground = true)
@Composable
fun PerfilPage(viewModel: MainViewModel = MainViewModel()) {
    val modifier = Modifier
    val backgroundColor = PegaPetsColors.TelaFundo
    val borderColor = PegaPetsColors.TelaBorda



    Scaffold(
        containerColor = backgroundColor
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp)
                .border(2.dp, borderColor, RoundedCornerShape(16.dp))
                .padding(24.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                // Foto de perfil (mocada)
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(PegaPetsColors.Highlight, RoundedCornerShape(50.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("🐶", fontSize = 40.sp)
                }

                // Nome e email
                Text("Nome do Usuário", fontSize = 22.sp, color = PegaPetsColors.TextDark)
                Text("usuario@pegapets.com", color = PegaPetsColors.TextLight)
                Text("Recife - PE", color = PegaPetsColors.TextLight)

                Spacer(modifier = Modifier.height(16.dp))

                // Botões fictícios
                Button(onClick = { /* TODO: editar perfil */ }) {
                    Text("Editar Perfil")
                }

                Button(onClick = { /* TODO: ver pets cadastrados */ }) {
                    Text("Meus Pets Cadastrados")
                }

                Button(onClick = { /* TODO: configurações */ }) {
                    Text("Configurações")
                }

                Spacer(modifier = Modifier.weight(1f))


            }
        }
    }
}