package com.example.netrunners;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCartActivity extends AppCompatActivity {

    ImageView back;
    TextView back_2, button_checkOut;
    static TextView textView_total;
    RecyclerView recyclerView;
    CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        back = findViewById(R.id.imageView_back);
        back_2 = findViewById(R.id.textView_back);
        recyclerView = findViewById(R.id.recyclerView);
        textView_total = findViewById(R.id.textView_total);
        button_checkOut = findViewById(R.id.button_checkOut);

        getTotal(this);

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

        button_checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderSummaryActivity();
            }
        });

    }

    public void openOrderSummaryActivity() {
        Intent intent = new Intent(this, OrderSummaryActivity.class);
        startActivity(intent);
    }


    public void openHomeScreenActivity() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    // Sets the total of displayed on Cart Activity
    public static void getTotal(Context context) {
        ArrayList<MyProduct> allCart = MyData.getAllCartProduct(context);
        int total = 0;
        for(int j = 0; j < allCart.size(); j ++) {
            total += allCart.get(j).getPrice() * allCart.get(j).getQuantity();
        }
        textView_total.setText(MyData.FormatNumber(Double.valueOf(String.valueOf(total))));
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
                    getTotal(getBaseContext());
                }
            };

}