package com.sub.commit.ui.login

import com.sub.commit.common.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() :
    BaseViewModel<LoginContract.LoginState, LoginContract.LoginEvent, LoginContract.LoginSideEffect>() {

    override fun createInitialState(): LoginContract.LoginState {
        return LoginContract.LoginState()
    }

    override suspend fun handleEvent(event: LoginContract.LoginEvent) {
        when (event) {
            is LoginContract.LoginEvent.ClickLoginButton -> {
                // updateNumber(operator = +1, toastMsg = "add")
            }
        }
    }

    /*   private fun updateNumber(operator: Int, toastMsg: String) {
           reduce { copy(number = state.value.number + operator) }
           postSideEffect(SignUpContract.SignUpSideEffect.ShowToast(toastMsg))
       }*/
}
