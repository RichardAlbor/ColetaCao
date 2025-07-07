package com.ifpemoveis.coletacao

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ifpemoveis.coletacao.ui.theme.ColetaCaoTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColetaCaoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RegisterPage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@SuppressLint("ContextCastToActivity")
@Preview(showBackground = true)
@Composable
fun RegisterPage(modifier: Modifier = Modifier) {
    var nome by rememberSaveable { mutableStateOf("") }
    var dtNasc by rememberSaveable { mutableStateOf("") }
    var endereco by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var confirma by rememberSaveable { mutableStateOf("") }
    val activity = LocalContext.current as? Activity

    Column(
        modifier = modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Registre-se:",
            fontSize = 24.sp
        )

        //Spacer(modifier = modifier.size(24.dp))

        OutlinedTextField(
            value = nome,
            label = { Text(text = "Digite o seu Nome") },
            modifier = modifier,
            onValueChange = { nome = it }
        )

        OutlinedTextField(
            value = dtNasc,
            label = { Text(text = "Digite a data de Nascimento") },
            modifier = modifier,
            onValueChange = { dtNasc = it }
        )

        OutlinedTextField(
            value = endereco,
            label = { Text(text = "Digite o seu Endereço") },
            modifier = modifier,
            onValueChange = { endereco = it }
        )

        OutlinedTextField(
            value = email,
            label = { Text(text = "Digite seu e-mail") },
            modifier = modifier,
            onValueChange = { email = it }
        )
        OutlinedTextField(
            value = password,
            label = { Text(text = "Digite sua senha") },
            modifier = modifier,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation()
        )

        OutlinedTextField(
            value = confirma,
            label = { Text(text = "Confirme sua senha") },
            modifier = modifier,
            onValueChange = { confirma = it },
            visualTransformation = PasswordVisualTransformation()
        )

        //Spacer(modifier = modifier.size(24.dp))

        Row(modifier = modifier) {
            Button(
                onClick = {
                    Toast.makeText(activity, "Registro OK!", Toast.LENGTH_LONG).show()
                    activity?.finish()
                },
                enabled = nome.isNotEmpty() && dtNasc.isNotEmpty() && endereco.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirma.isNotEmpty() && password.equals(confirma)
            ) {
                Text("Confirmar")
            }
            Button(
                onClick = { nome = ""; dtNasc = ""; endereco = ""; email = ""; password = ""; confirma = "" }
            ) {
                Text("Limpar")
            }
        }
    }
}
