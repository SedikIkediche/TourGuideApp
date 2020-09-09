package com.example.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder> {

    private List<PlaceItem> mPlacesList;

    public PlacesAdapter(List<PlaceItem> placesList) {
        this.mPlacesList = placesList;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.places_list_item, parent, false);
        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder holder, int position) {
        holder.bind(mPlacesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mPlacesList.size();
    }

    public class PlacesViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView placeImage;
        TextView placeName;
        TextView placeDescription;

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.placeImage);
            placeName = itemView.findViewById(R.id.placeName);
            placeDescription = itemView.findViewById(R.id.placeDescription);
        }

        public void bind(PlaceItem placeItem) {
            Glide.with(itemView.getContext()).load(placeItem.getmPlaceImage()).into(placeImage);
            placeName.setText(placeItem.getmPlaceName());
            placeDescription.setText(placeItem.getmPlaceDescription());
        }
    }
}
