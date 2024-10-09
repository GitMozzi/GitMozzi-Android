package com.sub.commit.ui.login

import androidx.compose.runtime.Composable
import com.sub.commit.destination.ComposeDestination

object LoginDestination : ComposeDestination() {

    private const val LOGIN = "Login"

    override val route: String
        get() = LOGIN

    override val content: @Composable () -> Unit
        get() = {
            LoginScreen()
        }
}