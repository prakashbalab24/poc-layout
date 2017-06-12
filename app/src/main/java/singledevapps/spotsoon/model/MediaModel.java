package singledevapps.spotsoon.model;

/**
 * Created by prakash on 11/6/17.
 */

public class MediaModel {
    private String title;
    private String desc;
    private String time;
    private int thumb;

    public MediaModel(String title, String desc, String time,int thumb){
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }
}
