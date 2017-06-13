package singledevapps.spotsoon.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import singledevapps.spotsoon.R;
import singledevapps.spotsoon.adapter.MediaAdapter;
import singledevapps.spotsoon.data.DummyData;
import singledevapps.spotsoon.helper.GenralHelper;
import singledevapps.spotsoon.model.MediaModel;


public class VideoFragment extends Fragment{
    private RecyclerView recyclerView;
    private MediaAdapter adapter;
    private List<MediaModel> mediaList;
    private MediaModel model;

    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_video, container, false);
                recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);

        mediaList = new ArrayList<>();
        adapter = new MediaAdapter(getContext(), mediaList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        DummyData.loadDummyData(mediaList,adapter);
        return rootView;
    }






}
