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

//

public class HomeScreenFragment extends Fragment {

    ImageView nextButton;
    Button button_cpu, button_gpu, button_motherboards, button_pcCases, button_ram, button_storageDrive;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = (ViewGroup)inflater.inflate(R.layout.home_screen_fragment, container, false);

        nextButton = view.findViewById(R.id.imageView_next);
        button_cpu = view.findViewById(R.id.button_cpu);
        button_gpu = view.findViewById(R.id.button_gpu);
        button_motherboards = view.findViewById(R.id.button_motherboards);
        button_pcCases = view.findViewById(R.id.button_pcCases);
        button_ram = view.findViewById(R.id.button_ram);
        button_storageDrive = view.findViewById(R.id.button_storageDrive);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScreenActivity.openNextPager();
            }
        });

        button_cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_cpu();
            }
        });

        button_gpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_gpu();
            }
        });

        button_motherboards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_motherboards();
            }
        });

        button_pcCases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_pcCases();
            }
        });

        button_ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_ram();
            }
        });

        button_storageDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSpinner_storageDrive();
            }
        });

        return view;
    }

    public void setSpinner_cpu() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 37);
        startActivity(intent);
    }

    public void setSpinner_gpu() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 5);
        startActivity(intent);
    }

    public void setSpinner_motherboards() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 3);
        startActivity(intent);
    }

    public void setSpinner_pcCases() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 25);
        startActivity(intent);
    }

    public void setSpinner_ram() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 23);
        startActivity(intent);
    }

    public void setSpinner_storageDrive() {
        Intent intent = new Intent(getActivity(), SearchResult.class);
        intent.putExtra("selectedSpinner", 31);
        startActivity(intent);
    }

}