package com.example.ikhsanramadhan.duglegir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class IndexActivity extends AppCompatActivity {

    CardView jadwal, pengaturan, catat, statistik, panduan, kiblat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        jadwal = (CardView) findViewById(R.id.jadwal);
        catat = (CardView) findViewById(R.id.catatibadah);
        statistik = (CardView) findViewById(R.id.statistik);
        panduan = (CardView) findViewById(R.id.panduan);
        kiblat = (CardView) findViewById(R.id.kiblat);
        pengaturan = (CardView) findViewById(R.id.pengaturan);

        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        catat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentCatat();
            }
        });

        statistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        kiblat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentKompas();
            }
        });

        panduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


    public void intentCatat() {
        Intent i = new Intent(this, CatatanActivity.class);
        startActivity(i);
    }

    public void intentKompas() {
        Intent i = new Intent(this, KompasActivity.class);
        startActivity(i);
    }



}
