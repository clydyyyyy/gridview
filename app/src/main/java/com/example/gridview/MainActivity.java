package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    int[] images = {R.drawable.zelda1,R.drawable.zelda2,R.drawable.zelda3,R.drawable.zelda4,R.drawable.zelda5,R.drawable.zelda6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid);
        gridView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return images.length;
            }

            @Override
            public Object getItem(int i) {
                return images[i];
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                ImageView imageView = new ImageView( MainActivity.this);
                imageView.setImageResource(images[i]);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(500,1180));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

                return imageView;
            }


        });
    }
}