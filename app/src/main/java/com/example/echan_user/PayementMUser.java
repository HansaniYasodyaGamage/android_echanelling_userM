package com.example.echan_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayementMUser extends AppCompatActivity {
    private Button btnProce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payement_m_user);

        btnProce = (Button) findViewById(R.id.btnProceed);
        btnProce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oprnPaymentD();
            }
        });


    }


    public void oprnPaymentD(){
        btnProce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayementMUser.this , PaymentDetails.class);
                startActivity(intent);
            }
        });
    }
}