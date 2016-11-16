package com.image.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by hamza on 14/11/2016.
 */

public class ImageAdapter extends BaseAdapter {
  private Context context;

    public Integer[] images = {
            R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,
            R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,
            R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,
            R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,

    };

    public ImageAdapter (Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView =new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
