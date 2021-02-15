package com.zerogravityapp.freehandworkout_loseweightin30days.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.zerogravityapp.freehandworkout_loseweightin30days.R;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private CardView freeHandCard,diettips,ketocard;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        freeHandCard=root.findViewById(R.id.freehandexercisecard);
        diettips=root.findViewById(R.id.diettips);
        ketocard=root.findViewById(R.id.ketocard);
        freeHandCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),FreeHandExercises.class);
                startActivity(intent);
            }
        });

        diettips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),DietTips.class);
                startActivity(intent);
            }
        });

        ketocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),ketoPdfViewActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }
}