package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_5 extends AppCompatActivity {

    ImageView previous, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_5);

        previous = findViewById(R.id.imageView_previous);
        next = findViewById(R.id.imageView_next);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_4();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_6();
            }
        });

    }

    public void openAllProductActivity_4() {
        Intent intent = new Intent(this, AllProductsActivity_4.class);
        startActivity(intent);
    }

    public void openAllProductActivity_6() {
        Intent intent = new Intent(this, AllProductsActivity_6.class);
        startActivity(intent);
    }

}