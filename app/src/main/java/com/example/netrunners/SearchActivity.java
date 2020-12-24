package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    Button searchButton;
    EditText searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        searchButton = findViewById(R.id.searchButton);
        searchBar = findViewById(R.id.searchActivity_searchBar);

        if (getIntent().hasExtra("search")) {
            String search = getIntent().getExtras().getString("search", "");
            searchBar.setText(String.valueOf(search));
        }

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchResult();
            }
        });

    }


    public void openSearchResult() {
        Intent intent = new Intent(this, SearchResult.class);
        intent.putExtra("search", searchBar.getText().toString());
        startActivity(intent);
    }

}