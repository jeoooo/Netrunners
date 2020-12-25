package com.example.netrunners;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    Context context;
    View temp; // For setOnCLickListener
    public static ArrayList<MyProduct> cart;

    public CartAdapter(Context context, ArrayList<MyProduct> cart) {
        this.context = context;
        this.cart = cart;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cart_mini_view, parent, false);
        temp = view;
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, final int position) {
        holder.setIsRecyclable(false);
        holder.textView_name.setText(cart.get(position).getName());
        holder.textView_price.setText(String.valueOf(cart.get(position).getPrice()));
        holder.textView_quantity.setText(String.valueOf(cart.get(position).getQuantity()));
        holder.imageView.setImageResource(cart.get(position).getImage());

        holder.subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cart.get(position).getQuantity() > 1) {
                    ProductDatabase cartDB = new ProductDatabase(context);
                    int quantity = cart.get(position).getQuantity() - 1;
                    cartDB.updateCart(String.valueOf(cart.get(position).getId()), String.valueOf(quantity));
                    cart.get(position).setQuantity(quantity);
                    updateData();
                }
            }
        });

        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cart.get(position).getQuantity() < 10) {
                    ProductDatabase cartDB = new ProductDatabase(context);
                    int quantity = cart.get(position).getQuantity() + 1;
                    cartDB.updateCart(String.valueOf(cart.get(position).getId()), String.valueOf(quantity));
                    cart.get(position).setQuantity(quantity);
                    updateData();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return cart.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {

        TextView textView_name, textView_price, textView_quantity;
        ImageView imageView;
        Button subtract, add;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_name = itemView.findViewById(R.id.textView_name);
            textView_price = itemView.findViewById(R.id.textView_price);
            textView_quantity = itemView.findViewById(R.id.textView_quantity);
            imageView = itemView.findViewById(R.id.imageView_productImage);
            subtract = itemView.findViewById(R.id.button_subtract);
            add = itemView.findViewById(R.id.button_add);
        }
    }

    public void updateData() {
        notifyDataSetChanged();
    }

}
