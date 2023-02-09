package com.example.contraintandrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button baju;
    Button batik;
    Button selimut;
    Button seperai;
    Button sepatu;
    Button karpet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        baju = findViewById(R.id.baju);
        batik = findViewById(R.id.batik);
        selimut = findViewById(R.id.selimut);
        seperai = findViewById(R.id.seperai);
        sepatu = findViewById(R.id.sepatu);
        karpet = findViewById(R.id.karpet);


        baju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
        batik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
        selimut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
        seperai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
        sepatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
        karpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
    }
}