package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by PB on 09/07/2017.
 */

public class AroundFragment extends Fragment {

    public AroundFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.name_Paris, R.string.Paris_title,
                R.drawable.paris_france_logo));
        places.add(new Place(R.string.paris_plage, R.string.argu_p_p,
                R.drawable.paris_plage));
        places.add(new Place(R.string.shopping, R.string.argu_shopping,
                R.drawable.shopping_paris));

        PlaceRecyclerViewAdapter adapter = new PlaceRecyclerViewAdapter(places);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}