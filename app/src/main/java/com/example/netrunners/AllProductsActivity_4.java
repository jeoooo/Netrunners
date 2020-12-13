package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_4 extends AppCompatActivity {

    ImageView previous, next;
    ImageView backToHomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_4);

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
                openAllProductActivity_3();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_5();
            }
        });

    }

    private void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    public void openAllProductActivity_3() {
        Intent intent = new Intent(this, AllProductsActivity_3.class);
        startActivity(intent);
    }

    public void openAllProductActivity_5() {
        Intent intent = new Intent(this, AllProductsActivity_5.class);
        startActivity(intent);
    }

}