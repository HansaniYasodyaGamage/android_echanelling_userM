package com.example.echan_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class doctorLoginREG extends AppCompatActivity {
    private Button btnplogin;
    private EditText mobiletxt , passwordtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login_r_e_g);


        btnplogin=(Button) findViewById(R.id.btnLog1);
        mobiletxt = (EditText) findViewById(R.id.pmobile1);
        passwordtxt = (EditText) findViewById(R.id.ppass1);

        btnplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpatient();
            }
        });
    }

    private boolean validatePhoneNo(){
        String val=mobiletxt.getText().toString();
        if(val.isEmpty()){
            mobiletxt.setError("Field cannot be empty");
            return false;
        }else{
            mobiletxt.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String val=passwordtxt.getText().toString();
        String passwordVal="^" +
                "(?=.*[a-zA-Z])"+
                "(?=.*[@#$%^&])"+
                "(?=\\S+$)"+
                ".{4,}" +
                "$" ;

        if(val.isEmpty()){
            passwordtxt.setError("Field cannot be empty");
            return false;
        } else if(!val.matches(passwordVal)){
            passwordtxt.setError("Password is too weak");
            return false;
        }
        else{
            passwordtxt.setError(null);
            return true;
        }
    }

    public void openpatient(){
        btnplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobile = "0710525884";
                String password = "Hansi123@";

                if(!validatePhoneNo() | !validatePassword()){
                    return;
                }

                else if((mobile.equals(mobiletxt.getText().toString())) && (password.equals(passwordtxt.getText().toString()))){
                    Intent intent = new Intent(doctorLoginREG.this, doctorMain.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(doctorLoginREG.this , "UserName or Password incorrect", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}