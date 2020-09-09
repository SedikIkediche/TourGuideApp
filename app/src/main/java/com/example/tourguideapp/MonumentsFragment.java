package com.example.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MonumentsFragment extends Fragment {

    private View mView;
    private RecyclerView monumetsList;
    private MonumentsAdapter monumentsAdapter;

    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_monuments, container, false);

        monumetsList = mView.findViewById(R.id.monumentsList);

        ArrayList<MonumentItem> monumentItems = new ArrayList<>();
        monumentItems.add(new MonumentItem(R.drawable.constantine_the_roman_aqueduct, getResources().getString(R.string.monument_one_name)));
        monumentItems.add(new MonumentItem(R.drawable.the_roman_theater_in_guelma_city, getResources().getString(R.string.monument_two_name)));
        monumentItems.add(new MonumentItem(R.drawable.the_lambaesis_ruins, getResources().getString(R.string.monument_three_name)));
        monumentItems.add(new MonumentItem(R.drawable.the_tiddis_roman_ruins, getString(R.string.monument_four_name)));
        monumentItems.add(new MonumentItem(R.drawable.el_mansourah_city, getResources().getString(R.string.monument_five_name)));
        monumentItems.add(new MonumentItem(R.drawable.bordj_tamentfous_city, getResources().getString(R.string.monument_six_name)));

        monumentsAdapter = new MonumentsAdapter(monumentItems);

        monumetsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        monumetsList.setAdapter(monumentsAdapter);

        return mView;
    }
}
