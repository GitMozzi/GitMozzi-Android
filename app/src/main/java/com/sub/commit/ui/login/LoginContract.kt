package com.sub.commit.ui.login

import com.sub.commit.common.mvi.UiEvent
import com.sub.commit.common.mvi.UiSideEffect
import com.sub.commit.common.mvi.UiState

object LoginContract {

    /**
     * 현재 화면에 필요한 상태들을 모아둔다.
     */
    data class LoginState(
        val isLoading: Boolean = false,
        val isLoginSuccess: Boolean = false,
    ) : UiState

    /**
     * 액션 정의
     */
    sealed interface LoginEvent : UiEvent {
        data object ClickLoginButton : LoginEvent
    }

    /**
     * SideEffect로 발생되는 이벤트를 정의
     */
    sealed interface LoginSideEffect : UiSideEffect {
        data class ShowToast(val msg: String) : LoginSideEffect
    }
}