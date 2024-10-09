package com.sub.commit.ui.login

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.sub.myapplication.BuildConfig

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel = hiltViewModel()
) {
    val state by loginViewModel.state.collectAsState()

    val context = LocalContext.current


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {
            loginViewModel.intent(
                event = LoginContract.LoginEvent.ClickLoginButton
            )

            /* val intent = Intent(Intent.ACTION_VIEW, getGitHubLoginUri())
             context.startActivity(intent)*/
        })
        {
            Text(text = "Login with GitHub")
        }
    }

}
@Preview
@Composable
private fun PreviewLoginScreen() {
    LoginScreen()
}

fun getGitHubLoginUri(): Uri {
    return Uri.parse("https://github.com/login/oauth/authorize").buildUpon()
        .appendQueryParameter("client_id", BuildConfig.GITHUB_CLIENT_ID)
        .appendQueryParameter("redirect_uri", "commit://github-auth")
        .build()
}
