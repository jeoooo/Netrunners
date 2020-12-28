package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllProductsActivity extends AppCompatActivity {

    ImageView next, backToHomeScreen;
    // Processor
    ImageView imageView_processor1, imageView_processor2;
    TextView textView_processor;
    // Graphics Card
    ImageView imageView_graphics1, imageView_graphics2;
    TextView textView_graphics;
    // Motherboard
    ImageView imageView_motherboard1;
    TextView textView_motherboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products);

        next = findViewById(R.id.imageView_next);
        // Processor
        imageView_processor1 = findViewById(R.id.imageView_processor1);
        imageView_processor2 = findViewById(R.id.imageView_processor2);
        textView_processor = findViewById(R.id.textView_processor);
        // Graphics Card
        imageView_graphics1 = findViewById(R.id.imageView_graphics1);
        imageView_graphics2 = findViewById(R.id.imageView_grahpics2);
        textView_graphics = findViewById(R.id.textView_graphics);
        // Motherboard
        imageView_motherboard1 = findViewById(R.id.imageView_motherboard1);
        textView_motherboard = findViewById(R.id.textView_motherboard);

        backToHomeScreen = findViewById(R.id.imageView_backToHomeScreen);

        backToHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreenActivity();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity2();
            }
        });

        // Processor
        imageView_processor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cpu();
            }
        });
        imageView_processor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cpu();
            }
        });
        textView_processor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cpu();
            }
        });

        // Graphics
        imageView_graphics1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_gpu();
            }
        });
        imageView_graphics2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_gpu();
            }
        });
        textView_graphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_gpu();
            }
        });

        // Motherboard
        imageView_motherboard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_motherboards();
            }
        });
        textView_motherboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_motherboards();
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

    // For the ImageView buttons
    public void setSpinner_cpu() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 37);
        startActivity(intent);
    }

    public void setSpinner_gpu() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 5);
        startActivity(intent);
    }

    public void setSpinner_motherboards() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 3);
        startActivity(intent);
    }

}