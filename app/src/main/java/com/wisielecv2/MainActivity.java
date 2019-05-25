package com.wisielecv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private final String baza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(MainActivity.this,baza,Toast.LENGTH_SHORT).show();



        Button start = findViewById(R.id.Start);
        Button kategorie = findViewById(R.id.Kategorie);
        Button exit = findViewById(R.id.Exit);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, Start_gra.class);
                startActivity(intent);
            }
        });
        kategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, Kategorie.class);
                startActivity(intent);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    /*public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.Start:
                intent = new Intent(MainActivity.this, Start_gra.class);
                startActivity(intent);
                break;
            case R.id.Kategorie:
                intent = new Intent(MainActivity.this, Kategorie.class);
                startActivity(intent);
                break;
            case R.id.Exit:
                finish();
                System.exit(0);
                break;

        }
    }*/
}
