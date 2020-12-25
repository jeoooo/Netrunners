package com.example.netrunners;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    View temp; // For setOnCLickListener
    ArrayList<MyProduct> searchProducts;
    ArrayList<MyProduct> products;


    public MyAdapter(Context context, String category, String sort, String search) {
        this.context = context;
        if (sort.equals("low to high")) {
            this.searchProducts = MyData.getLowToHigh(category, context);
        } else if (sort.equals("high to low")) {
            this.searchProducts = MyData.getHighToLow(category, context);
        } else {
            this.searchProducts = MyData.getProducts(category, context);
        }

        getSearch(search.toLowerCase());

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.mini_view, parent, false);
        temp = view;
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.setIsRecyclable(false);
        holder.textView_name.setText(products.get(position).getName());
        holder.textView_price.setText(String.valueOf(products.get(position).getPrice()));
        holder.imageView.setImageResource(products.get(position).getImage());

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityViewProduct.class);
                intent.putExtra("Id", products.get(position).getId());
                context.startActivity(intent);
            }
        });
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

    public void getSearch(CharSequence charSequence) {
        String charString = charSequence.toString();
        if(charString.isEmpty()) {
            products = searchProducts;
        } else {
            ArrayList<MyProduct> searchList = new ArrayList<>();
            for(int j = 0; j < searchProducts.size(); j++) {
                if(searchProducts.get(j).getName().toLowerCase().contains(charSequence)) {
                    searchList.add(searchProducts.get(j));
                }
            }
            products = searchList;
        }
    }

}