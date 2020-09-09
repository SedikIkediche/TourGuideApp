package com.example.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private ArrayList<RestaurantItem> mRestaurantItems;

    public RestaurantAdapter(ArrayList<RestaurantItem> restaurantItems) {
        this.mRestaurantItems = restaurantItems;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.restaurant_list_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        holder.bind(mRestaurantItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mRestaurantItems.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView restaurantImage;
        TextView restaurantName;
        TextView restaurantLocation;
        RatingBar ratingBar;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            restaurantImage = itemView.findViewById(R.id.restaurantImage);
            restaurantName = itemView.findViewById(R.id.restaurantName);
            restaurantLocation = itemView.findViewById(R.id.restaurantLocation);
            ratingBar = itemView.findViewById(R.id.restaurantRatingBar);
        }

        public void bind(RestaurantItem restaurantItem) {

            Glide.with(itemView.getContext()).load(restaurantItem.getmRestaurantImage()).into(restaurantImage);
            restaurantName.setText(restaurantItem.getmRestaurantName());
            restaurantLocation.setText(restaurantItem.getmRestaurantLocation());
            ratingBar.setRating(restaurantItem.getmRestaurantRating());
        }
    }
}
