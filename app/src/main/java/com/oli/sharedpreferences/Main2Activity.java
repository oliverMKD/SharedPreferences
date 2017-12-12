package com.oli.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.kopceLoad)
    Button kopceLoad;
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.text2)
    TextView textIme;
    @BindView(R.id.text3)
    TextView text3;
    @BindView(R.id.text4)
    TextView textPrezime;
    @BindView(R.id.text5)
    TextView text5;
    @BindView(R.id.text6)
    TextView textAge;
    @BindView(R.id.text7)
    TextView textPol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.kopceLoad)
    public void showUserDetails(){
//        textIme.setText(PreferencesManager.getFirstname(this));
//        textPrezime.setText(PreferencesManager.getLastName(this));
//        textAge.setText(PreferencesManager.getAge(this));


        User user = PreferencesManager.getUser(this);

        if (user!=null){
            textIme.setText(user.getName());
            textPrezime.setText(user.getLastname());
            textAge.setText(user.getAge());
        }


    }
}
