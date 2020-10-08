package com.example.echan_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class free_prem extends AppCompatActivity {

    Button btnpre , btnfree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_prem);

        btnpre = (Button) findViewById(R.id.button5);
        btnfree = (Button) findViewById(R.id.button6);

        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPreUser();
            }
        });

        btnfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFreeUser();
            }
        });
    }

    public void openPreUser(){
        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(free_prem.this , prem_reg.class);
                startActivity(intent);
            }
        });
    }
    public void openFreeUser(){
        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(free_prem.this , freereg.class);
                startActivity(intent1);
            }
        });
    }


}