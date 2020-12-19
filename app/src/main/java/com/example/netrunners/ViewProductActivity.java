package com.example.netrunners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ViewProductActivity extends AppCompatActivity {

    ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        productImage = findViewById(R.id.imageView_product);

        productImage.setImageResource(MyData.getProduct(this, MyData.viewProductId).getImage());

    }

}