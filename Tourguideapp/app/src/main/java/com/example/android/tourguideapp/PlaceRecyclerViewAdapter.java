package com.example.android.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PB on 09/07/2017.
 */

public class PlaceRecyclerViewAdapter extends RecyclerView.Adapter<PlaceRecyclerViewAdapter.ViewHolder> {

    ArrayList<Place> mPlaces;


    public PlaceRecyclerViewAdapter(ArrayList<Place> places) {
        mPlaces = places;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Place place = mPlaces.get(position);

        holder.placeTitleTextView.setText(place.getTitleId());
        holder.descriptionTextView.setText(place.getDescriptionId());
        if (place.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.imageView.setImageResource(place.getImageId());
            // Make sure the view is visible
            holder.imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.imageView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView placeTitleTextView;
        TextView descriptionTextView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            placeTitleTextView = (TextView) itemView.findViewById(R.id.place_name_text_view);
            descriptionTextView = (TextView) itemView.findViewById(R.id.place_description_text_view);
            imageView = (ImageView) itemView.findViewById(R.id.place_image_view);
        }

    }
}
