package com.sub.commit.ui.login

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LifecycleEventEffect
import com.sub.myapplication.BuildConfig

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel = hiltViewModel()
) {
    val context = LocalContext.current


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {
            val intent = Intent(Intent.ACTION_VIEW, getGitHubLoginUri())
            context.startActivity(intent)
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
