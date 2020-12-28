package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class AllProductsActivity_6 extends AppCompatActivity {

    ImageView previous, homeScreenButton;
    // Cables
    ImageView imageView_cable1;
    TextView textView_cables;
    // Projectors
    ImageView imageView_projector1;
    TextView textView_projectors;
    // Router
    ImageView imageView_router1, imageView_router2;
    TextView textView_routers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_6);

        homeScreenButton = findViewById(R.id.imageView_backToHomeScreen);
        previous = findViewById(R.id.imageView_previous);
        // Cables
        imageView_cable1 = findViewById(R.id.imageView_cable1);
        textView_cables = findViewById(R.id.textView_cables);
        // Projectors
        imageView_projector1 = findViewById(R.id.imageView_projector1);
        textView_projectors = findViewById(R.id.textView_projectors);
        // Router
        imageView_router1 = findViewById(R.id.imageView_router1);
        imageView_router2 = findViewById(R.id.imageView_router2);
        textView_routers = findViewById(R.id.textView_routers);


        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreenActivity();
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllProductActivity_5();
            }
        });

        // Cables
        imageView_cable1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cables();
            }
        });
        textView_cables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cables();
            }
        });

        // Projectors
        imageView_projector1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_projector();
            }
        });
        textView_projectors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_projector();
            }
        });

        // Printer
        imageView_router1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_router();
            }
        });
        imageView_router2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_router();
            }
        });
        textView_routers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_router();
            }
        });

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
    public void setSpinner_cables() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 29);
        startActivity(intent);
    }

    public void setSpinner_projector() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 35);
        startActivity(intent);
    }

    public void setSpinner_router() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("selectedSpinner", 9);
        startActivity(intent);
    }

}