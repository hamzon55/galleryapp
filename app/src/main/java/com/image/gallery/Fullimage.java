package com.image.gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Fullimage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullimage);

        Intent i = getIntent();

        int position =i.getExtras().getInt("id");
        ImageAdapter adapter =new ImageAdapter(this);

        ImageView imageView =(ImageView) findViewById(R.id.imageview);
        imageView.setImageResource(adapter.images[position]);
    }
}
