package com.example.netrunners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewProductActivity extends AppCompatActivity {

    ImageView productImage;
    TextView productName, productPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        productImage = findViewById(R.id.imageView_product);
        productName = findViewById(R.id.textView3);
        productPrice = findViewById(R.id.textView_price);

        int id = getIntent().getIntExtra("Id", 0);

        productImage.setImageResource(MyData.getProduct(this, id).getImage());
        productName.setText(MyData.getProduct(this, id).getName());
        productPrice.setText(String.valueOf(MyData.getProduct(this, id).getPrice()));

    }

}