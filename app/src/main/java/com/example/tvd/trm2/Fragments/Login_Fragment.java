package com.example.tvd.trm2.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tvd.trm2.Activity.MainActivity;
import com.example.tvd.trm2.R;


public class Login_Fragment extends Fragment implements View.OnClickListener {
    Button login;
    View v;
    public Login_Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_login_, container, false);
        login = v.findViewById(R.id.main_login_btn);
        login.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        getActivity().startActivity(intent);
    }
}
