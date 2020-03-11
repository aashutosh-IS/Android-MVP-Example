package com.ex.crm.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ex.crm.Egx;
import com.ex.crm.Tickets.Activity.TicketActivity;
import com.ex.crm.Login.Presenter.LoginPresenter;
import com.ex.crm.R;
import com.ex.crm.Utils.AppConstants;
import com.ex.crm.Utils.SharedPreferenceUtil;

public class LoginActivity extends AppCompatActivity implements ILogin.View {
    private EditText loginUserName, loginPassword;
    private Button loginBtnLogin;
    private ProgressBar loginSpinKit;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferenceUtil.init(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenter(this);
        loginPresenter.created();
    }

    @Override
    public void init() {
        //ProgressBar

        loginSpinKit = findViewById(R.id.loginSpinKit);

        //EditTexts
        loginUserName=findViewById(R.id.loginUserName);
        loginPassword=findViewById(R.id.loginPassword);

        //Buttons

        loginBtnLogin=findViewById(R.id.loginBtnLogin);




    }

    @Override
    public void initClicks() {
        loginBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.loginButtonClick("super","super");
            }
        });

    }
    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    @Override
    public void showLoading() {

        loginSpinKit.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideLoading() {
        loginSpinKit.setVisibility(View.GONE);

    }

    @Override
    public void showErrorMessages(String error) {
        Toast.makeText(this, ""+error, Toast.LENGTH_SHORT).show();
    }



    @Override
    public void goToMainActivity() {
        SharedPreferences preferences = SharedPreferenceUtil.getDefaultSharedPreference();
        final String accessToken = preferences.getString(AppConstants.Token, "");
        if(accessToken.isEmpty()){
            Toast.makeText(this, "Try Again Later", Toast.LENGTH_SHORT).show();

        }else {

        Intent intent = new Intent(this, Egx.class);
        startActivity(intent);
        finish();
        }

    }
}
