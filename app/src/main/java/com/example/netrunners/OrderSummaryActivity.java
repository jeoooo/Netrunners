package com.example.netrunners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OrderSummaryActivity extends AppCompatActivity {

    ImageButton imageButton_backToCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        imageButton_backToCard = findViewById(R.id.imageButton_backToCart);

        imageButton_backToCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyCartActivity();
            }
        });

    }

    public void openMyCartActivity() {
        Intent intent = new Intent(this, MyCartActivity.class);
        startActivity(intent);

    }

}