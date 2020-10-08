package com.example.echan_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private Button btnplogin;
    private Button btnDoc;
    private EditText mobiletxt , passwordtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = (Button) findViewById(R.id.btnReg);
        btnplogin=(Button) findViewById(R.id.btnLog);
        btnDoc=(Button) findViewById(R.id.doctor2);

        mobiletxt = (EditText) findViewById(R.id.pmobile);
        passwordtxt = (EditText) findViewById(R.id.ppass);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doctorRegistration();
        }
        });
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               docLog();
            }
        });


//
//        btnplogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openpatient();
//            }
//        });
    }



    public void docLog(){
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,doctorLoginREG.class);
                startActivity(intent);
            }
        });
    }


    public void doctorRegistration(){
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , free_prem.class);
                startActivity(intent);
            }
        });
    }

//    public void openpatient(){
//        btnplogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                        String mobile = "0710525884";
//                        String password = "hansi123";
//
//                        if((mobile.equals(mobiletxt.getText().toString())) && (password.equals(passwordtxt.getText().toString()))){
//                            Intent intent = new Intent(MainActivity.this, channel.class);
//                            startActivity(intent);
//                            Toast.makeText(MainActivity.this , "Searching your consultant", Toast.LENGTH_SHORT).show();
//
//                        }else{
//                            Toast.makeText(MainActivity.this , "Not Available Doctor", Toast.LENGTH_SHORT).show();
//
//                        }
//
//                    }
//                });
//
//            }
}