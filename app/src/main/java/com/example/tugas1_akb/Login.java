//07-04-2021 10118366-Sadam Mochamad Rifqi-IF9

package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin1 = (Button)findViewById(R.id.btnLogin1);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Home.class);

                startActivity(i);

            }
        });

        Button btnRegister1 = (Button)findViewById(R.id.btnRegister1);

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Register.class);

                startActivity(i);
            }
        });
    }
}

