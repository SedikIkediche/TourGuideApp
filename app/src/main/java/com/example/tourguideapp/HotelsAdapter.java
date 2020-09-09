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

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.HotelViewHolder> {

    private ArrayList<HotelItem> mHotelsList;

    public HotelsAdapter(ArrayList<HotelItem> hotelItems) {
        this.mHotelsList = hotelItems;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.hotel_list_item, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        holder.bind(mHotelsList.get(position));
    }

    @Override
    public int getItemCount() {
        return mHotelsList.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView hotelImage;
        TextView hotelName;
        TextView hotelLocation;
        RatingBar ratingBar;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);

            hotelImage = itemView.findViewById(R.id.hotelImage);
            hotelName = itemView.findViewById(R.id.hotelName);
            hotelLocation = itemView.findViewById(R.id.hotelLocation);
            ratingBar = itemView.findViewById(R.id.hotelRatingBar);
        }

        public void bind(HotelItem hotelItem) {

            Glide.with(itemView.getContext()).load(hotelItem.getHotelImage()).into(hotelImage);
            hotelName.setText(hotelItem.getHotelName());
            hotelLocation.setText(hotelItem.getHotelLocation());
            ratingBar.setRating(hotelItem.getHotelRating());
            ratingBar.setNumStars(hotelItem.getHotelRating());
        }

    }
}