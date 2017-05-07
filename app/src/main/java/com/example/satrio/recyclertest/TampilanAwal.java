package com.example.satrio.recyclertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TampilanAwal extends AppCompatActivity {

    Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);
        masuk = (Button) findViewById(R.id.masuk);
        masuk.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i;
                i = new Intent(TampilanAwal.this, FormUtama.class);
                startActivity(i);
            }
        });
    }
}
