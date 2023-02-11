package com.example.contraintandrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pesan;
    Button kembali2;
    EditText edit1;
    EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesan = findViewById(R.id.pesan);
        kembali2 = findViewById(R.id.kembali);
        edit1 = findViewById(R.id.textAtas);
        edit2 = findViewById(R.id.textBorderGede);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().trim().length() == 0 && edit2.getText().toString().trim().length() == 0){
                    Toast.makeText(getApplicationContext(),"Mohon Diisi" , Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(),"Pesanan sedang di proses " , Toast.LENGTH_SHORT).show();
                }

            }
        });
        kembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class ));
            }
        });
    }
}