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

public class DrinkFragment extends Fragment {

    public DrinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.academie, R.string.academie_title,
                R.drawable.academiedelabiere));
        places.add(new Place(R.string.resto1, R.string.resto1_title,
                R.drawable.restoparis1));
        places.add(new Place(R.string.resto2, R.string.resto2_title,
                R.drawable.restoparis2));

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

