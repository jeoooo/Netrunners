package com.example.netrunners;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {

    Context context;
    View temp;
    public ArrayList<SearchObject> search;

    public SearchAdapter(Context context) {
        ProductDatabase searchTable = new ProductDatabase(context);
        this.context = context;
        this.search = searchTable.getSearchList();
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.search_mini_view, parent, false);
        temp = view;
        return new SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, final int position) {
        holder.setIsRecyclable(false);
        holder.textView_search.setText(search.get(position).getSearch());

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(context, SearchResult.class);
                //intent.putExtra("search", String.valueOf(search.get(position).getSearch()));
                //context.startActivity(intent);
                SearchActivity.searchBar.setText(String.valueOf(search.get(position).getSearch()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return search.size();
    }

    public class SearchViewHolder extends RecyclerView.ViewHolder {

        TextView textView_search;

        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_search = itemView.findViewById(R.id.textView_search);
        }
    }

}
