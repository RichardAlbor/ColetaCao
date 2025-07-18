package com.ifpemoveis.coletacao.ui


import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
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

@SuppressLint("ContextCastToActivity")
@Preview(showBackground = true)
@Composable
fun MapaPage(viewModel: MainViewModel = MainViewModel()) {
    val modifier =  Modifier
    Column(
        modifier = modifier.fillMaxSize()
            .background(Color.LightGray)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Mapa",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}