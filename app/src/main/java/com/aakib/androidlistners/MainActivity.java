package com.aakib.androidlistners;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvFist, tvWay1, tvSecond, tvWay2, tvThird, tvWay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFist = findViewById(R.id.first);
        tvWay1 = findViewById(R.id.way1);

        tvSecond = findViewById(R.id.second);
        tvWay2 = findViewById(R.id.way2);

        tvSecond.setOnClickListener(this);
        tvWay2.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.second:
                Toast.makeText(this, "raza", Toast.LENGTH_SHORT).show();
                break;
            case R.id.way2:
                Toast.makeText(this, "Khan", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    public void third(View view) {
        Toast.makeText(this, "adnan", Toast.LENGTH_SHORT).show();
    }

    public void way3(View view) {
        Toast.makeText(this, "khan", Toast.LENGTH_SHORT).show();
    }
}