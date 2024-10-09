package com.sub.commit.destination

import androidx.compose.runtime.Composable

abstract class ComposeDestination {

    abstract val route: String
    abstract val content: @Composable ()-> Unit
}