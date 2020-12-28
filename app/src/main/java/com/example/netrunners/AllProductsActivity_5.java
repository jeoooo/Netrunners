package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_5 extends AppCompatActivity {

    ImageView previous, next, homeScreenButton;
    // External Storage Device
    ImageView imageView_externalStorageDevice1;
    TextView textView_externalStorageDevice;
    // Computer Chair
    ImageView imageView_computerChair1;
    TextView textView_computerChair;
    // Computer Desks
    ImageView imageView_computerDesks1;
    TextView textView_computerDesks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_5);

        homeScreenButton = findViewById(R.id.imageView_backToHomeScreen);
        previous = findViewById(R.id.imageView_previous);
        next = findViewById(R.id.imageView_next);
        // External Storage Device
        imageView_externalStorageDevice1 = findViewById(R.id.imageView_externalStorageDevice1);
        textView_externalStorageDevice = findViewById(R.id.textView_externalStorageDevices);
        // Computer Chair
        imageView_computerChair1 = findViewById(R.id.imageView_computerChair1);
        textView_computerChair = findViewById(R.id.textView_computerChairs);
        // Computer Desks
        imageView_computerDesks1 = findViewById(R.id.imageView_computerDesk1);
        textView_computerDesks = findViewById(R.id.textView_computerDesks);

        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreenActivity();
            }
        });

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

        // External Storage Device
        imageView_externalStorageDevice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_externalStorage();
            }
        });
        textView_externalStorageDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_externalStorage();
            }
        });

        // Computer Chair
        imageView_computerChair1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_chair();
            }
        });
        textView_computerChair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_chair();
            }
        });

        // Computer Desks
        imageView_computerDesks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_computerDesks();
            }
        });

        textView_computerDesks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_computerDesks();
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

    public void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    // For the ImageView buttons
    public void setSpinner_externalStorage() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 27);
        startActivity(intent);
    }

    public void setSpinner_chair() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 33);
        startActivity(intent);
    }

    public void setSpinner_computerDesks() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 17);
        startActivity(intent);
    }

}