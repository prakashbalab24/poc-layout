package singledevapps.spotsoon.data;

import java.util.List;

import singledevapps.spotsoon.R;
import singledevapps.spotsoon.adapter.MediaAdapter;
import singledevapps.spotsoon.helper.GenralHelper;
import singledevapps.spotsoon.model.MediaModel;

/**
 * Created by prakash on 13/6/17.
 */

public class DummyData {
    private static int[] thumbs ={R.drawable.one,R.drawable.two,R.drawable.three};
    public static void loadDummyData(List<MediaModel> mediaList, MediaAdapter adapter){
        MediaModel mediaModel;
        for (int i=0;i<=10;i++){
            int rand = GenralHelper.randomNum();
            mediaModel = new MediaModel("Dummy "+i,"Uploaded "+i+ " hours ago","Description of the "+i+" video here.",thumbs[rand]);
            mediaList.add(mediaModel);
        }
        adapter.notifyDataSetChanged();
    }
}
