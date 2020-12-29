package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SearchResult extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    RecyclerView recyclerView;
    ImageView homeButton, buttonMyCart;
    EditText searchBar;
    Spinner spinner;

    String[][] spinner_array = {
            {"All Price(Lowest -> Highest)", "All", "low to high"},
            {"All Price(Highest -> Lowest)", "All", "high to low"},

            {"Motherboard Price(Lowest -> Highest)", MyData.categories[0], "low to high"},
            {"Motherboard Price(Highest -> Lowest)", MyData.categories[0], "high to low"},

            {"Graphics Card Price(Lowest -> Highest)", MyData.categories[1], "low to high"},
            {"Graphics Card Price(Highest -> Lowest)", MyData.categories[1], "high to low"},

            {"Monitor Price(Lowest -> Highest)", MyData.categories[2], "low to high"},
            {"Monitor Price(Highest -> Lowest)", MyData.categories[2], "high to low"},

            {"Router Price(Lowest -> Highest)", MyData.categories[3], "low to high"},
            {"Router Price(Highest -> Lowest)", MyData.categories[3], "high to low"},

            {"Keyboard Price(Lowest -> Highest)", MyData.categories[4], "low to high"},
            {"Keyboard Price(Highest -> Lowest)", MyData.categories[4], "high to low"},

            {"Printer Price(Lowest -> Highest)", MyData.categories[5], "low to high"},
            {"Printer Price(Highest -> Lowest)", MyData.categories[5], "high to low"},

            {"Power Supply Price(Lowest -> Highest)", MyData.categories[6], "low to high"},
            {"Power Supply Price(Highest -> Lowest)", MyData.categories[6], "high to low"},

            {"Table Price(Lowest -> Highest)", MyData.categories[7], "low to high"},
            {"Table Price(Highest -> Lowest)", MyData.categories[7], "high to low"},

            {"Mouse Price(Lowest -> Highest)", MyData.categories[8], "low to high"},
            {"Mouse Price(Highest -> Lowest)", MyData.categories[8], "high to low"},

            {"Headset Price(Lowest -> Highest)", MyData.categories[9], "low to high"},
            {"Headset Price(Highest -> Lowest)", MyData.categories[9], "high to low"},

            {"RAM Price(Lowest -> Highest)", MyData.categories[10], "low to high"},
            {"RAM Price(Highest -> Lowest)", MyData.categories[10], "high to low"},

            {"PC Case Price(Lowest -> Highest)", MyData.categories[11], "low to high"},
            {"PC Case Price(Highest -> Lowest)", MyData.categories[11], "high to low"},

            {"External Storage Price(Lowest -> Highest)", MyData.categories[12], "low to high"},
            {"External Storage Price(Highest -> Lowest)", MyData.categories[12], "high to low"},

            {"Cable Price(Lowest -> Highest)", MyData.categories[13], "low to high"},
            {"Cable Price(Highest -> Lowest)", MyData.categories[13], "high to low"},

            {"Storage Price(Lowest -> Highest)", MyData.categories[14], "low to high"},
            {"Storage Price(Highest -> Lowest)", MyData.categories[14], "high to low"},

            {"Chair Price(Lowest -> Highest)", MyData.categories[15], "low to high"},
            {"Chair Price(Highest -> Lowest)", MyData.categories[15], "high to low"},

            {"Projector Price(Lowest -> Highest)", MyData.categories[16], "low to high"},
            {"Projector Price(Highest -> Lowest)", MyData.categories[16], "high to low"},

            {"Processor Price(Lowest -> Highest)", MyData.categories[17], "low to high"},
            {"Processor Price(Highest -> Lowest)", MyData.categories[17], "high to low"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

        recyclerView = findViewById(R.id.recyclerView);
        searchBar = findViewById(R.id.searchResult_searchBar);
        homeButton = findViewById(R.id.imageView_homeButton);
        buttonMyCart = findViewById(R.id.imageView_buttonMyCart);

        String search = getIntent().getExtras().getString("search");
        searchBar.setText(search);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeScreenActivity();
            }
        });

        buttonMyCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyCartActivity();
            }
        });

        searchBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchActivity();
            }
        });

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setNestedScrollingEnabled(true);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sort, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        if(getIntent().hasExtra("selectedSpinner")) {
            spinner.setSelection(getIntent().getExtras().getInt("selectedSpinner"));
        }
    }

    private void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selected = parent.getItemAtPosition(position).toString();

        if(selected.equals("---")) {
            MyAdapter myAdapter = new MyAdapter(this, "All", "none", String.valueOf(searchBar.getText()));
            myAdapter.setHasStableIds(true);
            recyclerView.setAdapter(myAdapter);
        }

        else {
            for (int j = 0; j < spinner_array.length; j++) {
                if (selected.equals(spinner_array[j][0])) {
                    MyAdapter myAdapter = new MyAdapter(this, spinner_array[j][1], spinner_array[j][2], String.valueOf(searchBar.getText()));
                    myAdapter.setHasStableIds(true);
                    recyclerView.setAdapter(myAdapter);
                }
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void openMyCartActivity() {
        Intent intent = new Intent(this, MyCartActivity.class);
        startActivity(intent);
    }

    public void openSearchActivity() {
        Intent intent = new Intent(this, SearchActivity.class);
        intent.putExtra("search", searchBar.getText().toString());
        startActivity(intent);
    }

}