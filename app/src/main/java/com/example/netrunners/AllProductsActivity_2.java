package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity_2 extends AppCompatActivity {

    ImageView previous, next, backToHomeScreen;
    // PC Case
    ImageView imageView_pcCase1, imageView_pcCase2;
    TextView textView_pcCase;
    // RAM
    ImageView imageView_ram1, imageView_ram2;
    TextView textView_ram;
    // Storage
    ImageView imageView_storage1;
    TextView textView_storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_2);

        previous = findViewById(R.id.imageView_previous);
        next = findViewById(R.id.imageView_next);
        backToHomeScreen = findViewById(R.id.imageView_backToHomeScreen);
        // PC Case
        imageView_pcCase1 = findViewById(R.id.imageView_pcCase1);
        imageView_pcCase2 = findViewById(R.id.imageView_pcCase2);
        textView_pcCase = findViewById(R.id.textView_pcCases);
        // RAM
        imageView_ram1 = findViewById(R.id.imageView_ram1);
        imageView_ram2 = findViewById(R.id.imageView_ram2);
        textView_ram = findViewById(R.id.textView_ram);
        // Storage
        imageView_storage1 = findViewById(R.id.imageView_storage1);
        textView_storage = findViewById(R.id.textView_storage);

        backToHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreenActivity();
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_3();
            }
        });

        // PC Case
        imageView_pcCase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_pcCases();
            }
        });
        imageView_pcCase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_pcCases();
            }
        });
        textView_pcCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_pcCases();
            }
        });

        // RAM
        imageView_ram1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_ram();
            }
        });
        imageView_ram2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_ram();
            }
        });
        textView_ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_ram();
            }
        });

        // Storage
        imageView_storage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_storageDrive();
            }
        });
        textView_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_storageDrive();
            }
        });

    }

    private void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    public void openAllProductActivity() {
        Intent intent = new Intent(this, AllProductsActivity.class);
        startActivity(intent);
    }

    public void openAllProductActivity_3() {
        Intent intent = new Intent(this, AllProductsActivity_3.class);
        startActivity(intent);
    }

    // For the ImageView buttons
    public void setSpinner_pcCases() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 25);
        startActivity(intent);
    }

    public void setSpinner_ram() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 23);
        startActivity(intent);
    }

    public void setSpinner_storageDrive() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 31);
        startActivity(intent);
    }

}