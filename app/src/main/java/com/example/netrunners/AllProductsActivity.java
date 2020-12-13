package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity extends AppCompatActivity {

    ImageView next;
    ImageView backToHomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products);

        next = findViewById(R.id.imageView_next);
        backToHomeScreen = findViewById(R.id.imageView_backToHomeScreen);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity2();
            }
        });

        backToHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreenActivity();
            }
        });

    }

    private void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    public void openAllProductActivity2() {
        Intent intent = new Intent(this, AllProductsActivity_2.class);
        startActivity(intent);
    }



}