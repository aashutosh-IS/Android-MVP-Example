package com.ex.crm.Network;


import android.content.SharedPreferences;

import com.ex.crm.Utils.AppConstants;
import com.ex.crm.Utils.SharedPreferenceUtil;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit;




    public static Retrofit getApiClient() {
        SharedPreferences preferences = SharedPreferenceUtil.getDefaultSharedPreference();
        final String accessToken = preferences.getString(AppConstants.Token, "");
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .addHeader("Authorization", "Bearer " + accessToken)
                        .build();
                return chain.proceed(newRequest);
            }
        }).build();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("www.ez.com")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
