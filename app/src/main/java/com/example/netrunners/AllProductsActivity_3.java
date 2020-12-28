package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_3 extends AppCompatActivity {

    ImageView previous, next, homeScreenButton;
    // Power Supply Unit
    ImageView imageView_powerSupplyUnit1;
    TextView textView_powerSupplyUnit;
    // Keyboard
    ImageView imageView_keyboard1;
    TextView textView_keyboard;
    // Mouse
    ImageView imageView_mouse1;
    TextView textView_mouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_3);

        homeScreenButton = findViewById(R.id.imageView_backToHomeScreen);
        previous = findViewById(R.id.imageView_previous);
        next = findViewById(R.id.imageView_next);
        // Power Supply Unit
        imageView_powerSupplyUnit1 = findViewById(R.id.imageView_powerSupplyUnit1);
        textView_powerSupplyUnit = findViewById(R.id.textView_powerSupplyUnits);
        // Keyboard
        imageView_keyboard1 = findViewById(R.id.imageView_keyboard1);
        textView_keyboard = findViewById(R.id.textView_keyboards);
        // Mouse
        imageView_mouse1 = findViewById(R.id.imageView_mouse1);
        textView_mouse = findViewById(R.id.textView_mouse);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        // Power Supply Unit
        imageView_powerSupplyUnit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_psu();
            }
        });
        textView_powerSupplyUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_psu();
            }
        });

        // Keyboard
        imageView_keyboard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_keyboards();
            }
        });
        textView_keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_keyboards();
            }
        });

        // Mouse
        imageView_mouse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_computerMouse();
            }
        });
        textView_mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_computerMouse();
            }
        });

    }

    public void openAllProductActivity_2() {
        Intent intent = new Intent(this, AllProductsActivity_2.class);
        startActivity(intent);
    }

    public void openAllProductActivity_4() {
        Intent intent = new Intent(this, AllProductsActivity_4.class);
        startActivity(intent);
    }

    public void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    // For the ImageView buttons
    public void setSpinner_psu() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 15);
        startActivity(intent);
    }

    public void setSpinner_keyboards() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 11);
        startActivity(intent);
    }

    public void setSpinner_computerMouse() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 19);
        startActivity(intent);
    }

}