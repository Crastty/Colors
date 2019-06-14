package com.example.colors;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class ColorActivity extends AppCompatActivity {

    RelativeLayout relContainer;
    FloatingActionButton fabSerch;
    Uri uri;
    ImageView ivImagen;
    RadioGroup rgOpcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        relContainer = findViewById(R.id.container);
        fabSerch = findViewById(R.id.fabBuscar);
        ivImagen = findViewById(R.id.ivFoto);
        rgOpcion = findViewById(R.id.rbAlpha);

        int colorRecuperado = getIntent().getIntExtra("color", 0);

        switch (colorRecuperado) {
            case 1:
                relContainer.setBackgroundColor(Color.RED);
                uri = Uri.parse("https://www.google.com/search?q=red&");
                ivImagen.setImageResource(R.drawable.rosa_roja);
                break;
            case 2:
                relContainer.setBackgroundColor(Color.BLUE);
                uri = Uri.parse("https://www.google.com/search?q=blue&");
                ivImagen.setImageResource(R.drawable.rosa_azul);

                break;
            case 3:
                relContainer.setBackgroundColor(Color.GREEN);
                uri = Uri.parse("https://www.google.com/search?q=green&");
                ivImagen.setImageResource(R.drawable.rosa_verde);

                break;
            case 4:
                relContainer.setBackgroundColor(Color.YELLOW);
                uri = Uri.parse("https://www.google.com/search?q=yellolw&");
                ivImagen.setImageResource(R.drawable.rosa_amarilla);

                break;

            default:

        }

        fabSerch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.e("ColoActivity", "fab pulsado");

                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);

            }
        });

        rgOpcion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbNormal:
                        ivImagen.setAlpha(1.0f);
                        break;
                    case R.id.rbSuave:
                        ivImagen.setAlpha(0.5f);
                        break;
                }
            }
        });
        rgOpcion.check(R.id.rbSuave);


    }
}
