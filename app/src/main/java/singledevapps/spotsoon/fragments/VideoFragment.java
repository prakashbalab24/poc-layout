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
import singledevapps.spotsoon.helper.GenralHelper;
import singledevapps.spotsoon.model.MediaModel;


public class VideoFragment extends Fragment{
    private RecyclerView recyclerView;
    private MediaAdapter adapter;
    private List<MediaModel> mediaList;
    private MediaModel model;
    private int[] thumbs ={R.drawable.one,R.drawable.two,R.drawable.three};

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

        loadDummyData();
        return rootView;
    }

    private void loadDummyData(){
        MediaModel mediaModel;
        for (int i=0;i<=10;i++){
            int rand = GenralHelper.randomNum();
            mediaModel = new MediaModel("Dummy "+i,"Uploaded "+i+ " hours ago","Description of the "+i+" video here.",thumbs[rand]);
            mediaList.add(mediaModel);
        }
        adapter.notifyDataSetChanged();
    }




}
