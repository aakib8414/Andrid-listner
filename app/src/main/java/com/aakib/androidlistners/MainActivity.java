package com.aakib.androidlistners;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvFist, tvWay1, tvSecond, tvWay2, tvThird, tvWay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFist = findViewById(R.id.first);
        tvWay1 = findViewById(R.id.way1);

        tvSecond = findViewById(R.id.second);
        tvWay2 = findViewById(R.id.way2);

        tvThird = findViewById(R.id.third);
        tvWay3 = findViewById(R.id.way3);
        tvFist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Aakib", Toast.LENGTH_SHORT).show();
            }
        });

        tvWay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Khan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}