package com.example.eldomarket;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;


public class HomeFragment extends Fragment {

    ExtendedFloatingActionButton fabSell;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        fabSell = (ExtendedFloatingActionButton) view.findViewById(R.id.fab_sell);
        fabSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SellItem.class));
            }
        });

        return view;
    }

}