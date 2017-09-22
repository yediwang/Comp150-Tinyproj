package com.example.ywang.coffeename;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_coffee);

        final ImageView img1 = (ImageView)findViewById(R.id.coffeeimg1);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img1.setImageResource(R.drawable.coffee1);
            }
        });

        final ImageView img2 = (ImageView)findViewById(R.id.coffeeimg2);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img2.setImageResource(R.drawable.coffee2);
            }
        });

        final ImageView img3 = (ImageView)findViewById(R.id.coffeeimg3);
        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img3.setImageResource(R.drawable.coffee3);
            }
        });

        final ImageView img4 = (ImageView)findViewById(R.id.coffeeimg4);
        img4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img4.setImageResource(R.drawable.coffee4);
            }
        });

        final ImageView img5 = (ImageView)findViewById(R.id.coffeeimg5);
        img5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img5.setImageResource(R.drawable.coffee5);
            }
        });

        final ImageView img6 = (ImageView)findViewById(R.id.coffeeimg6);
        img6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img6.setImageResource(R.drawable.coffee6);
            }
        });

        final ImageView img7 = (ImageView)findViewById(R.id.coffeeimg7);
        img7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img7.setImageResource(R.drawable.coffee7);
            }
        });

        final ImageView img8 = (ImageView)findViewById(R.id.coffeeimg8);
        img8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img8.setImageResource(R.drawable.coffee8);
            }
        });
    }
}