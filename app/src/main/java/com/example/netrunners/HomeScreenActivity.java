package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_activity);

        // Pager
        List<Fragment> list = new ArrayList<>();
        list.add(new HomeScreenFragment());
        list.add(new HomeScreenFragment_2());
        list.add(new HomeScreenFragment_3());

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

        // Logo and Search bar next activity
        allProducts = (TextView) findViewById(R.id.allProductsTextView);
        searchBar = (EditText) findViewById(R.id.searchBar);

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

    }

    public void openSearchActivity() {
        Intent intent = new Intent(this, SearchResult.class);
        startActivity(intent);
    }

    public void openAllProductsActivity() {
        Intent intent = new Intent(this, AllProductsActivity.class);
        startActivity(intent);
    }

}