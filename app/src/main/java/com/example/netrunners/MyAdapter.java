package com.example.netrunners;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Dialog myDialog;
    Context context;
    View temp; // For setOnCLickListener
    ArrayList<MyProduct> products;

    public MyAdapter(Context context, String category) {
        this.context = context;
        this.products = MyData.getProduct(category);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mini_view, parent, false);
        temp = view;
        myDialog = new Dialog(context);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.textView_name.setText(products.get(position).getName());
        holder.textView_price.setText(String.valueOf(products.get(position).getPrice()));
        holder.imageView.setImageResource(products.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView_name, textView_price;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_name = itemView.findViewById(R.id.textView);
            textView_price = itemView.findViewById(R.id.textView_price);
            imageView = itemView.findViewById(R.id.imageView4);
        }
    }
}