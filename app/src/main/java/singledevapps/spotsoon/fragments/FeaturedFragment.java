package singledevapps.spotsoon.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import singledevapps.spotsoon.R;

/**
 * Created by prakash on 12/6/17.
 */

public class FeaturedFragment extends Fragment {
    private static final String PAGE = "page";
    private int  mPage;


    public FeaturedFragment() {
        // Required empty public constructor
    }
    public static FeaturedFragment newInstance(int page) {
        FeaturedFragment frag = new FeaturedFragment();
        Bundle b = new Bundle();
        b.putInt(PAGE, page);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getArguments().containsKey(PAGE))
            throw new RuntimeException("Fragment must contain a \"" + PAGE + "\" argument!");
        mPage = getArguments().getInt(PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int layoutResId = R.layout.featured_fragment;

        View view = getActivity().getLayoutInflater().inflate(layoutResId, container, false);

        view.setTag(mPage);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
