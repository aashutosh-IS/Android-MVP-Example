package com.ex.crm.Login;

import android.content.Context;

import com.ex.crm.Login.LoginModel.LoginDTO;
public interface ILogin {

    interface View {

        void init();

        void initClicks();


        Context getContext();

        void showLoading();

        void hideLoading();

        void showErrorMessages(String error);

        void goToMainActivity();

    }

    interface Presenter {

        void created();

        void saveDataToPreference(LoginDTO loginDTO);

        void loginButtonClick(String username, String password);

    }
}
