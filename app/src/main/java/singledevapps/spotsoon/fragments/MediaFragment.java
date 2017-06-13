package singledevapps.spotsoon.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import singledevapps.spotsoon.R;
import singledevapps.spotsoon.adapter.ViewPagerAdapter;


public class MediaFragment extends Fragment{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView tabOne,tabTwo,tabThree;
    private List<Fragment> mFragmentList;
    private List<String> mFragmentTitleList;

    public MediaFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_media, container, false);
        mFragmentList = new ArrayList<>();
        mFragmentTitleList = new ArrayList<>();



        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        tabOne = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tabs, null);
        tabTwo = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tabs, null);
        tabThree = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tabs, null);

        setupViewPager(viewPager);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setupTabIcons(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return rootView;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(),mFragmentList,mFragmentTitleList);
        adapter.addFragment(new VideoFragment(), "Video");
        adapter.addFragment(new VideoFragment(), "Images");
        adapter.addFragment(new VideoFragment(), "Milestone");
        viewPager.setAdapter(adapter);
    }

    private void setupTabIcons(int posi) {

        tabOne.setText("VIDEOS");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.video, 0, 0);
        tabOne.setTextColor(getResources().getColor(R.color.darkGrey));
        tabLayout.getTabAt(0).setCustomView(tabOne);

        tabTwo.setText("IMAGES");
        tabTwo.setTextColor(getResources().getColor(R.color.darkGrey));
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.image, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        tabThree.setText("MILESTONE");
        tabThree.setTextColor(getResources().getColor(R.color.darkGrey));
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.milestone, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
        if(posi==0){
            tabOne.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.select_video, 0, 0);
        }
        else if(posi==1){
            tabTwo.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.select_image, 0, 0);
        }
        else if(posi==2){
            tabThree.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.select_milestone, 0, 0);
        }
        else {
            tabOne.setTextColor(getResources().getColor(R.color.colorAccent));
            tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.select_video, 0, 0);
        }

    }

}
