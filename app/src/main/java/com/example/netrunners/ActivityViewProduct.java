package com.example.netrunners;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityViewProduct extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;

    int id;

    Button addToCartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        addToCartButton = findViewById(R.id.button2);

        id = getIntent().getIntExtra("Id", 0);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.linearLayout, new ViewProductFragment(id), "fragment_1");
        fragmentTransaction.add(R.id.linearLayout, new ViewProductDetailsFragment(id), "fragment_2");
        fragmentTransaction.commit();

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductDatabase pdb = new ProductDatabase(getBaseContext());
                //pdb.updateProductData(String.valueOf(id), String.valueOf(MyData.getProduct(getBaseContext(), id).getStock()-1));
                if(MyData.isProductOnCart(getBaseContext(), id)) {
                    Toast.makeText(getBaseContext(), "Already in Cart", Toast.LENGTH_SHORT).show();
                }
                else {
                    MyProduct temp = MyData.getProduct(getBaseContext(), id);
                    String id = String.valueOf(temp.getId());
                    String image = String.valueOf(temp.getImage());
                    String name = temp.getName();
                    String category = temp.getCategory();
                    String price = String.valueOf(temp.getPrice());
                    String quantity = String.valueOf(temp.getQuantity()+1);
                    pdb.addCart(id, image, name, category, price, quantity);
                    Toast.makeText(getBaseContext(), "Added to Cart", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}