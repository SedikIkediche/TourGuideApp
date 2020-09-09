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
public class HotelsFragment extends Fragment {

    private View mView;
    private RecyclerView hotelsList;
    private HotelsAdapter hotelsAdapter;

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_hotels, container, false);

        hotelsList = mView.findViewById(R.id.hotelsList);

        ArrayList<HotelItem> hotelItems = new ArrayList<>();

        hotelItems.add(new HotelItem(R.drawable.africa_nova_hotel, getResources().getString(R.string.hotel_one_name), getResources().getString(R.string.hotel_one_location), 3));
        hotelItems.add(new HotelItem(R.drawable.hotel_sidi_yahia, getResources().getString(R.string.hotel_two_name), getResources().getString(R.string.hotel_two_location), 3));
        hotelItems.add(new HotelItem(R.drawable.lamaraz_arts_hotel, getResources().getString(R.string.hotel_three_name), getResources().getString(R.string.hotel_three_location), 4));
        hotelItems.add(new HotelItem(R.drawable.az_hotel_zeralda, getResources().getString(R.string.hotel_four_name), getResources().getString(R.string.hotel_four_location), 4));
        hotelItems.add(new HotelItem(R.drawable.m_suite_hotel, getResources().getString(R.string.hotel_five_name), getResources().getString(R.string.hotel_five_location), 4));
        hotelItems.add(new HotelItem(R.drawable.ibis_alger_aeroport, getResources().getString(R.string.hotel_six_name), getResources().getString(R.string.hotel_six_location), 3));

        hotelsAdapter = new HotelsAdapter(hotelItems);
        hotelsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        hotelsList.setAdapter(hotelsAdapter);

        return mView;
    }
}
