package com.prihanofficial.rabbitandroidlibrary.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.prihanofficial.rabbit.helpers.Rabbit;
import com.prihanofficial.rabbitandroidlibrary.R;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.iv_imageView);

        Bitmap bitmap1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.sample_test_image);

        Rabbit.setContext(this)
                .setBitMap(bitmap1)
                .setScale(0.7f)
                .setRaius(0.4f)
                .setConstarst(0.9f)
                .setBrightnes(0.9f)
                .build();

        Rabbit.getModifiedRabbitBitmap();
        imageView.setImageBitmap(Rabbit.getModifiedRabbitBitmap());
    }
}
