package com.example.netrunners;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCartActivity extends AppCompatActivity {

    ImageView back;
    TextView back_2;
    RecyclerView recyclerView;
    CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        back = findViewById(R.id.imageView_back);
        back_2 = findViewById(R.id.textView_back);
        recyclerView = findViewById(R.id.recyclerView);

        cartAdapter = new CartAdapter(this, MyData.getAllCartProduct(this));
        cartAdapter.setHasStableIds(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(cartAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreenActivity();
            }
        });

        back_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreenActivity();
            }
        });

    }

    public void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    ItemTouchHelper.SimpleCallback simpleCallback=
            new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
                @Override
                public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                    return false;
                }

                @Override
                public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                    int position = viewHolder.getAdapterPosition();
                    ProductDatabase db = new ProductDatabase(getBaseContext());
                    db.deleteCartRow(String.valueOf(cartAdapter.cart.get(position).getCart_Id()));
                    cartAdapter.cart.remove(position);
                    cartAdapter.notifyItemRemoved(position);
                }
            };

}