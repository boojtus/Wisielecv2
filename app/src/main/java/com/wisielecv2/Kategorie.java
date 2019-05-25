package com.wisielecv2;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.FileObserver;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Kategorie extends AppCompatActivity {

    private Button rzecz;
    private Button miasta;
    private Button pilkarz;
    private Button piosenkarz;
    private Button aktor;
    private Button back;
    private Button pokaz;
    private Button add;
    private TextView nazwa;
    public static String baza;


    public static String getBaza()
    {
        return baza;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);

        rzecz = findViewById(R.id.rzecz);
        miasta = findViewById(R.id.miasta);
        pilkarz = findViewById(R.id.pilkarz);
        piosenkarz = findViewById(R.id.piosenkarz);
        aktor = findViewById(R.id.aktor);
        back = findViewById(R.id.back);
        pokaz = findViewById(R.id.pokaz);
        add = findViewById(R.id.dodaj);
        nazwa = findViewById(R.id.nazwa);

        rzecz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baza = "rzecz";
                rzecz.setVisibility(View.INVISIBLE);
                aktor.setVisibility(View.INVISIBLE);
                pilkarz.setVisibility(View.INVISIBLE);
                piosenkarz.setVisibility(View.INVISIBLE);
                miasta.setVisibility(View.INVISIBLE);
                back.setVisibility(View.VISIBLE);
                pokaz.setVisibility(View.VISIBLE);
                add.setVisibility(View.VISIBLE);
                nazwa.setVisibility(View.VISIBLE);
            }
        });
        miasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baza = "Miasta";
                rzecz.setVisibility(View.INVISIBLE);
                aktor.setVisibility(View.INVISIBLE);
                pilkarz.setVisibility(View.INVISIBLE);
                piosenkarz.setVisibility(View.INVISIBLE);
                miasta.setVisibility(View.INVISIBLE);
                back.setVisibility(View.VISIBLE);
                pokaz.setVisibility(View.VISIBLE);
                add.setVisibility(View.VISIBLE);
                nazwa.setVisibility(View.VISIBLE);
            }
        });
        pilkarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baza = "Pilkarz";
                rzecz.setVisibility(View.INVISIBLE);
                aktor.setVisibility(View.INVISIBLE);
                pilkarz.setVisibility(View.INVISIBLE);
                piosenkarz.setVisibility(View.INVISIBLE);
                miasta.setVisibility(View.INVISIBLE);
                back.setVisibility(View.VISIBLE);
                pokaz.setVisibility(View.VISIBLE);
                add.setVisibility(View.VISIBLE);
                nazwa.setVisibility(View.VISIBLE);
            }
        });
        piosenkarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baza = "piosenkarz";
                rzecz.setVisibility(View.INVISIBLE);
                aktor.setVisibility(View.INVISIBLE);
                pilkarz.setVisibility(View.INVISIBLE);
                piosenkarz.setVisibility(View.INVISIBLE);
                miasta.setVisibility(View.INVISIBLE);
                back.setVisibility(View.VISIBLE);
                pokaz.setVisibility(View.VISIBLE);
                add.setVisibility(View.VISIBLE);
                nazwa.setVisibility(View.VISIBLE);
            }
        });
        aktor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baza = "aktor";
                rzecz.setVisibility(View.INVISIBLE);
                aktor.setVisibility(View.INVISIBLE);
                pilkarz.setVisibility(View.INVISIBLE);
                piosenkarz.setVisibility(View.INVISIBLE);
                miasta.setVisibility(View.INVISIBLE);
                back.setVisibility(View.VISIBLE);
                pokaz.setVisibility(View.VISIBLE);
                add.setVisibility(View.VISIBLE);
                nazwa.setVisibility(View.VISIBLE);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence tekst = baza;
                rzecz.setVisibility(View.VISIBLE);
                aktor.setVisibility(View.VISIBLE);
                pilkarz.setVisibility(View.VISIBLE);
                piosenkarz.setVisibility(View.VISIBLE);
                miasta.setVisibility(View.VISIBLE);
                back.setVisibility(View.INVISIBLE);
                pokaz.setVisibility(View.INVISIBLE);
                add.setVisibility(View.INVISIBLE);
                nazwa.setVisibility(View.INVISIBLE);
                Toast.makeText(Kategorie.this, tekst, Toast.LENGTH_SHORT).show();
            }
        }); pokaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtons();
            }
        });
    }

    private void updateButtons() {
        if (pokaz) {
            pokaz.setText("Ukryj");
        } else {
            pokaz.setText("Pokaz");

        }
    }
}



