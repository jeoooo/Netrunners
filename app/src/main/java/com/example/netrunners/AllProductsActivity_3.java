package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_3 extends AppCompatActivity {

    ImageView previous, next;
    ImageView backToHomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_3);

        previous = findViewById(R.id.imageView_previous);
        next = findViewById(R.id.imageView_next);
        backToHomeScreen = findViewById(R.id.imageView_backToHomeScreen);
        
        backToHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreenActivity();
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_2();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_4();
            }
        });

    }

    private void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    public void openAllProductActivity_2() {
        Intent intent = new Intent(this, AllProductsActivity_2.class);
        startActivity(intent);
    }

    public void openAllProductActivity_4() {
        Intent intent = new Intent(this, AllProductsActivity_4.class);
        startActivity(intent);
    }

}