package com.example.tvd.trm2.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.example.tvd.trm2.Activity.MainActivity;
import com.example.tvd.trm2.R;
import com.example.tvd.trm2.Values.GetSetValues;
import com.example.tvd.trm2.adapter.Adapters;
import com.spark.submitbutton.SubmitButton;

import java.util.ArrayList;


public class Login_Fragment extends Fragment implements View.OnClickListener {
    SubmitButton login;
    Spinner userroleview;
    View v;
    String[] rolelist;
    Adapters adapters;
    GetSetValues getset, getSetValues;
    ArrayList<GetSetValues> userrolelist;
    Adapters.Roleadapter userroleadapter;
    public Login_Fragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_login_, container, false);
        rolelist = getResources().getStringArray(R.array.login_role);
        adapters = new Adapters();
        userroleview = (Spinner) v.findViewById(R.id.spinner1);
        userrolelist = new ArrayList<GetSetValues>();
        userroleadapter = adapters.new Roleadapter(getActivity(), userrolelist);
        userroleview.setAdapter(userroleadapter);

        for (int i = 0; i < rolelist.length; i++) {
            getSetValues = new GetSetValues();
            String role = rolelist[i];
            getSetValues.setrole(role);
            userrolelist.add(getSetValues);
            userroleadapter.notifyDataSetChanged();
        }

        userroleview.setSelection(4);

        login = v.findViewById(R.id.main_login_btn);
        login.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View view) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(intent);
            }
        },2000L);

    }
}
