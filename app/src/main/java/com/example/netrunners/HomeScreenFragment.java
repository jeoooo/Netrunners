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

//

public class HomeScreenFragment extends Fragment {

    ImageView nextButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = (ViewGroup)inflater.inflate(R.layout.home_screen_fragment, container, false);

        nextButton = view.findViewById(R.id.imageView_next);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScreenActivity.openNextPager();
            }
        });

        return view;
    }

}