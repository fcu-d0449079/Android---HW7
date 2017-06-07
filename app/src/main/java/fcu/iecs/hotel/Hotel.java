package fcu.iecs.hotel;

import android.graphics.Bitmap;

/**
 * Created by Zhuang on 2017/6/6.
 */


public class Hotel {
    private Bitmap imgUrl;

    public Bitmap getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Bitmap imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String add;

    private String name;
}
