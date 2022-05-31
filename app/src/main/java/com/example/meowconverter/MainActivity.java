package com.example.meowconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private CardView length;
    private CardView weight;
    private CardView speed;
    private CardView vol;
    private CardView area;
    private CardView temp;
    private CardView curr;
    private CardView nos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color = \"black\">" + getString(R.string.app_name) + "</font>"));

        length = findViewById(R.id.length);
        weight = findViewById(R.id.weight);
        speed = findViewById(R.id.speed);
        area = findViewById(R.id.area);
        vol = findViewById(R.id.vol);
        temp = findViewById(R.id.temp);
        curr = findViewById(R.id.currency);
        nos = findViewById(R.id.nos);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentl = new Intent(MainActivity.this, Length.class);
                startActivity(intentl);
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentw = new Intent(MainActivity.this, Weight.class);
                startActivity(intentw);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(MainActivity.this, Area.class);
                startActivity(intenta);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(MainActivity.this, Speed.class);
                startActivity(intents);
            }
        });

        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentv = new Intent(MainActivity.this, Vol.class);
                startActivity(intentv);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(MainActivity.this, Temp.class);
                startActivity(intentt);
            }
        });

        nos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentn = new Intent(MainActivity.this, Numbers.class);
                startActivity(intentn);
            }
        });

        curr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(MainActivity.this, Currency.class);
                startActivity(intentc);
            }
        });
    }
}