package com.sub.commit.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.sub.commit.ui.login.LoginDestination
import com.sub.commit.extensions.customComposable
import com.sub.commit.ui.theme.CommitTheme
import dagger.hilt.android.AndroidEntryPoint

// https://android-uni.tistory.com/36
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            CommitTheme {
                NavHost(navController = navController, startDestination = LoginDestination.route) {
                    customComposable(LoginDestination)
                }
            }
        }
    }


        override fun onNewIntent(intent: Intent) {
            super.onNewIntent(intent)
    //        Log.d("테스","getQueryParameter 1111 ${intent.data}")
            intent.data?.getQueryParameter("code")?.let {
                Log.d("테스", "getQueryParameter code $it")
            }

        }
}