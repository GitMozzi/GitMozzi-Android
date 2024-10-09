package com.sub.commit.extensions

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.sub.commit.destination.ComposeDestination

fun NavGraphBuilder.customComposable(composeDestination: ComposeDestination) =
    this.composable(composeDestination.route) {
        composeDestination.content()
    }
