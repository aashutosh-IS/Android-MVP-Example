package com.ex.crm.Login.Presenter;


import android.util.Log;

import com.ex.crm.Login.ILogin;
import com.ex.crm.Login.LoginModel.LoginDTO;
import com.ex.crm.Login.LoginModel.User;
import com.ex.crm.Network.ApiClient;
import com.ex.crm.Network.IEndpointApi;
import com.ex.crm.Utils.AppConstants;
import com.ex.crm.Utils.GsonUtli;
import com.ex.crm.Utils.SharedPreferenceUtil;

import java.io.IOException;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginPresenter implements ILogin.Presenter {

    private ILogin.View view;

    public LoginPresenter(ILogin.View view) {

        this.view = view;
    }

    @Override
    public void created() {

        view.init();
        view.initClicks();
    }


    @Override
    public void loginButtonClick(String email, String password) {

        view.showLoading();
        IEndpointApi retrofitApi = ApiClient.getApiClient().create(IEndpointApi.class);
        User user = new User();
        user.setUsername(email);
        user.setPassword(password);
        Call<LoginDTO> call = retrofitApi.Login(user);
        call.enqueue(new Callback<LoginDTO>() {
            @Override
            public void onResponse(Call<LoginDTO> call, Response<LoginDTO> response) {

                LoginDTO apiResponse = response.body();
                if (response.isSuccessful() && response.body() != null) {
                    if (apiResponse != null) {
                        saveDataToPreference(apiResponse);
                        Log.d("RES", "onResponse: "+ GsonUtli.toString(apiResponse));
                        view.goToMainActivity();

                    }
                    view.hideLoading();
                } else {
                    view.hideLoading();
                    try {
                        if (response.errorBody() != null) {
                            view.showErrorMessages(response.errorBody().string());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }

            @Override
            public void onFailure(Call<LoginDTO> call, Throwable t) {
                view.hideLoading();
            }
        });
    }
    @Override
    public void saveDataToPreference(LoginDTO loginDTO) {
        HashMap<String, String> data = new HashMap<>();
        data.put(AppConstants.EmployeeId,loginDTO.getResponse().getEmployeeId());
        data.put(AppConstants.Token,loginDTO.getResponse().getToken().toString());

        //TODO : Persist all the data of login response to their respective field for easy access.
        SharedPreferenceUtil.updateBulkSharedPreferencesValue(data);


    }


}
