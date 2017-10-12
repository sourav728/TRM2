package com.example.tvd.trm2.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.tvd.trm2.Fragments.Login_Fragment;
import com.example.tvd.trm2.R;

public class LoginActivity extends AppCompatActivity {
    Toolbar toolbar;
    FragmentTransaction fragmentTransaction;
    String abc;
    public static final int RequestPermissionCode = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar = (Toolbar) findViewById(R.id.login_toolbar);
        String ajnsd = "sdhfbjwdbf";
        String asbd = "sdfshdbf";
        abc = "Testing";
        setSupportActionBar(toolbar);

        startup();

    }
    private void startup() {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, new Login_Fragment()).commit();
    }
}
