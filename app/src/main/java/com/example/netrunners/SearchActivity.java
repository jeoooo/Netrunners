package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.net.PortUnreachableException;

public class SearchActivity extends AppCompatActivity {

    Button searchButton;
    EditText searchBar;
    RecyclerView recyclerView_searchActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        searchButton = findViewById(R.id.searchButton);
        searchBar = findViewById(R.id.searchActivity_searchBar);
        recyclerView_searchActivity = findViewById(R.id.recyclerView_searchActivity);

        if (getIntent().hasExtra("search")) {
            String search = getIntent().getExtras().getString("search", "");
            searchBar.setText(String.valueOf(search));
        }

        SearchAdapter adapter = new SearchAdapter(this);
        adapter.setHasStableIds(true);
        recyclerView_searchActivity.setAdapter(adapter);
        recyclerView_searchActivity.setLayoutManager(new LinearLayoutManager(this));


        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!String.valueOf(searchBar.getText()).isEmpty()) {
                    ProductDatabase searchTable = new ProductDatabase(getBaseContext());
                    MyData.deleteSearchIfExist(getBaseContext(), String.valueOf(searchBar.getText()));
                    searchTable.addSearch(String.valueOf(searchBar.getText()));
                    SearchAdapter adapter = new SearchAdapter(getBaseContext());
                    adapter.setHasStableIds(true);
                    recyclerView_searchActivity.setAdapter(adapter);
                    recyclerView_searchActivity.setLayoutManager(new LinearLayoutManager(getBaseContext()));
                }
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