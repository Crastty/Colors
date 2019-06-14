package com.example.colors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btRed, btBlue, btGreen, btYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRed = findViewById(R.id.boton1);
        btBlue = findViewById(R.id.boton2);
        btGreen = findViewById(R.id.boton3);
        btYellow = findViewById(R.id.boton4);

        btRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.e("MainActivity", "Button Red");
                //Toast.makeText(getApplicationContext(), "RED", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 1);
                startActivity(i);
            }
        });

        btBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.e("MainActivity", "Button Blue");
                //Toast.makeText(getApplicationContext(),"BLUE", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 2);
                startActivity(i);
            }
        });

        btGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.e("MainActivity", "Button Green");
                //Toast.makeText(getApplicationContext(), "GREEN", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 3);
                startActivity(i);
            }
        });

        btYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.e("MainActivity", "Button Yellow");
                //Toast.makeText(getApplicationContext(), "YELLOW", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 4);
                startActivity(i);
            }
        });
    }
}
