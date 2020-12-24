package com.example.netrunners;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class HomeScreenFragment_2 extends Fragment {

    ImageView prevButton, nextButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.home_screen_fragment2, container, false);

        nextButton = view.findViewById(R.id.imageView_next);
        prevButton = view.findViewById(R.id.imageView_prev);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScreenActivity.openNextPager();
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScreenActivity.openPrevPager();
            }
        });

        return view;
    }

}