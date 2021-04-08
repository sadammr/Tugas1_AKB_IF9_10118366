//07-04-2021 10118366-Sadam Mochamad Rifqi-IF9

package com.example.tugas1_akb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import com.example.tugas1_akb.Login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(MainActivity.this, Login.class);
                startActivity(panggil);
                finish();
            }
        }, 4000);
    }
}

