package com.example.tapago.ui.screen


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tapago.ui.components.LogoApp
import com.example.tapago.ui.components.PerfilLogin

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    passwordVisualTransformation: VisualTransformation = PasswordVisualTransformation(),
) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(

                title = {

                    Row(verticalAlignment =CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                        )  {
                      LogoApp(size = 220)

                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable{
                            /* Navegar para tela de cadastro */
                        },
                    textAlign = TextAlign.Center,
                    text = "Esqueceu a senha?",
                )
            }
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 40.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            PerfilLogin(70)
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Faça seu login",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary


            )
            Spacer(modifier = Modifier.height(15.dp))
            OutlinedTextField(
                value= email,
                onValueChange = {email=it},
                label={Text("Email")},
                singleLine = true,
                modifier = Modifier.fillMaxWidth()


            )
            Spacer(modifier =Modifier.height(12.dp))
            OutlinedTextField(
                value= password,
                onValueChange = {password=it},
                label={Text("Senha")},
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = passwordVisualTransformation,

            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Button(
                    onClick = { /* Executar login */ },
                    modifier = Modifier.weight(1f)
                        .size(35.dp)
                ) {
                    Text("Entrar")
                }

                OutlinedButton(
                    onClick = { /* Navegar para tela de cadastro */ },
                    modifier = Modifier.weight(1f)
                        .size(35.dp)
                ) {
                    Text("Cadastrar-se")
                }

            }



        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}