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
public class PlacesFragment extends Fragment {

    private View mView;

    private RecyclerView recyclerView;
    private PlacesAdapter placesAdapter;

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_places, container, false);

        recyclerView = mView.findViewById(R.id.placesList);

        ArrayList<PlaceItem> placesList = new ArrayList<>();
        placesList.add(new PlaceItem(R.drawable.oran, getResources().getString(R.string.place_one_name), getResources().getString(R.string.place_one_description)));
        placesList.add(new PlaceItem(R.drawable.constantine, getResources().getString(R.string.place_two_name), getResources().getString(R.string.place_two_description)));
        placesList.add(new PlaceItem(R.drawable.tlemcen, getResources().getString(R.string.place_three_name), getResources().getString(R.string.place_three_description)));
        placesList.add(new PlaceItem(R.drawable.setif, getResources().getString(R.string.place_four_name), getResources().getString(R.string.place_four_description)));
        placesList.add(new PlaceItem(R.drawable.timgad, getResources().getString(R.string.place_five_name), getResources().getString(R.string.place_five_description)));
        placesList.add(new PlaceItem(R.drawable.bejaia, getResources().getString(R.string.place_six_name), getResources().getString(R.string.place_six_description)));

        placesAdapter = new PlacesAdapter(placesList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(placesAdapter);

        return mView;
    }
}
