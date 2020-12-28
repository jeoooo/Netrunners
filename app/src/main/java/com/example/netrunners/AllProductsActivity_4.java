package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_4 extends AppCompatActivity {

    ImageView previous, next, homeScreenButton;
    // Monitor
    ImageView imageView_monitor1;
    TextView textView_monitor;
    // Headset
    ImageView imageView_headset1;
    TextView textView_headset;
    // Printer
    ImageView imageView_printer1;
    TextView textView_printer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_4);

        homeScreenButton = findViewById(R.id.imageView_backToHomeScreen);
        previous = findViewById(R.id.imageView_previous);
        next = findViewById(R.id.imageView_next);
        // Monitor
        imageView_monitor1 = findViewById(R.id.imageView_monitor1);
        textView_monitor = findViewById(R.id.textView_monitor);
        // Headset
        imageView_headset1 = findViewById(R.id.imageView_headset1);
        textView_headset = findViewById(R.id.textView_headset);
        // Printer
        imageView_printer1 = findViewById(R.id.imageView_printer1);
        textView_printer = findViewById(R.id.textView_printer);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        // Monitor
        imageView_monitor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_monitors();
            }
        });
        textView_monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_monitors();
            }
        });

        // Headset
        imageView_headset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_headsets();
            }
        });
        textView_headset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_headsets();
            }
        });

        // Printer
        imageView_printer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_printers();
            }
        });
        textView_printer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_printers();
            }
        });

    }

    public void openAllProductActivity_3() {
        Intent intent = new Intent(this, AllProductsActivity_3.class);
        startActivity(intent);
    }

    public void openAllProductActivity_5() {
        Intent intent = new Intent(this, AllProductsActivity_5.class);
        startActivity(intent);
    }

    public void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    // For the ImageView buttons
    public void setSpinner_monitors() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 7);
        startActivity(intent);
    }

    public void setSpinner_headsets() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 21);
        startActivity(intent);
    }

    public void setSpinner_printers() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 13);
        startActivity(intent);
    }

}