package com.oli.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.ime)
    EditText name;
    @BindView(R.id.prezime)
    EditText lastname;
    @BindView(R.id.age)
    EditText age;
    @BindView(R.id.radiogrupa)
    RadioGroup radiogrupa;
    @BindView(R.id.M)
    RadioButton masko;
    @BindView(R.id.F)
    RadioButton zensko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.Save)
    public void saveUserDetails(){

//        PreferencesManager.setFirstName(this,name.getText().toString());
//        PreferencesManager.setLastName(this,lastname.getText().toString());
//        PreferencesManager.setAge(this,age.getText().toString());
//        PreferencesManager.setIsMale(.isChecked(),this);


        User user = new User();
        user.setName(name.getText().toString());
        user.setLastname(lastname.getText().toString());
        user.setAge(age.getText().toString());
        PreferencesManager.addUser(user,this);

        Toast.makeText(this,"user details saved",Toast.LENGTH_LONG).show();


    }
    @OnClick(R.id.Continue)
    public void Klik(View view){
        startActivity(new Intent(this,Main2Activity.class));
    }
}
