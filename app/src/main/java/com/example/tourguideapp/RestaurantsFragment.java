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
public class RestaurantsFragment extends Fragment {

    private View mView;
    private RecyclerView restaurantsList;
    private RestaurantAdapter restaurantAdapter;

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_restaurants, container, false);

        restaurantsList = mView.findViewById(R.id.restaurantsList);

        ArrayList<RestaurantItem> restaurantItems = new ArrayList<>();
        restaurantItems.add(new RestaurantItem(R.drawable.le_bardo_resrtaurant, getResources().getString(R.string.restaurant_one_name), getResources().getString(R.string.restaurant_one_location), 4.5f));
        restaurantItems.add(new RestaurantItem(R.drawable.restaurant_el_boustene, getResources().getString(R.string.restaurant_two_name), getResources().getString(R.string.restaurant_two_location), 4));
        restaurantItems.add(new RestaurantItem(R.drawable.taj_mahal, getResources().getString(R.string.restaurant_three_name), getResources().getString(R.string.restaurant_three_location), 4));
        restaurantItems.add(new RestaurantItem(R.drawable.moulin_auberge, getResources().getString(R.string.restaurant_four_name), getResources().getString(R.string.restaurant_four_location), 4));
        restaurantItems.add(new RestaurantItem(R.drawable.diagonal_ice_cream_cafe, getResources().getString(R.string.restaurant_five_name), getResources().getString(R.string.restaurant_five_location), 5));
        restaurantItems.add(new RestaurantItem(R.drawable.la_palmeraie_restaurant, getResources().getString(R.string.restaurant_six_name), getResources().getString(R.string.restaurant_six_location), 4.5f));

        restaurantAdapter = new RestaurantAdapter(restaurantItems);

        restaurantsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantsList.setAdapter(restaurantAdapter);

        return mView;
    }
}
