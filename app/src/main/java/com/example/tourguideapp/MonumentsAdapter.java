package com.example.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class MonumentsAdapter extends RecyclerView.Adapter<MonumentsAdapter.MonumentViewHolder> {


    private ArrayList<MonumentItem> mMonumentItems;

    public MonumentsAdapter(ArrayList<MonumentItem> monumentItems) {
        this.mMonumentItems = monumentItems;
    }

    @NonNull
    @Override
    public MonumentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.monument_list_item, parent, false);
        return new MonumentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonumentViewHolder holder, int position) {
        holder.bind(mMonumentItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mMonumentItems.size();
    }

    public class MonumentViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView monumentImage;
        TextView monumentName;

        public MonumentViewHolder(@NonNull View itemView) {
            super(itemView);

            monumentImage = itemView.findViewById(R.id.monumentImage);
            monumentName = itemView.findViewById(R.id.monumentName);
        }

        public void bind(MonumentItem monumentItem) {
            Glide.with(itemView.getContext()).load(monumentItem.getMonumentImage()).into(monumentImage);
            monumentName.setText(monumentItem.getMonumentName());
        }
    }
}
