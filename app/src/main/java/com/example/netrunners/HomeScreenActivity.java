package com.example.netrunners;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class HomeScreenActivity extends AppCompatActivity {

    TextView allProducts;
    EditText searchBar;
    ImageView cartButton;

    private static ViewPager pager;
    private PagerAdapter pagerAdapter;
    ProductDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_activity);

        db = new ProductDatabase(this);

        // Add MyData on table if Empty or NotExist
        if(!db.table1Exist()) {
            ArrayList<MyProduct> listDB = MyData.getAllProducts();
            for (int j = 0; j < listDB.size(); j++) {
                db.addProduct(String.valueOf(listDB.get(j).getImage()),
                        listDB.get(j).getName(),
                        listDB.get(j).getCategory(),
                        String.valueOf(listDB.get(j).getPrice()),
                        String.valueOf(500),
                        listDB.get(j).getDescription()
                );
            }
        }

        // Pager
        List<Fragment> list = new ArrayList<>();
        list.add(new HomeScreenFragment());
        list.add(new HomeScreenFragment_2());
        list.add(new HomeScreenFragment_3());

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

        // Logo and Search bar next activity
        allProducts = findViewById(R.id.allProductsTextView);
        searchBar = findViewById(R.id.searchBar);
        cartButton = findViewById(R.id.imageView_buttonMyCart);

        searchBar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openSearchActivity();
            }
        });

        allProducts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openAllProductsActivity();
            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openCart();
            }
        });

    }

    public void openCart() {
        Intent intent = new Intent(this, MyCartActivity.class);
        startActivity(intent);
    }

    public void openSearchActivity() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void openAllProductsActivity() {
        Intent intent = new Intent(this, AllProductsActivity.class);
        startActivity(intent);
    }

    public static void openNextPager() {
        pager.setCurrentItem(pager.getCurrentItem()+1);
    }

    public static void openPrevPager() {
        pager.setCurrentItem(pager.getCurrentItem()-1);
    }

}