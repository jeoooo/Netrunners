package com.example.netrunners;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class HomeScreenFragment_2 extends Fragment {

    ImageView prevButton, nextButton;
    Button button_psu, button_keyboards, button_computerMouse, button_monitors, button_headsets, button_printers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.home_screen_fragment2, container, false);

        nextButton = view.findViewById(R.id.imageView_next);
        prevButton = view.findViewById(R.id.imageView_prev);
        button_psu = view.findViewById(R.id.button_psu);
        button_keyboards = view.findViewById(R.id.button_keyboards);
        button_computerMouse = view.findViewById(R.id.button_computerMouse);
        button_monitors = view.findViewById(R.id.button_monitors);
        button_headsets = view.findViewById(R.id.button_headsets);
        button_printers = view.findViewById(R.id.button_printers);


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

        button_psu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_psu();
            }
        });

        button_keyboards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_keyboards();
            }
        });

        button_computerMouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_computerMouse();
            }
        });

        button_monitors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_monitors();
            }
        });

        button_headsets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_headsets();
            }
        });

        button_printers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_printers();
            }
        });

        return view;
    }

    public void setSpinner_psu() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 15);
        startActivity(intent);
    }

    public void setSpinner_keyboards() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 11);
        startActivity(intent);
    }

    public void setSpinner_computerMouse() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 19);
        startActivity(intent);
    }

    public void setSpinner_monitors() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 7);
        startActivity(intent);
    }

    public void setSpinner_headsets() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 21);
        startActivity(intent);
    }

    public void setSpinner_printers() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 13);
        startActivity(intent);
    }

}