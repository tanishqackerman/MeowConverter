package com.example.meowconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.Math;

import java.util.Objects;

public class Length extends AppCompatActivity {

    private AutoCompleteTextView autotext;
    private AutoCompleteTextView autotextconv;
    private ArrayAdapter<String> adapter;
    private String [] lengthlist = {"Decimeter", "Light Year", "Millimeter", "Kilometer", "Centimeter", "Meter", "Micrometer", "Nanometer"};
    private double [] vallist = {1, 1.057 * Math.pow(10, -17), 100, 0.0001, 10, 0.1, 100000, 100000000};
    private EditText inp;
    private TextView inpconv;
    private int pos;
    private int posconv;
    private int num;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conv);

        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color = \"black\">" + getString(R.string.app_name) + "</font>"));

        autotext = findViewById(R.id.autotext);
        autotextconv = findViewById(R.id.autotextconv);
        inp = findViewById(R.id.inp);
        inpconv = findViewById(R.id.inpconv);
        btn = findViewById(R.id.button);

        adapter = new ArrayAdapter<String>(this, R.layout.list_item, lengthlist);
        autotext.setAdapter(adapter);
        autotextconv.setAdapter(adapter);

        autotext.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                pos = i;
            }
        });

        autotextconv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                posconv = i;
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Integer.parseInt(inp.getText().toString());
                inpconv.setText((num*vallist[posconv])/vallist[pos] + "");
            }
        });
    }
}