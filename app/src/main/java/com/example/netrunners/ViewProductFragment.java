package com.example.netrunners;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewProductFragment extends Fragment {

    ImageView productImage;
    TextView productName, productPrice, productStock;
    int id;

    public ViewProductFragment(int id) {
        this.id = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_product, container, false);

        productImage = view.findViewById(R.id.imageView_product);
        productName = view.findViewById(R.id.textView_name);
        productPrice = view.findViewById(R.id.textView_price);
        productStock = view.findViewById(R.id.textView_stock);

        productImage.setImageResource(MyData.getProduct(getActivity(), id).getImage());
        productName.setText(MyData.getProduct(getActivity(), id).getName());
        productPrice.setText(MyData.FormatNumber(Double.valueOf(String.valueOf(MyData.getProduct(getActivity(), id).getPrice()))));
        productStock.setText(String.valueOf(MyData.getProduct(getActivity(), id).getStock()));

        return view;
    }
}