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


public class HomeScreenFragment_3 extends Fragment {

    ImageView prevButton;
    Button button_externalStorage, button_chair, button_computerDesks, button_cables, button_projector, button_router;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.home_screen_fragment3, container, false);

        prevButton = view.findViewById(R.id.imageView_prev);
        button_externalStorage = view.findViewById(R.id.button_externalStorage);
        button_chair = view.findViewById(R.id.button_chair);
        button_computerDesks = view.findViewById(R.id.button_computerDesks);
        button_cables = view.findViewById(R.id.button_cables);
        button_projector = view.findViewById(R.id.button_projector);
        button_router = view.findViewById(R.id.button_router);

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScreenActivity.openPrevPager();
            }
        });

        button_externalStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_externalStorage();
            }
        });

        button_chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_chair();
            }
        });

        button_computerDesks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_computerDesks();
            }
        });

        button_cables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cables();
            }
        });

        button_projector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_projector();
            }
        });

        button_router.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_router();
            }
        });

        return view;
    }

    public void setSpinner_externalStorage() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 27);
        startActivity(intent);
    }

    public void setSpinner_chair() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 33);
        startActivity(intent);
    }

    public void setSpinner_computerDesks() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 17);
        startActivity(intent);
    }

    public void setSpinner_cables() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 29);
        startActivity(intent);
    }

    public void setSpinner_projector() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 35);
        startActivity(intent);
    }

    public void setSpinner_router() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 9);
        startActivity(intent);
    }

}