package singledevapps.spotsoon.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import singledevapps.spotsoon.R;
import singledevapps.spotsoon.model.MediaModel;

/**
 * Created by prakash on 11/6/17.
 */
public class MediaAdapter extends RecyclerView.Adapter<MediaAdapter.MyViewHolder> {

    private Context mContext;
    private List<MediaModel> mediaList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,desc,time;
        public ImageView thumb;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
            time = (TextView) view.findViewById(R.id.time);
            thumb = (ImageView) view.findViewById(R.id.thumb);

        }
    }


    public MediaAdapter(Context mContext, List<MediaModel> mediaList) {
        this.mContext = mContext;
        this.mediaList = mediaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.media_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onViewAttachedToWindow(MyViewHolder holder) {
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        MediaModel media = mediaList.get(position);
        holder.title.setText(media.getTitle());
        holder.time.setText(media.getTime());
        holder.desc.setText(media.getDesc());
        holder.thumb.setImageDrawable(mContext.getResources().getDrawable(media.getThumb()));
       }

    @Override
    public int getItemCount() {
        return mediaList.size();
    }
}
 