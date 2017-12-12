package com.oli.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.kopceLoad)
    Button kopceLoad;
    @BindView(R.id.text1)
    TextView textIme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @OnClick(R.id.kopceLoad)
    public void showUserDetails(){
        textIme.setText(PreferencesManager.getFirstname(this));
    }
}
