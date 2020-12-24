package com.example.netrunners;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewProductDetailsFragment extends Fragment {

    TextView textView_description;
    int id;

    public ViewProductDetailsFragment(int id) {
        this.id = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_porduct_details, container, false);

        textView_description = view.findViewById(R.id.textView_description);

        textView_description.setText(MyData.getProduct(getActivity(), id).getDescription());

        return view;
    }
}